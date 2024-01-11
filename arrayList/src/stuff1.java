import java.util.ArrayList;

public class stuff1 {
    public static void main (String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(16);
        arr.add(15);
        for(Integer i=0;i<16;i++){
            arr.add(i);
        }
        System.out.println(sumEven(arr));
    }

    public static Integer sumEven(ArrayList<Integer> arr){
        Integer sum  = 0;
        for(Integer i : arr){
           if(i%2==0){
               sum += arr.get(i);
           }
        }
        return sum;
    }
}
