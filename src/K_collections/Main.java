package K_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static java.util.Arrays.sort;
import static java.util.List.of;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bbbb");
        list.add("c");
        list.add("dddd");

        // add a ~ before each element
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.add("~");
            listIterator.next();
        }

        System.out.println(list); // [~, a, ~, b, ~, c, ~, d]
                                  // ^

        // remove elements at index 0, 2, etc.
        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String elementOriginallyAtEvenIndex = iterator.next();
//            iterator.remove();
//            String elementOriginallyAtOddIndex = iterator.next();
//        }

        for (int i = 0; i < list.size() / 2; i++) {
            iterator.next();
            iterator.remove();
            iterator.next();
        }

        System.out.println(list);


//        iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String current = iterator.next();
//
//            if (current.length() % 2 == 0) {
//                iterator.remove();
//            }
//        }

//        Predicate<String> evenStringLength = new EvenStringLength();
//        list.removeIf(evenStringLength);
        list.removeIf(s -> s.length() % 2 == 0);


        String[] strings = {"hi", "bye"};
        sort(strings);

        List<Integer> intergerList = of(1, 2, 3);
    }


}

//class EvenStringLength implements Predicate<String> {
//    @Override
//    public boolean test(String s) {
//        return s.length() % 2 == 0;
//    }
//}
