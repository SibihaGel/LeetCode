package SortingMetods;

import java.util.Arrays;

public class Пузырьковая {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSortAndReturnArray(new int[]{3, 1, 0, -6})));
    }

    public static int[] bubbleSortAndReturnArray(int[] arr) {


        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

}

