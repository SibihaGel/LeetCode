package stream.filter;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import stream.filter.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {


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

           List<Students> res=  list.stream()
                    .filter(el -> el.getAge() >= 22 && el.getAvgGrade() > 6.0)
                            .collect(Collectors.toList());


        System.out.println(res);

        Stream<Students> stream = Stream.of(students1, students2, students4);
        stream
                .peek(System.out::println)
                .filter(el -> el.name.equals("Ivan"))
                .forEach(students -> {
                    System.out.println(students);
                });
    }

}
