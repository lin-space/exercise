package com.github.liyinspace.insertionsort;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @author LiYin
 */
public class TestInsertionSort {

    public static void main(String[] args) {
        int[] array  = new int[]{10,1,4,5,3,2,7,6,8,9};

        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j --){
                if (array[j] > value){
                    array[j + 1] = array[j];
                }
                else {
                    break;
                }
            }
            array[j +1] = value;
        }

        System.out.println(Arrays.toString(array));
    }
}
