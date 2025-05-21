public class SearchingString {
    public static boolean string(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str="hemanth";
        char target='e';
        System.out.println(string(str,target));
    }

}
