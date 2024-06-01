package Фибоначи;

public class Fibonachi {
    public static void main(String[] args) {
        // Ряд Фибоначи 0 1 1 2 3 5 8 13 ... getFib(7) = 13
        System.out.println(getFib(7));
        System.out.println(getFibNext(3));
    }

    public static int getFib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return getFib(n - 1) + getFib(n - 2);
        }
    }

    // Ряд Фибоначи 0 1 1 2 3 5 8 13 ... getFib(7) = 13
    public static int getFibNext(int n) {

        int res = 0;
        int last = 1;
        int prev = 0;

        if (n <= 1) {
            return n;
        } else {
            for (int i = 2; i <= n; i++) {
                res = last + prev;
                prev = last;
                last = res;

            }
            return res;
        }

    }
}

