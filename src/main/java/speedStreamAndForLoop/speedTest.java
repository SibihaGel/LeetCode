package speedStreamAndForLoop;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class speedTest {
    public static void main(String[] args) {

      streamSpeedTest();
     //   forLoopSpeedTest();
    }

    private static void forLoopSpeedTest() {

        List<Integer> list = IntStream.range(0, 500_000).boxed().toList();
        int res = 0;
        LocalTime start = LocalTime.now();
        for (Integer i : list) {
            res += i;




        }System.out.println(res);
        LocalTime end = LocalTime.now();
        Duration duration = Duration.between(end, start);
        System.out.println(duration);
    }
        private static void streamSpeedTest () {
            //  IntStream intStream = IntStream.range(0, 500_00);
            List<Integer> list = IntStream.range(0, 500_000).boxed().toList();
            LocalTime start = LocalTime.now();

            int res = list.stream().reduce((el1, el2) -> el1 * el2).get();
                    System.out.println(res);
            LocalTime end = LocalTime.now();

            Duration duration = Duration.between(end, start);
            System.out.println(duration);
        }


}
