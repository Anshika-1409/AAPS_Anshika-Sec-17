public class bit {
    public static String bit(int n) {
        String res = "";
        while (n>0) {
            res=(n%2)+res;
            n=n/2;
    }
    return res;
}

    public static void main(String[] args) {
        int n = 8;
        String s = "1111";
        int num = convert(s);
        System.out.println(num);
        System.out.println(bit(n));  
    }
    public static int convert(String s){
        int res = 0;
        for (int i=0; i<s.length(); i++){
            res=res*2+(s.charAt(i)-'0');
        }
        return res;
    }
}

