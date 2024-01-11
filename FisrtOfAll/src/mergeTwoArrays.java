public class mergeTwoArrays {
    public static void merge(int[] arr1,int[] arr2,int[] arrMerged){
        int i = 0 , j = 0 , k = 0;
       while(i<arr1.length && j<arr2.length){
           if (arr1[i] <= arr2[j]) {
               arrMerged[k] = arr1[i];
               i++;
           }
           else{
               arrMerged[k] = arr2[j];
               j++;
           }
           k++;
       }
        while(i<arr1.length){
            arrMerged[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arrMerged[k] = arr2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,4,8,16,32};
        int[] arr2 = new int[]{1,3,9,27,81,243};
        int[] arrMerged = new int[arr1.length+arr2.length];
        merge(arr1,arr2,arrMerged);
        for(int i = 0; i < arr1.length+arr2.length; i++){
            System.out.println(arrMerged[i]);
        }
    }
}
