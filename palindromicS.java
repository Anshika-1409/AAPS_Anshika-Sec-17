public class palindromicS{
    public static String ss(String s){
        int n= s.length();
        String longest= "";
        for(int i=0; i<n; i++){
            //int sub=0;
            for(int j=i+1; j<=n; j++){
                String sub= s.substring(i,j);
                if(isPlaindrome(sub)&& sub.length()>longest.length()){
                    longest= sub;
                }
            }
        } 
        return longest;
    }
    public static boolean isPlaindrome(String s){
        int n= s.length();
        int l=0, r =n-1;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }    
            
        }
        return true;
        
}
    public static void main(String[] args) {
        String s="abacde";
        System.out.print(ss(s));
    }
}