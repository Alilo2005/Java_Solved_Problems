public class ReverseString {
    public static void main(String[] args){
        System.out.printf("%s",Reverse("Ali Mahdi"));
    }
    public static String Reverse(String str){
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString() ;
    }
}

