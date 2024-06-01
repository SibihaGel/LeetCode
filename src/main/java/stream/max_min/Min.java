package stream.max_min;

import stream.filter.Students;

import java.util.ArrayList;
import java.util.List;

public class Min {
    public static void main(String[] args) {
        Students students1 = new Students("Ivan", 'm', 22, 1, 8.3);
        Students students2 = new Students("Ser", 'm', 29, 2, 6.3);
        Students students3 = new Students("Sanya", 'f', 24, 2, 4.3);
        Students students4 = new Students("Petay", 'f', 30, 5, 6.3);
        Students students5 = new Students("Prochor", 'f', 41, 3, 5.3);

        List<Students> list = new ArrayList<>();
        list.add(students1);
        list.add(students2);
        list.add(students3);
        list.add(students4);
        list.add(students5);

        Students student = list.stream()

                .max((st1, st2) -> st1.getAge() - st2.getAge())

                .orElseThrow();

        System.out.println(student);
    }
}
