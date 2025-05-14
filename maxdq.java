import java.util.*;
public class maxdq {
    public static List<Integer> maxdp(int[]arr, int k){
        List<Integer> lst = new ArrayList<>();
        Deque <Integer> dq = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            } 
                while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
                    dq.pollLast();
                }
                dq.offerLast(i);
            
            if(i>=k-1){
                lst.add(arr[dq.peekFirst()]);
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        System.out.println(maxdp(arr, 3)); 
    }
    
}
