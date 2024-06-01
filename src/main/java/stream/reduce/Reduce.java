package stream.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(2);

        int a = list.stream()
                .reduce((accum, el) -> accum + el).get();
        // 8+5+6+4+2
        System.out.println(a);

        List<Integer> list100 = new ArrayList<>();

            Optional<Integer> b = list100.stream()
                    .reduce((acumm, el) -> acumm * el);

            if (b.isPresent()) {
                System.out.println(b.get());
            }
            else {
                System.out.println(" Not present");
            }

            int c = list.stream().reduce(1, (accum, el) -> accum * el);
        System.out.println(c);

            int d = list.stream().reduce((el1,el2) -> el1 + el2).get();

        System.out.println(d);

        int [] arr = {1, 9};
        // /[1,2,3] result [1,2,4]
        //[9] result [1,0]
        //[1,2,9] result [1,3,0]
        //   increment(arr);
        System.out.println(Arrays.toString(incrementNext(arr)));

    }

    public static void increment(int [] arr) {
        int index = arr.length;
        int[] res = new int[index];

        for (int i = arr.length-1; i > arr.length - 2; i--) {

            if(index == 1 ) {
                arr[0] = arr[0] + 1;
                System.out.println(" Хрен вам ... ");
                break;
            }

            if (i == index -1  && arr[i] < 10) {
               arr[index-1] = arr[index -1] + 1;

            } else {
            index = index + 1;
                arr[i - 1] = arr[i -1 ] + 1;

            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] incrementNext(int[] digit) {
        int[] newDigit = new int[digit.length + 1];
        newDigit[0] = 1;

        for (int i = digit.length - 1; i >= 0; i--) {
            if (digit[i] < 9) {
                digit[i]++;
                return digit;
            }
            digit[i] = 0;
        }
        return newDigit;
    }

}
