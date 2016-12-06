import collection.IvanStack;
import sun.plugin.javascript.navig.Array;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){

        ArrayList<String> s = new ArrayList<String>();
       /* int[] ints = {1,2,3,4,5,6,7,8,9,10};


        System.out.println(Arrays.toString(ints));

        int[] copy = new int[ints.length];

        System.arraycopy(ints, 1, copy, 0, ints.length-1);
        System.out.println(Arrays.toString(copy));*/


        IvanStack<String> stringIvanStack1 = new IvanStack<String>();
        for (int i = 0; i < 100; i++) {
            stringIvanStack1.push(i + " ");
        }

        IvanStack<String> stringIvanStack2 = new IvanStack<String>();
        for (int i = 0; i < 100; i++) {
            stringIvanStack2.push(i + " ");
        }



        System.out.println(stringIvanStack1.hashCode());
        System.out.println(stringIvanStack2.hashCode());
        System.out.println(stringIvanStack1.equals(stringIvanStack2));

        Iterator iterator = stringIvanStack1.iterator();

        while (iterator.hasNext()){
            System.out.println(stringIvanStack1);
            System.out.println(iterator.next());
        }

/*
        System.out.println(stringIvanStack.pop());
        System.out.println(stringIvanStack);

        System.out.println(stringIvanStack.pop());
        System.out.println(stringIvanStack);

        System.out.println(stringIvanStack.pop());
        System.out.println(stringIvanStack);

        System.out.println(stringIvanStack.pop());
        System.out.println(stringIvanStack.pop());
        System.out.println(stringIvanStack.pop());
        System.out.println(stringIvanStack.pop());
        System.out.println(stringIvanStack.pop());
        System.out.println(stringIvanStack.pop());
        System.out.println(stringIvanStack);

        System.out.println("---");
        System.out.println(stringIvanStack.size());
        System.out.println("---");
        int max = stringIvanStack.size();
        for (int i = 0; i < max; i++) {
            System.out.println(stringIvanStack.size());
            System.out.println(stringIvanStack.pop());
        }*/

        /*
                rangeCheck(0);
        Object e = elementData[0];

        int newLength = elementData.length;
        if((size*4) > elementData.length ){
            newLength = size/2;
        }
        Object[] copy = new Object[newLength];

        System.arraycopy(elementData, 0, copy, 0, 0);

        elementData = copy;
        * */
    }
}
