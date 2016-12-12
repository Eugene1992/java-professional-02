package hw3;


import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Максим on 12-Dec-16.
 */
public class MyArrayList<T> {

    private static final int defaultCapacity = 1;
    private T[] arr;
    private int kursor = -1;


    public MyArrayList() {

        arr = (T[]) new Object[defaultCapacity];
    }

    public int size() {


        return arr.length;
    }

    private void checkSize() {

        if (arr.length == kursor + 1) {
            T[] arr1 = (T[]) new Object[arr.length + 1];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
        }
    }

    public void add(T element) {
        checkSize();
        arr[++kursor] = element;
    }

    public void add(int i, T element) {
        checkSize();

        System.arraycopy(arr, i, arr, i + 1, kursor + 1 - i);
        arr[i] = element;
    }

    public T get(int i) {

        return arr[i];
    }

    public T set(int i, T element) {

        return arr[i] = element;
    }

    public boolean contains(T element) {
        boolean t = false;
        for (int i = 0; i < kursor; i++) {
            if (arr[i].equals(element))
                t = true;


        }
        return t;
    }

    public void remove(int i) {

        T[] arr1 = (T[]) new Object[arr.length - 1];
        System.arraycopy(arr, 0, arr1, 0, kursor);
        System.arraycopy(arr, i + 1, arr1, i, kursor + 1 - i);
        arr = arr1;
    }

    public Iterator<T> iterator() {
        Iterator<T> iter = new Iterator<T>() {

            @Override
            public boolean hasNext() {
                return kursor != arr.length - 1;
            }

            @Override
            public T next() {
                return get(kursor);
            }

            @Override
            public void remove() {
                MyArrayList.this.remove(kursor);
            }
        };
        return iter;
    }


    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 21; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
       /* System.out.println(list.kursor);
        System.out.println(list.size());
        list.add(15,10000);
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println(list.get(15));
        list.set(15, 555555);
        System.out.println(list.toString());
        System.out.println(list.contains(555555));
        list.remove(15);
        System.out.println(list.toString());
        System.out.println(list.size());*/

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next.equals(2)) {
                iterator.remove();
                continue;
            }

        }
        System.out.println(list.toString());

    }

}