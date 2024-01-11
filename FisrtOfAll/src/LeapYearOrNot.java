public class LeapYearOrNot {
    public static void main(String[] args){
        System.out.println(IsLeap(2023));
    }
    public static boolean IsLeap(int year){
        if(year % 4 == 0){
            return true;
        }
        return false;
    }
}
