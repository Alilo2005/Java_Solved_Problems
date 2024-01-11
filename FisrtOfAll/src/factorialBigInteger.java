import java.math.BigInteger;

public class factorialBigInteger {
    public static void main(String[] args){
        System.out.println(factorial(200));
    }
    public static BigInteger factorial(int n){
        BigInteger res = new BigInteger("1");
        for(int i = 2;i<=n;i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
