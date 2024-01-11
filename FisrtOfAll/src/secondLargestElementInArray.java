
import java.awt.Point;
public class secondLargestElementInArray {
    public static int secondLargest(int [] arr){
        Point p = new Point();
        p.x = arr[0];
        p.y = -9999999; //error value
        for(int i = 1 ;i< arr.length;i++){
            p.x = Math.max(arr[i], p.x);
        }
        for(int i = 0;i< arr.length;i++){
            if (arr[i] != p.x) {
               p.y = Math.max(arr[i],p.y);
            }
        }
        return p.y;
    }
    public static void main(String[] args){
        int [] arr = new int[]{5};
        System.out.printf("%d",secondLargest(arr));
    }
}
