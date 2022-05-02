package sorting;

import java.util.Arrays;

class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {6, 9, 2, 8, 4, 11, 6, 8, 5, 7, 13, 24};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            swap(arr, i, min);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}