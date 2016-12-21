package hw3;


import java.util.Iterator;

/**
 * Created by Максим on 12-Dec-16.
 */
public class MyArrayList<T> {

    private static final int defaultCapacity = 10;
    private T[] arr;
    private int kursor = -1;



    public MyArrayList() {

        arr = (T[]) new Object[defaultCapacity];
    }

    public int size() {

        return kursor+1;
    }

    private void checkSize() {

        if (size() == kursor + 1) {
            T[] arr1 = (T[]) new Object[arr.length * 3 / 2 + 1];
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

        System.arraycopy(arr, i, arr, i + 1, ++kursor  - i);
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
        if (i < size() - 1) {
            System.arraycopy(arr, i + 1, arr1, i, kursor - i);
        } else {
        }
        arr = arr1;
        kursor--;

    }

    public Iterator<T> iterator() {
        Iterator<T> iter = new Iterator<T>() {
            int cursor = -1;

            @Override
            public boolean hasNext() {

                return cursor++ < size() - 1;
            }

            @Override
            public T next() {
                return get(cursor);
            }

            @Override
            public void remove() {

                MyArrayList.this.remove(cursor);
            }
        };
        return iter;
    }


    @Override
    public String toString() {
        //  return Arrays.toString(arr);}


        StringBuilder result = new StringBuilder();
        result.append("{");
        for (int i = 0; i < kursor+1; i++) {
            result.append(arr[i]);
            result.append(",");
        }
        if (result.length() > 1) {
            result.setLength(result.length() - 1);
        }
        result.append("}");

        return result.toString();
    }


}