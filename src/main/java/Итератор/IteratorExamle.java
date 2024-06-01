package Итератор;

import java.util.*;

public class IteratorExamle {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

       /* for (Integer i : list) {
            if (i == 2) {
                list.add(5); // конкарент мод ексепшен
            }*/

        // Создание TreeSet с компаратором для сравнения Integer в обратном порядке, обрабатывая null
        Set<Integer> treeSet = new TreeSet<>(Comparator.nullsFirst(Comparator.naturalOrder()));


        // Добавление элементов в TreeSet
        treeSet.add(5);
        treeSet.add(null);
        treeSet.add(2);
        treeSet.add(8);

        // Использование stream() для итерации по элементам TreeSet с компаратором
        treeSet
                .forEach(System.out::println); // Вывод элементов TreeSet в обратном порядке

Map<Integer, Integer> map = new HashMap<>();

map.put(null, 1);
map.put(null, 2);

    }
}






