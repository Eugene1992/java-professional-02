package hw4;


import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 * Created by User on 23/12/2016.
 */
public class ArrayListVsLinkedList {

    LinkedList<Integer> linkedList = new LinkedList<>();
    ArrayList<Integer> arrayList = new ArrayList<>();
    String s = "Hello!!";
    final int f = 10;
    private int n;
    private int k;

    public enum Part {
        AddEnd, AddMiddle, AddBegin, Remove
    }

    public static class EnumPart {
        Part part;

        public EnumPart(Part part) {
            this.part = part;
        }

        public String timeCount() {
            String w = null;
            switch (part) {
                case AddBegin:
                    w = "Add at the begining";
                    break;

                case AddMiddle:
                    w = "Add in the middle";
                    break;

                case AddEnd:
                    w = "Add in the end";
                    break;

                case Remove:
                    w = "Remove";
                    break;

            }
            return w;
        }
    }

    public static void main(String[] args) {
        EnumPart part = new EnumPart(Part.Remove);
       // new ArrayListVsLinkedList().add(part.timeCount());
        new ArrayListVsLinkedList().remove(part.timeCount());
    }


    public void add(String part) {


        if (part.equals("Add in the end")) {
            n = 1;
            k = 1;
        }
        if (part.equals("Add in the middle")) {
            n = 2;
            k = 1;
        }
        if (part.equals("Add at the begining")) {
            n = 2;
            k = 0;
        }

        for (int j = 1; j < 4; j++) {


            System.out.println(part + " " + (f * Math.pow(10, j)));
            long startArray = new Date().getTime();
            for (int i = 0; i < (f * Math.pow(10, j)); i++) {
                arrayList.add(i * k / n, i);
            }
            long finishArray = new Date().getTime();
            long timeArray = finishArray - startArray;
            System.out.println("ArrayList : " + timeArray + "ms ");
            System.out.println(arrayList);


            long startLinked = new Date().getTime();
            for (int i = 0; i < (f * Math.pow(10, j)); i++) {
                linkedList.add(i * k / n, i);
            }
            long finishLinked = new Date().getTime();
            long timeLinked = finishLinked - startLinked;
            System.out.println("LinkedList : " + timeLinked + "ms ");
            System.out.println(linkedList);

            System.out.println("----------------------------------------------------");
        }
    }

    public void remove(String part) {


        for (int j = 1; j < 5; j++) {

            System.out.println(part + " " + (f * Math.pow(10, j)));

            for (int i = 0; i <= (f* Math.pow(10, j)); i++) {
                arrayList.add(i);
            }

            long startArray = new Date().getTime();
            for (int i = (int) (f* Math.pow(10, j)); i > -1; i--) {
                arrayList.remove(i);
            }
            long finishArray = new Date().getTime();
            long timeArray = finishArray - startArray;
            System.out.println("ArrayList : " + timeArray + "ms ");

            for (int i = 0; i <= (f* Math.pow(10, j)); i++) {
                linkedList.add(i);
            }

            long startLinked = new Date().getTime();
            for (int i = (int) (f* Math.pow(10, j)); i > -1; i--) {
                linkedList.remove(i);
            }
            long finishLinked = new Date().getTime();
            long timeLinked = finishLinked - startLinked;
            System.out.println("LinkedList : " + timeLinked + "ms ");
            System.out.println("----------------------------------------------------");
        }
    }

}
