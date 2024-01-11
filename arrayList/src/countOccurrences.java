import java.util.ArrayList;

public class countOccurrences {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ali");
        arr.add("Iman");
        arr.add("Amel");
        arr.add("Ahmed");
        arr.add("Ali");

        System.out.println(countOccurrence(arr,"Amel"));
    }
    /*
    Problem: Count Occurrences
Description: Write a function that takes an ArrayList of strings as input and a target word.
 The function should count the number of occurrences of the target word in the list and return the count.
     */
    public static int countOccurrence(ArrayList<String> arr,String target){
        int i = 0;
      for(String word : arr){
          if(word.equals(target)){
              i++;
          }
      }
        return i;
    }
}
