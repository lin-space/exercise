import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 该程序是为了验证数组与链表结构的性能特点，增删慢的数组结构也是针对场景而定，若是仅操作末尾处数据，时间复杂度仍是O(1)
 */
public class TestArray {

    /**
     * 容器最大长度
     */
    public static final int MAX_SIZE = 100000;


    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(100);

        long start = System.currentTimeMillis();

        for (int i = 0; i < MAX_SIZE; i++) {
//            从头位置添加，速度非常慢，时间复杂度为O(n)
//            arrayList.add(0,i);

//            默认从尾部追加，时间复杂度为O(1)
            arrayList.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("ArrayList time:" + (end - start) + "ms");


        long lstart = System.currentTimeMillis();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < MAX_SIZE; i++) {
            linkedList.add(i);
        }
        long lend = System.currentTimeMillis();

        System.out.println("LinkedList time:" + (lend - lstart) + "ms");



    }
}
