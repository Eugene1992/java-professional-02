package hw1;


import java.util.Arrays;
import java.util.Iterator;

public class Stack<T> implements Iterable {

    private T[] array;
    private int cursor = -1;

    public Stack(int n) {
        array = (T[]) new Object[n];
    }

    public void push(T element) {
        array[++cursor] = element;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public T pop() {

        return array[cursor--];

    }

    public Iterator<T> iterator() {
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
        Stack<Integer> stack = new Stack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.toString());
        Object obj3 = stack.pop();
        Object obj2 = stack.pop();
        Object obj1 = stack.pop();

        System.out.println(obj3);
        System.out.println(obj2);
        System.out.println(obj1);
        System.out.println(stack.toString());


    }


}