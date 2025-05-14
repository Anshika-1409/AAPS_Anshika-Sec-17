import java.util.*;
public class kadeans{
static int subarray(int []arr) {
    int res = 0;
    int max_sum=0;
    for (int i=0; i<arr.length; i++) {
        max_sum = Math.max(max_sum+arr[i], arr[i]);
        res = Math.max(res, max_sum);
    }
    return res;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] arr = {1,2,3,-7,10,-8,20,2};
    System.out.println(subarray(arr));
}
}
