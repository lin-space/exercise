package com.github.liyinspace.bubblesort;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @author LiYin
 */
public class TestBubbleSort {


    public static void main(String[] args) {
        int[] array = new int[]{7,6,5,4,3,2,1};

        for (int i = 0; i < array.length; i++) {

            //是否做过比对后搬移操作
            boolean isMoved = false;
            for (int i1 = 0; i1 < array.length - i - 1; i1++) {

                if (array[i1] > array[i1 + 1]){

                    int temp = array[i1];

                    array[i1] = array[i1 + 1];

                    array[i1 + 1] = temp;

                    isMoved = true;
                }
            }

            //如果一轮比完没有进行搬移，说明已经是有序的就不再进行后续比较了
            if (!isMoved){
                break;
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
