package stream.chaining;

import stream.filter.Students;

import java.util.*;

public class Chain {
    public static void main(String[] args) {
        int [] arr = {4,4,3,12,5,4,15,4,9};

        int res = Arrays.stream(arr)
                .filter(e -> e %2 != 0) //3, 5, 15, 9
             //  .peek(System.out::print)
                .map(e-> {                  // 1, 5, 5, 3
                    if (e % 3 == 0 ) {
                       e = e / 3;
                    }
                    return e;
                })
            //        .peek(System.out::print)
                .reduce((a, e) -> a + e)       // 1 + 5 + 5 + 3
                .getAsInt();


        System.out.print(res);

        Students students1 = new Students("Ivan", 'm', 22, 1, 8.3);
        Students students2 = new Students("Ser", 'm', 18, 4, 6.3);
        Students students3 = new Students("Sanya", 'f', 24, 2, 4.3);
        Students students4 = new Students("Petay", 'f', 30, 5, 6.3);
        Students students5 = new Students("Prochor", 'm', 21, 3, 5.3);

        List<Students> list = new ArrayList<>();
        list.add(students1);
        list.add(students2);
        list.add(students3);
        list.add(students4);
        list.add(students5);

        list.stream()
                .map(el ->
                {
                    el.setName(el.getName().toUpperCase());
                    return el;
                } )
                .filter(el -> el.getSex() == 'f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .forEach(System.out::println);

    }
}
