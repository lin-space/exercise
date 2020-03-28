package com.github.liyinspace.array;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @author LiYin
 * @Date 2020/3/28
 * @Time 15:57
 * @Version 1.0
 */
public class ArrayList<T> implements List<T>{

    transient Object[] elementData;

    private static final int DEFAULT_CAPACITY = 10;

    private int size;

    public ArrayList() {
       elementData = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int initSize) {
        elementData = new Object[initSize];
    }



    @Override
    public int add(T t) {
        if (t == null) return 0;

        int length = this.elementData.length;
        if (size + 1 > length){
            Object[] objects = new Object[length + (length >> 1)];

            for (int i = 0; i < this.elementData.length; i++) {
                objects[i] = this.elementData[i];
            }

            this.elementData = objects;
        }

        this.elementData[size ++] = t;


        return 1;
    }

    @Override
    public int remove(T t) {
        return 0;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return this.size < 1;
    }

    @Override
    public T[] toArray() {
        return (T[]) Arrays.copyOf(this.elementData,this.elementData.length);
    }
}
