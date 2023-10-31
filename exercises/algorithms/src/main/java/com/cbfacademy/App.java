package com.cbfacademy;

import java.net.Socket;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] in = new int[] { 2, 3, 676, 9, 45, 1, 48, 68, 13 };

        System.out.println(Arrays.toString(in));

        // int end = in.length -1;
        // QuickSort quickSort = new QuickSort();
        // quickSort.quicksort(in, 0, end);
        // System.out.println(Arrays.toString(in));

        Arrays.sort(in);
        System.out.println(Arrays.toString(in));
        // App app = new App();
        System.out.println(binarySearch(in, 9, 0, in.length - 1));
        System.out.println(linearSearch(in, 676));
    }

    static int binarySearch(int[] arr, int i, int low, int high) {

        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (i == arr[mid]) {
            return mid;
        } else if (i > arr[mid]) {
            low = mid + 1;
            return binarySearch(arr, i, low, high);
        } else {
            high = mid - 1;
            return binarySearch(arr, i, 0, high);
        }
    }

    static int linearSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }

    static int bubbleSort(int arr){
        for [i]
    }

}


