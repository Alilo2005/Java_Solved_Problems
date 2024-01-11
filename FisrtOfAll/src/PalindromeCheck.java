
public class PalindromeCheck {
    public static void main(String[] args){
        System.out.println(IsPalindrome("AL"));
    }
    public static String Reverse(String str){
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString() ;
    }
    public static boolean IsPalindrome(String str){
        return Reverse(str).equals(str);
    }
}
