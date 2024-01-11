public class RandomNumbreBetweenTwo {
    public static void main(String[] args){
        System.out.println(AleaNum(50000,9));
    }
    public static int AleaNum(int a,int b){
        return (int) (Math.random() * (Math.abs(b - a) + 1)) + Math.min(a, b);
    }
}
