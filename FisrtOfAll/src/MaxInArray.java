public class MaxInArray {
    public static void main(String[] args){
        long [] arr = {1,55,-999,66,55,13,7};
        System.out.println(MaxArray(arr));
    }
    public static long MaxArray(long[] arr){
        long High = -99999999;
        for(int i = 0 ;i< arr.length;i++){
         High = Math.max(High,arr[i]);
        }
        return High;
    }
}
