/*input an integer array n and an integer k, find all the pair combination in the arry sum to k
 *for example, n = [1, 5, 7, 4, 9, 6], k = 11, then the pair combination is (5, 6), (4, 7)
 */
package findpairtok;

class Case1 {
    private static boolean findPairToK(int[] n, int k) {
        boolean result = false;
        for (int i = 0; i < n.length - 1; i ++) {
	        for (int j = i + 1; j < n.length; j++) {
	            if (n[i] + n[j] == k) {
	            	System.out.println("sum of n[" + i + "]=" + n[i] + " and n[" + j + "]=" + n[j] + " is " + k);
                    result = true;
	            }
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