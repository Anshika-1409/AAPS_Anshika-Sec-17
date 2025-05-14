public class powerof2{
    public static boolean power(int n){
        if(n!=0 && (n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n= 7;
        System.out.println(power(n)); 
    }

}