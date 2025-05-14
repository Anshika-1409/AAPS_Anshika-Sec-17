public class trie {
    public static class TrieNode {
        TrieNode zero, one;
    }

    public static void insert(TrieNode root, int n) {
        TrieNode cur = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (n >> i) & 1;
            if (bit == 0) {
                if (cur.zero == null) {
                    TrieNode newNode = new TrieNode();
                    cur.zero = newNode;
                }
                cur = cur.zero;
            } else {
                if (cur.one == null) {
                    TrieNode newNode = new TrieNode();
                    cur.one = newNode;
                }
                cur = cur.one;
            }
        }
    }

    static int findMaxXor(TrieNode root, int n) {
        TrieNode cur = root;
        int ans = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (n >> i) & 1;
            if (bit == 0) {
                if (cur.one != null) {
                    ans += (1 << i);
                    cur = cur.one;
                } else {
                    cur = cur.zero;
                }
            } else {
                if (cur.zero != null) {
                    ans += (1 << i);
                    cur = cur.zero;
                } else {
                    cur = cur.one;
                }
            }
        }
        return ans;
    }

    public static int max_xor(int a[], int n) {
        TrieNode root = new TrieNode();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            insert(root, a[i]);
        }
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, findMaxXor(root, a[i]));
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {3, 10, 5, 25, 2, 8};
        System.out.println(max_xor(a, a.length)); // Output: 28
    }
}