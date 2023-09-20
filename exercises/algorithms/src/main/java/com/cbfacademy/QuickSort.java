package com.cbfacademy;

public class QuickSort {

 //     quickSort(arr, beg, end)
    public void quicksort(int[] arr, int beg, int end){
//   if (beg < end)
//     pivotIndex = partition(arr,beg, end)
//     quickSort(arr, beg, pivotIndex)
//     quickSort(arr, pivotIndex + 1, end)        
        if(beg < end){
            int pivotIndex = partition(arr, beg, --end);
            quicksort(arr, beg, pivotIndex);
            quicksort(arr, pivotIndex+1, end);
        }
    }

// partition(arr, beg, end)

    public int partition(int[] arr, int beg, int end){
        //   set end as pivotIndex
        int pivotIndex = end;
//   pIndex = beg - 1
        int pIndex = beg-1;
//   for i = beg to end-1
        for(int i = beg; i<pivotIndex; i++){
            //if arr[i] < pivot
            if (arr[i] < arr[pivotIndex]){
//     swap arr[i] and arr[pIndex]
//     pIndex++
                int swap = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = swap;
                pivotIndex++;
            }
//   swap pivot and arr[pIndex+1]
        int swap = arr[pivotIndex];
        arr[pivotIndex] = arr[pIndex+1];
        arr[pIndex+1] = swap; 
    }
// return pIndex + 1
pIndex = pIndex+1;
return pIndex;
    }
}