package hw3;

import java.util.Iterator;

/**
 * Created by User on 18/12/2016.
 */
public class MyALT {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 39; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
        System.out.println(list.size());
        list.add(15, 10000);
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.get(15));
        list.set(15, 555555);
        System.out.println(list.toString());
        System.out.println(list.contains(555555));
        list.remove(15);
        list.remove(20);
        System.out.println(list.toString());
        System.out.println(list.size());

       /* Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next.equals(4&20)) {
                iterator.remove();
                continue;

        }            }*/

        System.out.println(list.toString());

    }
}
