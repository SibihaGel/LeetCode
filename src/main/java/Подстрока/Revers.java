package Подстрока;

import java.util.Arrays;

public class Revers {

        public static String reverseString(String str) {

            char[] charArray = str.toCharArray();

            int start = 0;
            int end = str.length() - 1;


            while (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }

            return new String(charArray);
        }

        public static void main(String[] args) {
            String originalString = "Hello, World!";
            //   String reversedString = reverseString(originalString);

            System.out.println("Original String: " + originalString);
        //    System.out.println("Reversed String: " + reversedString);

            reverseStreamToString(originalString);
        }

        public static void reverseStreamToString(String str) {

        StringBuilder sb = new StringBuilder((str)
        .chars() // Преобразование строки в поток символов (IntStream)
        .mapToObj(c -> (char) c) // Преобразование каждого символа в объект типа Character
        .reduce("", (s, c) -> c + s, String::concat)); // Объединение символов в обратном порядке

            System.out.println(sb.toString());
        }
}



