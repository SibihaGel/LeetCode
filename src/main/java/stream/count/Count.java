package stream.count;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(2, 4, 6, 8, 9);
        Stream<Integer> stream2 = Stream.of(2, 4, 6, 8, 9, 10);

        Stream<Integer> stream3 = Stream.concat(stream1, stream2);

     //   Map<Integer, Long> map = stream3.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        Long a = stream3
                .distinct()
                .peek(el -> System.out.println("Уникальные элемент : " + el))
                .count();
        System.out.println(a);
    }
}
