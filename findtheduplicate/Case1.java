package findtheduplicate;

import java.util.*;

/**
 * Giving an arry cantais n+1 elements between 1 and n inclusive, find the duplicate element (assume it can appear more than once)
 * -there is only one duplicate element
 * -it can appear more than once
 * 
 * example 1:
 * arr[] = {4, 2, 1, 3, 1}
 * duplicate: 1
 * 
 * example 2:
 * arr[] = {4, 2, 1, 5, 2, 2}
 * duplicate: 2
 */
public class Case1 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 2, 2};
        int i = findDuplicate(arr);
        System.out.println("duplicate number is: " + i);
    }

    public static int findDuplicate(int[] arr){
        // your code here
        int t = arr[0];
        int h = arr[arr[0]];
        while (t != h) {
            t = arr[t];
            h = arr[arr[h]];
        }
        t = 0;
        while (t != h) {
            t = arr[t];
            h = arr[h];
        }
        return t;
    }
}
