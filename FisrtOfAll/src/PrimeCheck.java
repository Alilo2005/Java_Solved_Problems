public class PrimeCheck {
    public static void main(String[] args){
        int n = -28 ;
        if (!IsPrime(n)) {
            System.out.printf("%d isn't a prime number! %n", n);
        } else {
            System.out.printf("%d is a prime number! %n", n);
        }
    }
    public static boolean IsPrime(int  n ){
        if(n < 0){
            System.out.printf("negative value! %n");
            return false;
        }
        if(n==1){
            return false;
        }

        for(int  i = 2 ; i < n/2 ; i++){
            if(n % i == 0){
               return false;
            }
        }
        return true;
    }
}
