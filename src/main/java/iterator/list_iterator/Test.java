package iterator.list_iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

        ListIterator<String> stringListIterator = strings.listIterator(strings.size());
        while (stringListIterator.hasPrevious()) {
            String next = stringListIterator.previous();
            if (next.equals("2")) {
                stringListIterator.set("Two");
            }
            System.out.println(next + " - " + stringListIterator.previousIndex());
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
