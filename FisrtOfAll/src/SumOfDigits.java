public class SumOfDigits {
    public static void main(String[] args){
        System.out.println(SumDigits(-57));
    }
    public static int SumDigits(int num){
        int sum = 0 ;
        while(num != 0){
           sum += num % 10 ;
           num /= 10 ;
        }
        return sum;
    }
}
