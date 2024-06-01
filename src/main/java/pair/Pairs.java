package pair;

import java.util.*;

public class Pairs {

    public static void main(String[] args) {
        int[] arr = {1, 2, -2, 3, 1, 2, -2};

        System.out.println(findPairs(arr, 5));
        System.out.println(findPairsMap(arr, 5));
        System.out.println(findPairsStream(arr, 5));
    }

    public static List<List<Integer>> findPairs(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(complement);  // Добавляем complement первым
                pair.add(num);  // Затем добавляем num
                result.add(pair);
            }
            seen.add(num);
        }

        return result;
    }

    public static Map<Integer, Integer> findPairsMap(int[] arr, int target) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result.put(arr[i], arr[j]);
                }
            }
        }

        return result;
    }

    public static Map<Integer, Integer> findPairsStream(int[] arr, int target) { //  {1, 2, -2, 3, 1, 2, -2};
        Map<Integer, Integer> result = new HashMap<>();

        Arrays.stream(arr).forEachOrdered(num -> {
            int complement = target - num;
            if (!result.containsKey(complement)) {
                result.put(complement, num);
            }
        });

        return result;
    }
}
