package stream.stream;

import java.util.stream.Stream;

public class StreamExmp {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,0);

        stream.filter(el -> el >= 5)
                .forEach(System.out::println);

        stream.forEach(System.out::println);
    }
}
