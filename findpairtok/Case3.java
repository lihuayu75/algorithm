package findpairtok;

import java.util.Map;
import java.util.HashMap;

public class Case3 {
    private static boolean findPairToK(int[] n, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean result = false;
        for (int i = 0; i < n.length; i++) {
            int j = k - n[i];
            if (map.containsKey(j)) {
                System.out.println ("Sum of " + j + " and " + n[i] + " = " + k);
                result = true;
            } else {
                map.put(n[i], i);
            }
        }
        return result;
    }
	public static void main(String[] args) {
	    int[] n = {1, 5, 7, 4, 9, 6};
	    int k = 11;
        System.out.println("Find pair sum to " + k + " : " + findPairToK(n, k));
    }
}
