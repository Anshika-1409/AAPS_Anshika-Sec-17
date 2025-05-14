import java.util.Scanner;

public class ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefix = prefixSum(arr);
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            System.out.println(sumOfRange(prefix, L, R));
        }

        sc.close();
    }

    public static int[] prefixSum(int arr[]) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0]; 
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        
        return prefix;
    }

    public static int sumOfRange(int[] prefix, int l, int r) {
        if (l == 0) {
            return prefix[r];
        } else {
            return prefix[r] - prefix[l - 1];
        }
    }
}