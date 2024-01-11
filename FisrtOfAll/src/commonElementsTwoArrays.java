public class commonElementsTwoArrays {
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,4,8,16,32,64,128,23};
        int[] arr2 = new int[]{1,4,16,64,2561,55,23};
        findDuplicates(arr1,arr2);
    }
    public static void findDuplicates(int[] arr1, int[] arr2) {
        int[] hashTable = new int[100000];
        for (int j : arr1) {
            hashTable[j]++;
        }
        for (int j : arr2) {
            hashTable[j]++;
        }
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == 2) {
                System.out.printf("%d\t", i);
            }
        }
    }
}

