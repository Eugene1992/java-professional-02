package hwHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gleb on 08.12.2016.
 */
public class Hash_Map {

    private String text;

    public Hash_Map(String text) {
        this.text = text;
    }

    public Map<Integer, String> stringHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        String[] split = text.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (hashMap.containsKey(i)) {
                hashMap.put(1 + 1, split[i]);
            } else hashMap.put(1, split[i]);
        }
        return hashMap;
    }

    public static void main(String[] args) {

        String text = "Доступ к полям класса напрямую, " +
                "полям класса напрямую. ";

        System.out.println(new Hash_Map(text).stringHashMap());
    }

}