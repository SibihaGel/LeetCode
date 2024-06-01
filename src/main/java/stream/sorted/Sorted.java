package stream.sorted;

import stream.filter.Students;

import java.util.*;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 0};

        arr = Arrays.stream(arr)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(arr));

        Students students1 = new Students("Ivan", 'm', 22, 1, 8.3);
        Students students2 = new Students("Ser", 'm', 18, 4, 6.3);
        Students students3 = new Students("Sanya", 'm', 24, 2, 4.3);
        Students students4 = new Students("Petay", 'm', 30, 5, 6.3);
        Students students5 = new Students("Prochor", 'm', 21, 3, 5.3);

        List<Students> list = new ArrayList<>();
        list.add(students1);
        list.add(students2);
        list.add(students3);
        list.add(students4);
        list.add(students5);

        list = list.stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .collect(Collectors.toList());
        System.out.println(list);


        Map<Students, String> map = new HashMap<>();
        int count = 1;
        while (true) {

            Students key = new Students();
            map.put(key, "string");
            if (map.get(key) != null) {

                map.forEach((k,v) -> System.out.println("key : " + k + " Value : " + v));


                break;
            }count++;
        }
        System.out.println(count);
    }
}

