public class PermutationsString {
    public static void permute(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            String ros = s.substring(0,i)+ s.substring(i+1);
            permute(ros, ch+ans);
        }
    }
    public static void main(String [] args){
        String s= "abca";
        permute(s,"");
    }
}