package com.github.liyinspace.array;


import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @author LiYin
 * @Date 2020/3/28
 * @Time 12:20
 * @Version 1.0
 */
public class TestArrayInitSize {

    private static void testAddOfArray(){
        List<Integer> list = new ArrayList<>(1000000);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void testSysArrayCopy(){
        int[] array = new int[]{1,2,3,4,5,6};

        int[] newIntArray = new int[6];

        System.arraycopy(array,0,newIntArray,0,newIntArray.length);

        System.out.println(Arrays.toString(newIntArray));
    }

    public static void main2(String[] args) {

        List list = new ArrayList();

        System.out.println(list.isEmpty());
        for (int i = 0; i < 1; i++) {

            list.add(i);
        }

        System.out.println(list.isEmpty());

        System.out.println(Arrays.toString(list.toArray()));


    }

    public static void main(String[] args) {
        testAddOfArray();
    }
}
