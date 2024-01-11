import java.util.ArrayList;

public class ReverseLinkedList {
    public static ArrayList<Integer> reverseList(ArrayList<Integer> arrayList){
        ArrayList<Integer> arrayListReversed = new ArrayList<>();
        for (int i = arrayList.size() - 1 ; i != -1; i--) {
            Integer elem = arrayList.get(i);
            arrayListReversed.add(elem);
        }
        return arrayListReversed;
    }
    public static void main (String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(16);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(1);
        System.out.println(arrayList);
        System.out.println(reverseList(arrayList));
    }
}
