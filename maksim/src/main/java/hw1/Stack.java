package hw1;



import java.util.Iterator;

public class Stack<T> implements Iterable {

    private T[] array;
    private int cursor = -1;
    private int capacity = 10;
    private  int size;

    public Stack() {


        array = (T[]) new Object[capacity];

    }
    public int  size (){
        return size;
    }


    public void push(T element) {
        if (array.length == cursor + 1) {
            T[] arr1 = (T[]) new Object[array.length *2];
            System.arraycopy(array, 0, arr1, 0, array.length);
            array = arr1;}
        array[++cursor] = element;
        size++;

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            result.append(",");
        }
        if (result.length() > 1) {
            result.setLength(result.length() - 1);
        }
        result.append("}");

        return result.toString();
    }

    public T pop() {

        return array[cursor--];


    }


    public Iterator<T> iterator() {
        int kursor=-1;
        Iterator<T> iter = new Iterator<T>() {
            @Override
            public boolean hasNext() {

                return cursor != array.length - 1;
            }

            @Override
            public T next() {
                return pop();

            }

            @Override
            public void remove() {
                array[cursor--] = null;

            }
        };
        return iter;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i < 2; i++) {
            stack.push(i);
        }

        System.out.println(stack.toString());


       /* Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next.equals(2)) {
                iterator.remove();
                continue;
            }

        }*/
    }


}