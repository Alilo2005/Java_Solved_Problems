public class frequencyOfEachElement {
    public static int frequency(int[] arr,int target) {
        int count = 0;
        for(int i = 0 ;i<arr.length;i++){
            if(target == arr[i]){
                count ++;
            }
        }
        return count ;
    }
    public static void main(String[] args){
        int [] arr = new int[]{10,5,10,6,55,10,-55};
        System.out.printf("%d",frequency(arr,-55));
    }
}
