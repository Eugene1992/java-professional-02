package hw1;


import java.util.Arrays;
import java.util.Iterator;

public class Stack <T> implements Iterable{

    private T [] array;

    public Stack(int n) {
       this.array = (T []) new Object [n];
    }




    public void  push(T element ){

        for (int i=0; i<array.length;i++)
            if (array[i] ==null) {
                array[i]=element;
                break;
            }
    }
    public Iterator <T> iterator() {
        Iterator <T> iter = new Iterator<T>() {
            @Override
            public boolean hasNext() {

                return array.length != 0 ? true: false;
            }

            @Override
            public T next() {
                return pop();

            }

            @Override
            public void remove() {

            }
        };
       return iter;
    }


    @Override
    public String toString() {
        return "Stack{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public T  pop (){
        T t = null;
        for (int i=array.length-1; i>=0;i--) {
            if (array[i] != null) {
                t = array[i];
                break;
            }
        }
        return t;

    }

    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Object obj3 = stack.pop();
        Object obj2 = stack.pop();

        System.out.println(stack.toString());
        System.out.println(obj3);
        System.out.println(obj2);
    }


}
