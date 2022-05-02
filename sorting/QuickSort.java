package sorting;

import java.util.Arrays;

class QuickSort {
    public static void main (String[] args) {
        int[] arr = {6, 9, 2, 4, 6, 11, 8, 5, 7, 8, 13, 24};

        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int i, int j) {
        int pos = partition(arr, i, j);
        partition(arr, i, pos - 1);
        partition(arr, pos + 1, j);
    }

    private static int partition(int[] arr, int i, int j) {
        //point always starts from the end
        return fromEnd(arr, i, j);
    }

    private static int fromEnd(int[] arr, int i, int j) {
        System.out.println(Arrays.toString(arr));
        if (i >=j) {
            return i;
        }
        int first = arr[i];
        int last = arr[j];
        int pos = i;
        if (first <= last) {
            //move last index forward
            j--;
            pos = fromEnd(arr, i, j);
        }
        if (first > last) {
            //move last to first
            arr[i] = last;
            arr[j] = first;
            i++;
            pos = fromStart(arr, i, j);
        }
        return pos;
    }

    private static int fromStart(int[] arr, int i, int j) {
        System.out.println(Arrays.toString(arr));
        if (i >=j) {
            return i;
        }
        int first = arr[i];
        int last = arr[j];
        int pos = j;
        if (first <= last) {
            //move last index forward
            i++;
            pos = fromStart(arr, i, j);
        }
        if (first > last) {
            //move last to first
            arr[i] = last;
            arr[j] = first;
            j--;
            pos = fromEnd(arr, i, j);
        }
        return pos;
    }
}