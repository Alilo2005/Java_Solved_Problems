package aliPackage;

public class Sum {
    int n;
    public  Sum(){}
    public  Sum(int n){
        this.n = n;
    }
    public int natural(){
        return n*(n+1)/2;
    }

    public int quadratic(){
        return n*(n+1)*(2*n+1)/6;
    }

    public int cubic(){
        return (int) Math.pow(n*(n+1)/2,2);
    }
}
