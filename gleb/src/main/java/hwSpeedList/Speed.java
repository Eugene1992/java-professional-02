package hwSpeedList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Gleb on 25.12.2016.
 */
public class Speed<A, L> {
    static ArrayList<Object> arrayList;
    static LinkedList<Object> linkedList;
    static int elements = 1000;

    public enum Method {
        End, Beginning, Middle
    }
    public static Long EqualSpeedLinkedVsArray(Method method) {
        Long start = System.nanoTime();
        switch (method) {
            case End:
                for (int i = 0; i < elements; i++) {
                    arrayList.add(800, 1);
                    linkedList.add(800, 1);
                    arrayList.set(800, 1);
                    linkedList.set(800, 1);
                    arrayList.remove(800);
                    linkedList.remove(800);
                }
                break;
            case Beginning:
                for (int i = 0; i < elements; i++) {
                    arrayList.add(1);
                    linkedList.add(1);
                    arrayList.set(1, 1);
                    linkedList.set(1, 1);
                    arrayList.remove(1);
                    linkedList.remove(1);
                }
                break;
            case Middle:
                for (int i = 0; i < elements; i++) {
                    arrayList.add(500, 1);
                    linkedList.add(500, 1);
                    arrayList.set(500, 1);
                    linkedList.set(500, 1);
                    arrayList.remove(500);
                    linkedList.remove(500);
                }
                break;
        }
        Long end = System.nanoTime();
        return start - end;
    }
}
