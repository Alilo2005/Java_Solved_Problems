import java.util.ArrayList;
import java.util.Comparator;

public class reverseOrder {
    /*
    Problem: Reverse Order
Description: Write a function that takes an ArrayList of integers as input and rearranges the elements in reverse order.
     */
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(40);
        arr.add(20);
        arr.add(10);
        arr.add(5);
        arr.add(16);
        arr.add(8);
        arr.add(4);
        arr.add(2);
        arr.add(1);
        sortReversed(arr);
        System.out.println(arr);
    }
    public static void sortReversed(ArrayList<Integer> arr){
        arr.sort(Comparator.reverseOrder());
    }
}
