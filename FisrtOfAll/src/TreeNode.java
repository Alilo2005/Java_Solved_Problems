import java.util.ArrayList;
import java.util.List;
public class TreeNode {

    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
    public static void preorder(TreeNode root){
        if(root != null){
            System.out.println(root.getVal());
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }
    public static void inorder(TreeNode root){
        if(root != null){
            inorder(root.getLeft());
            System.out.println(root.getVal());
            inorder(root.getRight());
        }
    }
    public static void postorder(TreeNode root){
        if(root != null){
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.println(root.getVal());
        }
    }
    public static boolean search(TreeNode root,int val) {
        if (root == null) return false;
        if (val == root.getVal()) return true;
        return val < root.getVal() ? search(root.getLeft(), val) : search(root.getRight(), val);
    }
    public static boolean insert(TreeNode root, int val) {
        if (root == null) return false;

        if (val < root.getVal()) {
            if (root.getLeft() == null) {
                root.setLeft(new TreeNode(val));
                return true;
            } else {
                return insert(root.getLeft(), val);
            }
        } else if (val > root.getVal()) {
            if (root.getRight() == null) {
                root.setRight(new TreeNode(val));
                return true;
            } else {
                return insert(root.getRight(), val);
            }
        }

        return false;
    }

    public static TreeNode delete(TreeNode root, int val) {
        if (root == null) return root;

        if (val < root.getVal()) {
            root.setLeft(delete(root.getLeft(), val));
        } else if (val > root.getVal()) {
            root.setRight(delete(root.getRight(), val));
        } else {
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }

            root.setVal(minValue(root.getRight()));

            root.setRight(delete(root.getRight(), root.getVal()));
        }

        return root;
    }

    private static int minValue(TreeNode root) {
        int minValue = root.getVal();
        while (root.getLeft() != null) {
            minValue = root.getLeft().getVal();
            root = root.getLeft();
        }
        return minValue;
    }

    public static TreeNode balance(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        inorderToList(root, nodes);
        return sortedListToBST(nodes, 0, nodes.size() - 1);
    }

    private static void inorderToList(TreeNode root, List<Integer> nodes) {
        if (root == null) return;
        inorderToList(root.getLeft(), nodes);
        nodes.add(root.getVal());
        inorderToList(root.getRight(), nodes);
    }

    private static TreeNode sortedListToBST(List<Integer> nodes, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nodes.get(mid));

        node.setLeft(sortedListToBST(nodes, start, mid - 1));
        node.setRight(sortedListToBST(nodes, mid + 1, end));

        return node;
    }

    public static void main(String[] args) {
        // 1. Create a new tree
        TreeNode root = new TreeNode(50);

        // 2. Insert elements into the tree
        insert(root, 30);
        insert(root, 20);
        insert(root, 40);
        insert(root, 70);
        insert(root, 60);
        insert(root, 80);

        // 3.1. Print preorder traversal of the initial tree
        System.out.println("Preorder traversal of the initial tree:");
        preorder(root);
        System.out.println("\n-----------------------------");
        // 3.1. Print inorder traversal of the initial tree
        System.out.println("Inorder traversal of the initial tree:");
        inorder(root);
        System.out.println("\n-----------------------------");
        // 3.3. Print postorder traversal of the initial tree
        System.out.println("Postorder traversal of the initial tree:");
        postorder(root);
        System.out.println("\n-----------------------------");

        // 4. Delete a node
        System.out.println("Deleting node 20:");
        root = delete(root, 20); // deleting node 20
        inorder(root);
        System.out.println("\n-----------------------------");

        System.out.println("Deleting node 30:");
        root = delete(root, 30); // deleting node 30
        inorder(root);
        System.out.println("\n-----------------------------");

        System.out.println("Deleting node 50:");
        root = delete(root, 50); // deleting root node 50
        inorder(root);
        System.out.println("\n-----------------------------");

        // 5. Balance the tree
        System.out.println("Balancing the tree:");
        root = balance(root);
        inorder(root);
        System.out.println("\n-----------------------------");

        // 6. Check if a value exists in the tree
        boolean found = search(root, 60);
        System.out.println("Is 60 in the tree? " + found);
    }
}


