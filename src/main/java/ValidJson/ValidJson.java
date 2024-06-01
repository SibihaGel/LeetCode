package ValidJson;

public class ValidJson {

    public static void main(String[] args) {
        String text = "private static String someString = \"bla123\";\nprivate static String json = \"{definitions\" : {\"Find\": {\"properties\": {\"id\": {\"type\": \"integer\"}}}}}";

        boolean isValidBrackets;
        System.out.println("Are the number of opening and closing brackets equal? " + checkBrackets(text));
    }

    public static boolean checkBrackets(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == '{') {
                count++;
            } else if (c == '}') {
                count--;
            }

            // Если на каком-то этапе количество закрывающих скобок больше открывающих, это ошибка
            if (count < 0) {
                return false;
            }
        }
        System.out.println(count);
        return count == 0;
    }
}



