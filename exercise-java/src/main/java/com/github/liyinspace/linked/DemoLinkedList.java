package com.github.liyinspace.linked;

import com.github.liyinspace.array.ArrayList;
import com.github.liyinspace.array.List;

/**
 * Created with Intellij IDEA
 *
 * @author LiYin
 */
public class DemoLinkedList<T> implements List<T> {


    transient Node<T> first;

    transient Node<T> last;

    @Override
    public int add(T t) {
        linkLast(t);
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
        return first == null;
    }

    @Override
    public T[] toArray() {

        List<T> arrayList = new ArrayList<>();
        for (Node<T> node = first; node.next != null;){
            arrayList.add(node.element);
            node = node.next;

            //补充链尾数据
            if (node.next == null){
                arrayList.add(node.element);
            }
        }
        return arrayList.toArray();
    }

    /**
     * 增加一个元素至链尾
     * @param t
     */
    void linkLast(T t){

        final Node<T> l = last;
        //构建新节点pre为原链的last,因为自己就是链尾所以next为空
        final Node<T> newNode = new Node<>(t, l, null);

        //将原链的最后节点指向该节点
        last = newNode;

        //如果原链尾是空的，说明链本身是空的，因为链如果有一个元素，first与next都将是该node
        if (l == null){
            //链头指向该节点
            first = newNode;
        }
        //如果链尾不为空，则将原链尾next指向该node
        else {
            l.next = newNode;
        }
    }


    /**
     * 链表节点
     * @param <E>
     */
    public static class Node<E>{

        /** 节点的数据 */
        E element;

        /** 该节点的上一个节点 */
        Node<E> pre;

        /** 该节点的下一个节点 */
        Node<E> next;

        public Node(E element, Node<E> pre, Node<E> next) {
            this.element = element;
            this.pre = pre;
            this.next = next;
        }
    }
}
