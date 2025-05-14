public class equillibrium {
    public static int equ(int arr[]){
        int n=arr.length;
        int sum=0;
        int leftsum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        for(int j=0; j<n; j++){
            sum-=arr[j];
            if(leftsum==sum){
                return j;
            }
            else{
                leftsum+=arr[j];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={-7,1,5,2,-4,3,0};
        System.out.println(equ(arr)); 
    }
}
