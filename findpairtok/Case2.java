package findpairtok;

import java.util.Arrays;

class Case2 {
    private static boolean findPairToK(int[] n, int k) {
        Arrays.sort(n);
	    int p = 0; int q = n.length-1;
        boolean result = false;
	    while (true) {
	    	if (p>=q) {
	    		break;
	    	}
	    	if (n[p] + n[q] == k) {
	    		System.out.println ("Sum of " + n[p] + " and " + n[q] + " = " + k);
                result = true;
	    		p++;
	    	} else if (n[p] + n[q] < k) {
	    		p++;
	    	} else if (n[p] + n[q] > k) {
	    		q--;
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