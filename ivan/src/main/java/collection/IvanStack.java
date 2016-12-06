package collection;

import java.util.*;


public class IvanStack<E> implements Iterable<E> {

    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;


    /**
     * The array buffer into which the elements of the ArrayList are stored.
     */
    private E[] elementData;

    /**
     * The size of the ArrayList (the number of elements it contains).
     *
     * @serial
     */
    private int size;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public IvanStack() {
        this.elementData = (E[])new Object[DEFAULT_CAPACITY];
    }

    /**
     * Constructs an empty list with the specified initial capacity.
     *
     * @param initialCapacity the initial capacity of the list
     */
    public IvanStack(int initialCapacity) {
        if (initialCapacity > DEFAULT_CAPACITY) {
            this.elementData = (E[])new Object[initialCapacity];
        } else {
            this.elementData = (E[])new Object[DEFAULT_CAPACITY];
        }
    }

    /**
     * Appends the specified element to the end of this list (optional
     * operation).
     */
    public void push(E o) {

        if (size == elementData.length) {
            int newLength = elementData.length * 2;
            E[] copy = (E[])new Object[newLength];
            System.arraycopy(elementData, 0, copy, 0, elementData.length);
            elementData = copy;
        }
        elementData[size] = o;
        size++;
    }

    /**
     * Returns the first element in this list.
     */
    public E pop() {
        if(size==0)
            return null;

        E e = elementData[0];

        int newLength = elementData.length;
        if ((size > DEFAULT_CAPACITY) && ((size * 4) < elementData.length)) {
            newLength = elementData.length / 2;
        }
        E[] copy = (E[])new Object[newLength];
        System.arraycopy(elementData, 1, copy, 0, --size);

        elementData = copy;
        return (E) e;
    }



    /**
     * Returns a list iterator over the elements in this list (in proper
     * sequence).
     */
    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator<E>() {
            /**
             * Returns {@code true} if the iteration has more elements.
             * (In other words, returns {@code true} if {@link #next} would
             * return an element rather than throwing an exception.)
             *
             * @return {@code true} if the iteration has more elements
             */
            public boolean hasNext() {
                return size == 0 ? false : true;
            }

            /**
             * Returns the next element in the iteration.
             *
             * @return the next element in the iteration
             */
            public E next() {
                return pop();
            }


            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }


    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return this.size;
    }

    /*
    @Override
    public String toString() {
        return "IvanStack{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }*/

    /**
     * Compares the specified object with this list for equality.
     *
     * @param o the object to be compared for equality with this list
     * @return {@code true} if the specified object is equal to this list
     */
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if(o.getClass() != this.getClass())
            return false;

        if(o == null)
            return false;

        IvanStack<E> that = (IvanStack<E>)o;

        if(this.size() != that.size())
            return false;

        if(!this.toString().equals(that.toString()))
            return false;

        return true;
    }

    /**
     * Returns the hash code value for this list.
     *
     * @return the hash code value for this list
     */
    public int hashCode() {
        int hashCode = 1;
        for (E e : elementData)
            hashCode = 31*hashCode + (e==null ? 0 : e.hashCode());
        return hashCode;
    }


    /**
     * Returns a string representation of this collection.
     *
     * @return a string representation of this collection
     */
    @Override
    public String toString() {
        StringBuilder result  = new StringBuilder();
        result.append("[");
        for (int i = 0; i < size; i++) {
            result.append(elementData[i]);
            result.append(",");
        }
        if(result.length()>1){
            result.setLength(result.length()-1);
        }
        result.append("]");

        return result.toString();
    }
}
