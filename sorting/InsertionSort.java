package sorting;

import java.util.Random;

class InsertionSort {
    public static void main(String[] args) {
        Random r = new Random();
        long time1= System.currentTimeMillis();
        for (int p = 0; p < 1000; p++) {
            int[] arr = getArray(1000, r);
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j >= 1; j--) {
                    if (arr[j] < arr[j-1]) {
                        swap(arr, j, j-1);
                    }
                }
            }
        }
        long time2= System.currentTimeMillis();
        System.out.println("time: " + (time2-time1)/1000.0);
    }

    private static int[] getArray(int len, Random r) {
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = r.nextInt(1000);
        }
        
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}