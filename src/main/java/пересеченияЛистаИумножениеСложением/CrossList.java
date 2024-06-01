package пересеченияЛистаИумножениеСложением;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CrossList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 1, 2, 3, 5, 1));
        List<Integer> list2 = new ArrayList<>(List.of(4, 1, 5, 1));

        List<Integer> result = getIntersection(list1, list2);
        System.out.println("Результирующий список с пересекающимися элементами: " + result);

        int multiPly = multiply(-3, -5);
        System.out.println("Результат умножения сложением : " + multiPly);
    }

    public static List<Integer> getIntersection(List<Integer> list1, List<Integer> list2) {
        CopyOnWriteArrayList<Integer> result = new CopyOnWriteArrayList<>();

        for (Integer num : list1) {
            if (list2.contains(num)) {
                result.add(num);
                list2.remove(num); // Удаляем элемент из list2, чтобы не добавить его дважды
            }
        }

        return result;
    }

    private static int multiply(int a, int b) {
        int result = 0;

        if (b < 0) {
            a = a * -1;
            b = -b;
        }

        for (int i = 0; i < b; i++) {
            result += a;
        }

        return result;
    }

}



