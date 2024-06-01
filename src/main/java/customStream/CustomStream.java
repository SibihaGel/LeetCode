package customStream;

import java.util.ArrayList;
import java.util.List;

public class CustomStream {


    public static void main(String[] args) {
        List<String> numbers = List.of("one","two", "three", "four", "five","six","seven","eit", "nine", "ten");

        IntStreamFilter filterList = new IntStreamFilter(numbers);
        List<String> filteredNumbers = filterList.filter(n -> n.startsWith("f"));

        filteredNumbers.forEach(System.out::println);
    }
}

class IntStreamFilter {
    private final List<String> list;

    public IntStreamFilter(List<String> list) {
        this.list = list;
    }

    public List<String> filter(IntPredicate predicate) {
        List<String> result = new ArrayList<>();
        for (String n : list) {
            if (predicate.test(n)) {
                result.add(n);
            }
        }
        return result;
    }
}

@FunctionalInterface
interface IntPredicate {
    boolean test(String value);
}
