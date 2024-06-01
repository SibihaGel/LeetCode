package числовхожденийэлемента;

public class countNumber {

    public static void main(String[] args) {
        task();
    }

    public static void task() {
        String string = "aaaabbcccddd";
        char[] chars = string.toCharArray();

        int maxCount = 0;
        int currentCount = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 1;
            }
        }

        System.out.println("Максимальное количество повторяющихся подряд элементов: " + maxCount);
    }
}
