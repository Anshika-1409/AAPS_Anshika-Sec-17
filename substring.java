public class substring{
    public static String ss(String s){
        int n= s.length();
        String longest= "";
        for(int i=0; i<n; i++){
            //int sub=0;
            for(int j=i+1; j<=n; j++){
                String sub= s.substring(i,j);
                if(isSpecial(sub)&& sub.length()> longest.length()){
                    longest= sub;
                }
            }
        } 
        return longest;
    }
    public static boolean isSpecial(String s){
        int n= s.length();
        for(int i=0; i<n; i++){
            char c= s.charAt(i);
            if(s.indexOf(c)!= s.lastIndexOf(c)){
                return false;
            }    
        }
        return true;
    }
    public static void main(String[] args) {
        String s="abcdefab";
        System.out.print(ss(s));
    }
}