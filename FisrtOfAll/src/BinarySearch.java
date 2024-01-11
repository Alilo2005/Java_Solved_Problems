public class BinarySearch {
public static int binarySearch(int[] arr,int val ){
    int i = 0 , j = arr.length - 1, m;
    while (i<=j){
        m = (i+j)/2;
        if(arr[m]==val){
            return m;
        } else if (arr[m] < val) {
            i = m + 1;
        }else {
            j = m - 1;
        }
    }
    return -1;
}
public static void main(String[] args){
    int[] arr = new int[]{-1,5,7,9,99};
    System.out.println(binarySearch(arr,-1));
}

}
