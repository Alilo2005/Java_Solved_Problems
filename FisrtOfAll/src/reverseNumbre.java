public class reverseNumbre {
    public static void main(String[] args) {
        System.out.println(reverse(12));
    }

    public static int reverse(int n) {
        int res = 0;
        while (n != 0) {
            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res;
    }
}

