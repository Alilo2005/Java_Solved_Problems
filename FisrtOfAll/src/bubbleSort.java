public class bubbleSort {
    public static void main(String[] args){
        int[] arr = new int[]{1,5,4,8,9,3,88,99,55,77,88,99,88,7};
        bubble(arr);
        for (int j : arr) {
            System.out.printf("%d\t", j);
        }
    }
    public static void bubble(int[] arr){
        boolean notSorted = true;
        while(notSorted){
            notSorted = false;
            for(int i = 0;i< arr.length -1 ;i++){
                if(arr[i+1]<arr[i]){
                    arr[i+1] = arr[i+1]+arr[i];
                    arr[i] = arr[i+1]-arr[i];
                    arr[i+1] = arr[i+1]-arr[i];
                    notSorted = true;
                }
            }
        }
    }
}
