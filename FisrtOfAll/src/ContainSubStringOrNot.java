public class ContainSubStringOrNot {
    public static void main(String[] args){
        System.out.println(ContainSubString("Ali Mahdi","li M"));
    }
    public static boolean ContainSubString(String str ,String sub){
        int begin = 0;
        int limit = str.length() - 1;
      while(begin != limit){
         String region = str.substring(begin,limit);
      if(region.startsWith(sub)){
          return true;
      }
      begin += 1;
      }
      return false;
    }
}
