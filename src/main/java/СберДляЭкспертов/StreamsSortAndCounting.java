package СберДляЭкспертов;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsSortAndCounting {
    public static void main(String[] args) {

        String[] array = {"В Москве сегодня #дождь", "#Дождь это не ливень", "вчера шел #снег", "#Дождь это почти ливень"};


      //  System.out.println("Мы собрали хештеги из строки :"  + "\n" + Arrays.toString(array) +   "\n" + "и посчитали их : "  + "\n" + findHashtegAndSort(array));
      //  System.out.println(sortByPopularHashtag(array));
        extractHashtags(array);
    }

    public static List<String> findHashtegAndSort(String[] arr) {
        return Arrays.stream(arr)
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .map(s -> s.toLowerCase())
                .filter(s -> s.startsWith("#"))
                .sorted()
           //     .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> sortByPopularHashtag(String [] arr) {

        return Arrays.stream(arr)
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("#"))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()

                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }

    public static void extractHashtags(String[] messages) {
       /* return Arrays.stream(messages)
                .flatMap(message -> Stream.of(message.split(" "))) // Разделяем строку на слова
                .filter(word -> word.startsWith("#")) // Отбираем хештеги
                .map(word -> word.substring(1).toLowerCase()) // Убираем # и переводим в нижний регистр
                .distinct() // Удаляем дубликаты
            //    .sorted(Comparator.reverseOrder()) // Сортируем в обратном лексикографическом порядке
                .toArray(String[]::new); // Преобразуем поток обратно в массив
*/
                 Map<String, Long> map = Arrays.stream(messages)
                         .map(s -> s.split(" "))
                         .flatMap(strings -> Arrays.stream(strings))
                         .map(a -> a.toLowerCase())
                         .filter(s -> s.startsWith("#"))
                        .collect(Collectors.groupingBy(s -> s.substring(1), Collectors.counting()));

                       for (Map.Entry entry: map.entrySet()){
                           System.out.println(entry.getKey() + " : " + entry.getValue());
                       }
    }
}
