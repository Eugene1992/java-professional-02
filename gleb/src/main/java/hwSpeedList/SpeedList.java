package hwSpeedList;

import java.util.List;

/**
 * Created by Gleb on 25.12.2016.
 */
public class SpeedList<T> {

    private List<T> list;

    public SpeedList(List<T> list) {
        this.list = list;
    }

    public enum Method {
        End, Beginning, Middle
    }

    public Long calculate(Method method, T elem, int elements) {
        Long start = System.nanoTime();
        switch (method) {
            case End:
                for (int i = 0; i < elements; i++) {
                    list.add(800, elem);
                    list.set(800, elem);
                    list.remove(800);
                }
                break;
            case Beginning:
                for (int i = 0; i < elements; i++) {
                    list.add(elem);
                    list.set(1, elem);
                    list.remove(1);
                }
                break;
            case Middle:
                for (int i = 0; i < elements; i++) {
                    list.add(500, elem);
                    list.set(500, elem);
                    list.remove(500);
                }
                break;
        }
        Long end = System.nanoTime();
        return start - end;
    }
}
