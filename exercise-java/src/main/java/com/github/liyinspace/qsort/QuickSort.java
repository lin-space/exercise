package com.github.liyinspace.qsort;

/**
 * Created with Intellij IDEA
 *
 * @author LiYin
 * @Date 2019/9/14
 * @Time 22:04
 * @Version 1.0
 */
public class QuickSort {


    public static void main(String[] args) {
       int[] a =  new int[]{8,4,3,5,2,1,6,7,9,0};
         quickSort(a,0,3);

        for (int i : a) {
            System.out.println(i);
        }
    }

    /**
     * quickSorting
     * @param arr
     * @param begin
     * @param end
     */
    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    /**
     * sort
     * @param arr
     * @param begin
     * @param end
     * @return
     */
    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
