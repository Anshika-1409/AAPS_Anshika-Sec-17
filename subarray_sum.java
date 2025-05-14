public class subarray_sum {
    public static int subarr(int arr[], int k){
        int n= arr.length;
        //int [] sum= new int[n];
        //sum[0]= arr[0];
        int max=0;
        int sum=0;
        for (int i=0; i<k;i++){
            sum+=arr[i];
        }
        max=sum;
        for(int i=k; i<n; i++){
            sum+= arr[i]-arr[i-k];
            max= Math.max(sum,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,6};
        System.out.println(subarr(arr, 3)); 
    }
    
}
