public class EvenOrOdd {
    public static void main(String[] args){
        System.out.println(Parity(1));
    }
    public static boolean Parity ( long num ){
        long PF = num - (num >> 1)*2 ;
        return (PF==0);
    }
}
