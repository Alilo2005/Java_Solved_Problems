public class Fibonnachi {
    public static long fib(int n){
        if(n==0 || n==1){
            return 1 ;
        }
        else{
            return fib(n-2)+fib(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println(fib(45));
    }
}
