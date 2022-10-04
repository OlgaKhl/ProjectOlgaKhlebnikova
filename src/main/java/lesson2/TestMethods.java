package lesson2;

public class TestMethods {

    public static void main(String[] args) {

        System.out.println(isSumBetween10and20(12, 86));
        printPositiveOrNegativeNum(-15);
        System.out.println(isNegative(-100));
        printString("Hello", 4);
    }

    public static boolean isSumBetween10and20(int a, int b) {

        if ((a + b >= 10) && (a + b <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printPositiveOrNegativeNum(int num) {

        if (num >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    public static boolean isNegative(int a) {

        if (a < 0) {
            return true;
        } else if (a >= 0) {
            return false;
        }
        return false;
    }

    public static void printString(String hello, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(hello);
        }
    }
}








