import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(16);
        arr.add(8);
        arr.add(4);
        arr.add(2);
        arr.add(1);

        arr.add(6);
        arr.add(3);
        arr.add(7);
        arr.add(22);
        arr.add(11);
        arr.add(34);
        arr.add(17);
        arr.add(52);
        arr.add(26);
        arr.add(13);
        arr.add(40);
        arr.add(20);
        arr.add(10);
        arr.add(5);
        arr.add(16);
        arr.add(8);
        arr.add(4);
        arr.add(2);
        arr.add(1);
        removeDup(arr);
        System.out.println(arr);
    }
    /*
    Problem: Remove Duplicates
 Description: Write a function that takes an ArrayList of integers as input and removes any duplicate elements,
 keeping only the unique elements in the list.
     */
    public static void removeDup(ArrayList<Integer> arr){
        HashSet<Integer> uniqueSet = new HashSet<>(); //HashSet provide that all the elements are uniques
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(Integer num : arr){
            if(uniqueSet.add(num)){ //if we can add the element to the HashSet then it's not duplicated
                uniqueList.add(num); //in the case we add it to our list
            }
        }
        arr.clear();
        arr.addAll(uniqueList); //finally,we add all the elements in the uniqueList to our returned ArrayList
    }
}
