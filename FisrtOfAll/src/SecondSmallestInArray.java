import java.awt.*;

public class SecondSmallestInArray {
    public static void main(String[] args){
        int [] arr = new int[]{1,1,1,1};
        System.out.println(SecondSmallestArray(arr));
    }
    public static int SecondSmallestArray(int[] arr){
        Point p = new Point();
        boolean flag = false;
        p.x = arr[0];
        for(int i = 0;i< arr.length - 1;i++){
            p.x = Math.min(arr[i],p.x);
            if (arr[i] > p.x && !flag) {
                p.y = arr[i];
                flag = true;
            }
        }
        if(!flag){
            System.out.printf("Not Found!\n");
            return 99999999;
        }
        for(int i = 0;i< arr.length - 1;i++){
            if(arr[i] != p.x){
                p.y = Math.min(arr[i],p.y);
            }
        }
        return p.y;
    }
}
