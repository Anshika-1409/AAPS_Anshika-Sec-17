public class prefixsum{
    public static int sol(int []arr, int l, int r){
        int n= arr.length;
        int sum[]= new int[n];
        sum[0]= arr[0];
        for(int i=1; i<n; i++){
            sum[i]= sum[i-1]+arr[i];
        }
        if(l==0) {
            return sum[r];
        }
        else{
            return sum[r]-sum[l-1];
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,6};
        System.out.println(sol(arr, 1, 4)); 
    }
}