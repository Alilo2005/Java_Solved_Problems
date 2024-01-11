import java.util.ArrayList;
import java.util.Random;

public class searchThenReplace {
    /*
    Problem: Search and Replace
Description: Write a function that takes an ArrayList of strings as input and a target word.
 The function should search for the target word in the list and replace all occurrences with a specified replacement word.
     */
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("potato");
        arr.add("banana");
        arr.add("apple");
        arr.add("potato");
        arr.add("potato");

        searchAndReplace(arr,"potato","orange");
        System.out.println(arr);
    }
    public static void searchAndReplace(ArrayList<String> arr, String target,String shot) {
        for (String word : arr) {
            if (word.equals(target)) {
                arr.set(arr.indexOf(word),shot);
            }
        }
    }
}
