package stream.concat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(2,4,6,8);
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9,10);

    //    Stream<Integer> stream3 = Stream.concat(stream1, stream2);

    //    stream3.forEach(System.out::println);

        


        System.out.println(stream2.filter(integer -> integer %2 == 0).mapToInt(el -> el).sum());


        System.out.println(stream1.flatMapToInt(integer -> IntStream.of(integer.intValue())).sum());
        }



}
