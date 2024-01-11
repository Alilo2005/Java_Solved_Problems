public class AverageOfArray {
    public static void main(String[] args){
        long[] arr = new long[]{1, 5, 99, 88, 77, 6, 55, 4, 77, 8, 1};
        System.out.println(AverageArray(arr));
    }
    public static double AverageArray(long[] arr){
        if(arr.length == 0){
            return 0 ;
        }
        long sum = 0 ;
        for(int i = 0;i< arr.length;i++){
            sum+=arr[i];
        }
        return (double)sum / (double) arr.length ;
    }
}
