package hw7;

import java.util.Collection;
import java.util.List;

public class CollectionUtilsTest {
    public static void main(String[] args) {
        testAverage();
        testMaxLength();
    }

    private static void testAverage() {
        System.out.println("Testing average");

        Collection<Integer> collection1 = List.of(6);
        System.out.println(CollectionUtils.average(collection1)); // 6.0

        Collection<Integer> collection2 = List.of(6, 5);
        System.out.println(CollectionUtils.average(collection2)); // 5.5

        Collection<Integer> collection3 = List.of(6, 5, 4);
        System.out.println(CollectionUtils.average(collection3)); // 5.0

        System.out.println();
    }

    private static void testMaxLength() {
        System.out.println("Testing maxLength");

        Collection<String> collection1 = List.of("one");
        System.out.println(CollectionUtils.maxLength(collection1)); // 3

        Collection<String> collection2 = List.of("one", "two");
        System.out.println(CollectionUtils.maxLength(collection2)); // 3

        Collection<String> collection3 = List.of("one", "two", "three");
        System.out.println(CollectionUtils.maxLength(collection3)); // 5

        Collection<String> collection4 = List.of("one", "two", "three", "four");
        System.out.println(CollectionUtils.maxLength(collection4)); // 5

        System.out.println();
    }
}