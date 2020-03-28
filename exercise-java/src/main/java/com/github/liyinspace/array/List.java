package com.github.liyinspace.array;

/**
 * Created with Intellij IDEA
 *
 * @author LiYin
 * @Date 2020/3/28
 * @Time 15:59
 * @Version 1.0
 */
public interface List<T> {

   int add(T t);

   int remove(T t);

   int indexOf(T t);

   boolean isEmpty();

   T[] toArray();
}
