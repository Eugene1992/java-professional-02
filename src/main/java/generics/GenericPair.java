package generics;

public class GenericPair<K, V> {

    private K key;
    private V value;

    public GenericPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericPair<Integer, String> pairOne = new GenericPair<>(10, "String");
        GenericPair<String, Integer> pairTwo = new GenericPair<>("String", 10);

        String key = pairOne.getValue();
        System.out.println(key);

    }
}
