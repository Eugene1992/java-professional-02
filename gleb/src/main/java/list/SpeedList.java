package list;

/**
 * Created by Gleb on 09.12.2016.
 */
public class SpeedList<E> {

    private static Object[] array;

    private static final int DEFAULT_CAPACITY = 10;

    private int size;

    public SpeedList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public SpeedList(int capacity) {
        array = new Object[capacity];
    }

    public void add(E value) {
        if (size == array.length)
            growArray();
        array[size++] = value;
    }

    private void growArray() {
        Object[] newArray = new Object[array.length * 3 / 2];
        System.arraycopy(array, 0, newArray, 0, size - 1);
        array = newArray;
    }

    public E get(int index) throws IllegalArgumentException {
        checkIndex(index);
        return (E) array[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException();
    }

    public void set(int index, E value) {
        checkIndex(index);
        array[index] = value;
    }

    public int size() {
        return size;
    }

    public int indexOf(Object value) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                result = i;
                break;
            }
        }
        return result;
    }

    public boolean add(int index, E value) {
        checkIndex(index);
        if (index == array.length)
            growArray();

        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
        return true;
    }

    public boolean remove(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        return true;
    }
}

