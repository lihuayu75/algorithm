package sorting;

import java.util.Random;

class QuickSort2 {
    public static void main(String[] args) {
        Random r = new Random();
        long time1= System.currentTimeMillis();
        for (int p = 0; p < 1000; p++) {
            int[] arr = getArray(1000, r);
            quickSort(arr, 0, arr.length - 1);
        }
        long time2= System.currentTimeMillis();
        // System.out.println(Arrays.toString(arr));
        System.out.println("time: " + (time2-time1)/1000.0);
    }

    private static int[] getArray(int len, Random r) {
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = r.nextInt(1000);
        }
        
        return arr;
    }

    private static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;

        int pos = partition(arr, lo, hi);
        
        quickSort(arr, lo, pos - 1);
        quickSort(arr, pos + 1, hi);
    }

    private static int partition(int[] arr, int lo, int hi) {
        int i = lo, j = hi+1;
        while (true) {
            while (arr[++i] < arr[lo]) if (i==hi) break;
            while (arr[lo] < arr[--j]) if (j==lo) break;
            if (i>=j) break;
            swap(arr, i, j);
        }
        swap(arr, lo, j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}