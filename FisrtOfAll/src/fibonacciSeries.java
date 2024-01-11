public class fibonacciSeries {
    public static int fibonacciHelper(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return fibonacciHelper(n-1)+fibonacciHelper(n-2);
        }
    }
    public static void fibonacciUntilNumber(int n){
        int k = 0;
        while(fibonacciHelper(k) < n){
            System.out.printf("%d\t",fibonacciHelper(k));
            k++;
        }
    }
    public static void main(String[] args){
        fibonacciUntilNumber(10000000);
    }
}
