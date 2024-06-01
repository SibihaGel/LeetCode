package stream.collect;

import stream.filter.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {
        Students students1 = new Students("Ivan", 'm', 22, 1, 8.3);
        Students students2 = new Students("Ser", 'm', 18, 4, 6.3);
        Students students3 = new Students("Sanya", 'f', 24, 2, 4.3);
        Students students4 = new Students("Petay", 'm', 30, 5, 6.3);
        Students students5 = new Students("Prochor", 'f', 21, 3, 5.3);

        List<Students> list = new ArrayList<>();
        list.add(students1);
        list.add(students2);
        list.add(students3);
        list.add(students4);
        list.add(students5);

        Map<Character, List<Students>> map = list.stream()
                .map(students -> {
                    students.setName(students.getName().toUpperCase());

                    return students;
                })
                .collect(Collectors.groupingBy(s -> s.getSex()));


      //  System.out.println(map);

        for (Map.Entry<Character, List<Students>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }


    }
}
