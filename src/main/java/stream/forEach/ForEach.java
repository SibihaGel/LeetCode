package stream.forEach;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


public class ForEach {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 9, 7, 3};

    /*    Arrays.stream(arr)
                .forEach(el -> {
                    el *= 2;
                    System.out.println(el);
                });
        Arrays.stream(arr).forEach(value -> System.out.println(value));
        Arrays.stream(arr).forEach(Utils::methodPrint);
*/
        int[] arr2 = {2, 4, 5, 6, 9, 7, 3};

        Map<Integer, Long> map = Arrays.stream(arr2)
               //   .mapToObj(el -> Integer.valueOf(el))
                .boxed()
                .peek(System.out::println)
                .filter(integer -> integer % 2==0)
                .peek(System.out::println)
                .collect(groupingBy(a -> a, Collectors.counting()));

          System.out.println(map);

        Map<Integer, Long> map1 = IntStream.concat(Arrays.stream(arr2), Arrays.stream(arr))
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        for (Map.Entry entry: map1.entrySet()) {
            System.out.println(entry.getKey() +  " : " + entry.getValue());
        }

        map1.forEach((k, v) -> {
            System.out.println(k +" : " + v);
        });
    }

}

class Utils {
    public static void methodPrint(int a){
        a = a + 10;
        System.out.println(" Element : " + a);
    }
}
