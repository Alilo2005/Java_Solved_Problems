import java.util.ArrayList;
import java.util.Comparator;
/*
Problem: Sorting
Description: Write a function that takes an ArrayList of strings as input and sorts them in ascending order alphabetically.
 */

public class sortAlphabetically {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ali mahdi");
        arr.add("ahmed hamid");
        arr.add("amel iman");
        arr.add("islam salem");
        sortAlpha(arr);
        System.out.println(arr);
    }
    public static void sortAlpha(ArrayList<String> arr){
        arr.sort(Comparator.naturalOrder());
    }
}
