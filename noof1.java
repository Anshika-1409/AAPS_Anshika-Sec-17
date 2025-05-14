public class noof1{
    public static int bit(int n){
        int count=0;
        while(n!=0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
    public static void main(String[] args) {
        int n= 7;
        System.out.println(bit(n)); 
    }
}