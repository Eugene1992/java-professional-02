package hwSpeedList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Gleb on 25.12.2016.
 */
public class Speed {
    ArrayList<Integer> arrayList;
    LinkedList<Integer> linkedList;
    int time = 1000;

    public enum Method {
        End, Beginning, Middle, Remove
    }

    public Long Speedequol(Method method, int time) {
        Long start = System.nanoTime();
        Long end = System.nanoTime();
        this.time = time;
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        switch (method) {
            case End:
                start = System.nanoTime();
                for (int i = 0; i < time; i++) {
                    arrayList.add(800, 1);
                    linkedList.add(800, 1);
                }
                end = System.nanoTime();
                break;
            case Beginning:
                start = System.nanoTime();
                for (int i = 0; i < time; i++) {
                    arrayList.add(1);
                    linkedList.add(1);
                }
                end = System.nanoTime();
                break;
            case Middle:
                start = System.nanoTime();
                for (int i = 0; i < time; i++) {
                    arrayList.add(500, 1);
                    linkedList.add(500, 1);
                }
                end = System.nanoTime();
                break;
            case Remove:
                start = System.nanoTime();
                for (int i = 0; i < time; i++) {
                    arrayList.remove(500);
                    linkedList.remove(500);
                }
                end = System.nanoTime();
                break;
        }

        return start - end;
    }
}
