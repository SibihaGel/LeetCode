package stream.limit;

import stream.filter.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {

    public static void main(String[] args) {


        Students students1 = new Students("Ivan", 'm', 22, 1, 8.3);
        Students students2 = new Students("Ser", 'm', 18, 2, 6.3);
        Students students3 = new Students("Sanya", 'f', 24, 2, 4.3);
        Students students4 = new Students("Petay", 'f', 30, 5, 6.3);
        Students students5 = new Students("Prochor", 'f', 21, 3, 5.3);

        List<Students> list = new ArrayList<>();
        list.add(students1);
        list.add(students2);
        list.add(students3);
        list.add(students4);
        list.add(students5);

        List<Students> list1 = list.stream()
                .sorted((s1,s2)-> (int) (s1.getAvgGrade() - s2.getAvgGrade()))
                .limit(1)
                .collect(Collectors.toList());

        System.out.println(list1);
        System.out.println("---------------------------------------------");

        List<Students> list2 = list.stream()
                .sorted((s1,s2)-> (int) (s1.getAvgGrade() - s2.getAvgGrade()))
                .skip(1)
                .collect(Collectors.toList());

        System.out.println(list2);
    }
}
