import java.util.ArrayList;

public class TextSentence {
    public static boolean isASentenceOf1(String txt,String str){
        return txt.contains(str);
    }
    public static ArrayList<Boolean> isASentenceOf2(String txt, String str){
        var arrayList = new ArrayList<Boolean>();
        for(int i=0;i<txt.length();i++){
            if(txt.substring(i).startsWith(str)){
                arrayList.add(true);
                return arrayList;
            }
        }
        arrayList.add(false);
        return arrayList;
    }
    public static boolean isASentenceOf3(String txt,String str){
        for(int i=txt.length()-1;i>=0;i--){
            if(txt.substring(i).startsWith(str)){
                return true;
            }
        }
        return false;
    }
    public static boolean isASentenceOf4(String txt,String str){
        for(int i=0;i<txt.length();i++){
            if(txt.substring(0,i).endsWith(str)){
                return true;
            }
        }
        return false;
    }
    public static boolean isASentenceOf5(String txt,String str){
        for(int i=txt.length();i>=0;i--){
            if(txt.substring(0,i).endsWith(str)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isASentenceOf1("potato","pot"));
        System.out.println(isASentenceOf2("potato","pot"));
        System.out.println(isASentenceOf3("potato","pot"));
        System.out.println(isASentenceOf4("potato","pot"));
        System.out.println(isASentenceOf5("potato","pot"));
    }
}
