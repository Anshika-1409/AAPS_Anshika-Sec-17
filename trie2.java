import java.util.*;
public class trie2 { 
    public static int findMaximumXOR(int[] nums) { 
        int maxXor = 0; 
        int mask = 0; 
        for (int i = 31; i >= 0; i--) { 
            mask |= (1 << i); 
            HashSet<Integer> set = new HashSet<>(); 
            for (int num : nums) { 
                set.add(num & mask); 
            } 
            int newMaxXor = maxXor | (1 << i); 
            for (int prefix : set) { 
                if (set.contains(prefix ^ newMaxXor)) { 
                    maxXor = newMaxXor; 
                    break; 
                } 
            } 
        } 
        return maxXor; 
    } 
 
    public static void main(String[] args) { 
        int[] nums = {3, 10, 5, 25, 2, 8}; 
        System.out.println(findMaximumXOR(nums));
    }
}