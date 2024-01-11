

public class twoStringsAnagrams {
    public static boolean areAnagrams(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int [] alphabet = new int [26];
        for(int i = 0;i<26;i++){
            alphabet[i] = 0;
        }
        for(int i = 0;i< str1.length();i++){
            alphabet[str1.charAt(i)-'a'] ++;
            alphabet[str2.charAt(i)-'a'] --;
        }
        for(int i = 0;i<26;i++){
            if(alphabet[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str1 = "aol" ,str2 = "ALA";
        System.out.println(areAnagrams(str1.toLowerCase(),str2.toLowerCase()));
    }
}
