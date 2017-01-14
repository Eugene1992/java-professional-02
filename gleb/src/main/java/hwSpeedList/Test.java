package hwSpeedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Gleb on 12.01.2017.
 */
public class Test {
    public static void main(String[] args) {
        String elem = "Hello world";

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        SpeedList<String> arrayListTest = new SpeedList<>(arrayList);

        SpeedList<String> linkedListTest = new SpeedList<>(linkedList);
    }
}
