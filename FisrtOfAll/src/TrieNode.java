import java.util.HashMap;

public class TrieNode {
    public HashMap<Character, TrieNode> children;
    public int wordCount;

    public TrieNode() {
        this.children = new HashMap<>();
        this.wordCount = 0;
    }

    static void insert(TrieNode root, String key) {
        TrieNode currentNode = root;

        for (char c : key.toCharArray()) {
            currentNode = currentNode.children.computeIfAbsent(c, k -> new TrieNode());
        }

        currentNode.wordCount++;
    }

    public static boolean isPrefixExist(TrieNode root, String key) {
        TrieNode currentNode = root;

        for (char c : key.toCharArray()) {
            currentNode = currentNode.children.get(c);
            if (currentNode == null) return false;
        }

        return true;
    }

    static boolean search(TrieNode root, String key) {
        TrieNode currentNode = root;

        for (char c : key.toCharArray()) {
            currentNode = currentNode.children.get(c);
            if (currentNode == null) return false;
        }

        return currentNode.wordCount > 0;
    }

    static boolean delete(TrieNode root, String key) {
        return key != null && search(root, key) && deleteRecursively(root, key, 0);
    }

    private static boolean deleteRecursively(TrieNode currentNode, String key, int depth) {
        if (currentNode == null) {
            return false;
        }

        if (depth == key.length()) {
            if (currentNode.wordCount > 0) {
                currentNode.wordCount--;
                return currentNode.children.isEmpty();
            }
            return false;
        }

        char currentChar = key.charAt(depth);
        TrieNode childNode = currentNode.children.get(currentChar);
        if (childNode == null) return false;

        boolean shouldDeleteCurrentNode = deleteRecursively(childNode, key, depth + 1);

        if (shouldDeleteCurrentNode) {
            currentNode.children.remove(currentChar);
            return currentNode.children.isEmpty() && currentNode.wordCount == 0;
        }

        return false;
    }

    public static void printTrie(TrieNode root) {
        printTrieHelper(root, "");
    }

    private static void printTrieHelper(TrieNode currentNode, String currentWord) {
        // If the current node represents the end of a word, print it
        if (currentNode.wordCount > 0) {
            System.out.println(currentWord);
        }

        // Continue the traversal if the current node has children
        for (HashMap.Entry<Character, TrieNode> entry : currentNode.children.entrySet()) {
            char nextChar = entry.getKey();
            TrieNode nextNode = entry.getValue();
            printTrieHelper(nextNode, currentWord + nextChar);
        }
    }



    public static void main(String[] args) {
        TrieNode trieRoot = new TrieNode();
        insert(trieRoot, "hello");
        insert(trieRoot, "world");
        insert(trieRoot, "hell");
        System.out.println("#######################");
        System.out.println(search(trieRoot, "hello"));  // true
        System.out.println(search(trieRoot, "world"));  // true
        System.out.println(search(trieRoot, "hell"));   // true
        System.out.println("#######################");
        System.out.println(isPrefixExist(trieRoot,"he")); //true
        System.out.println("#######################");
        printTrie(trieRoot);
        System.out.println("#######################");
        System.out.println(delete(trieRoot, "hell"));
        System.out.println(delete(trieRoot, "hella"));
        System.out.println(search(trieRoot, "hell"));   // false
        System.out.println("#######################");
        printTrie(trieRoot);
    }
}
