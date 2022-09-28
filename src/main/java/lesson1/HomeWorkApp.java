package lesson1;

import java.math.BigDecimal;

public class HomeWorkApp {

    public static <args> void main(String[] args) {
        System.out.println("Hello world !");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange Banana Apple");

        System.out.print("""
                Orange
                Banana
                Apple
                """);
    }

    public static void checkSumSign() {

        int a = 9;
        int b = -12;

        int c = a + b;

        if (c >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor() {

        int value = 505;

        if (value <= 0)
            System.out.println("красный");


        if (value > 0 && value <= 100)
            System.out.println("желтый");


        if (value > 100)
            System.out.println("зеленый");
    }

    public static void compareNumbers(){
         int a = -9;
         int b = 60;

         if (a >= b)
             System.out.println("a >= b");

         else System.out.println("a < b");

    }
}

