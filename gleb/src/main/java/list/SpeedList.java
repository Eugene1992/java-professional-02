package list;

/**
 * Created by Gleb on 09.12.2016.
 */
public class SpeedList<E> {

    private static Object[] array;

    private static final int d_capacity = 10;

    private int size;

    private int index;

    public SpeedList() {
        array = new Object[d_capacity];
    }

    public SpeedList(int capacity) {
        array = new Object[capacity];
    }

    public void add(E value) {
        if (index == array.length)
            growArray();
        array[index++] = value;
        size++;
    }

    private void growArray() {
        Object[] newArray = new Object[array.length * 3 / 2];
        System.arraycopy(array, 0, newArray, 0, index - 1);
        array = newArray;
    }

    public E get(int index) {
        checkIndex(this.index);
        return (E) array[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.index)
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
        for (int i = 0; i < index; i++) {
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

        System.arraycopy(array, index, array, index + 1, this.index - index);
        array[index] = value;
        this.index++;
        size++;

        return true;
    }

    public boolean remove(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, this.index - index);
        size--;
        this.index--;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new SpeedList().add(1, "ff"));
        System.out.println(new SpeedList().size);
    }

}

