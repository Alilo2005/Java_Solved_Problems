import java.util.ArrayList;
import java.util.Comparator;

public class mergeTwoLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(), arr2 = new ArrayList<>(), arrMerged = new ArrayList<>();
        arr1.add(1);
        arr1.add(10);
        arr1.add(26);
        arr1.add(33);
        arr1.add(55);

        arr2.add(5);
        arr2.add(7);
        arr2.add(45);
        arr2.add(99);

        merge(arr1, arr2, arrMerged);

        System.out.println(arrMerged);

    }

    /*
    Problem: Merge Lists
Description: Write a function that takes two ArrayLists of integers as input and merges them into a single sorted ArrayList
 in ascending order.
     */
    public static void merge(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arrMerged) {
        arrMerged.addAll(arr1);
        arrMerged.addAll(arr2);
        arrMerged.sort(Comparator.naturalOrder());
    }
}

