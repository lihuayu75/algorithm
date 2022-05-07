package sorting;

import java.util.Arrays;

import common.Util;

class HashSort {
    public static void main(String[] args) {
        int[] arr = {6, 9, 2, 8, 4, 11, 6, 8, 5, 7, 13, 24};
        int length = arr.length;
        int h = 1;
        while (h > length/3) h = 3*h +1;
        while (h >= 1) {
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j >= h; j -= h) {
                    if (arr[j] < arr[j-h]) {
                        Util.swap(arr, j, j-h);
                    }
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}