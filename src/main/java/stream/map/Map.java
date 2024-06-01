package stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 9};

        int[] arrNew = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .map(operand -> {
                    operand = operand / 2;
                    return operand;
                })
                .toArray();
        System.out.println(Arrays.toString(arrNew));


        List<String> stringList = new ArrayList<>();

        stringList.add("qwerty");
        stringList.add("qwer");
        stringList.add("qwert");
        stringList.add("qw");

        List<Integer> list = stringList.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("#aaa");
        list1.add("#bbb");
        list1.add("Cccc");

        list1 = list1.stream()
                .filter(el -> el.startsWith("#")) // почему не работает?
                .map(el -> el.substring(1))

                .collect(Collectors.toList());
        System.out.println(list1);


        String[] arr1 = {"#aaa bbb #ccc ddd" };

        String[] list2 = Arrays.stream(arr1)
           //     .flatMap()
                .filter(el -> el.startsWith("#"))
                .map(s -> s.substring(1))
                .toArray(size -> new String[size]);

        System.out.println("фильтр + мап : " + Arrays.toString( list2));
    }


}
