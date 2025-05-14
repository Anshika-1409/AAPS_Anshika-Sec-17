
public class prefix_sufixsum {
    public static boolean prefix(int arr[]){
        int n= arr.length;
        int prefix=0;
        int sufix=0;
        for(int i=0; i<n; i++){
            prefix+=arr[i];
        }
        for(int i=0; i<n; i++){
            prefix-=arr[i];
            if(sufix==prefix){
                return true;
            }
            sufix+=arr[i]  ;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3};
        System.out.println(prefix(arr)); 
    }
}