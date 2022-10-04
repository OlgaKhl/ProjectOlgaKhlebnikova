package lesson3;

import java.util.Arrays;

public class TestArrays {

    public static void main(String[] args) {

        testOneArray();
        testTwoArray();
        testTreeArray();
        testFourArray();
        testFiveArray(30, 7);
    }

    private static void testOneArray() {

        int[] arr1 = new int[7];

        arr1[0] = 0;
        arr1[1] = 0;
        arr1[2] = 1;
        arr1[3] = 1;
        arr1[4] = 0;
        arr1[5] = 1;
        arr1[6] = 0;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            System.out.print(" -> ");
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else if (arr1[i] == 0) {
                arr1[i] = 1;
            }
            System.out.println(arr1[i]);
        }
    }

    private static void testTwoArray() {

        int[] arr2 = new int[100];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            System.out.printf("%d ", arr2[i]);
        }
    }

    private static void testTreeArray() {

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.printf("%d ", arr3[i]);
        }
    }

    private static void testFourArray() {

        int[][] arr4 = new int[7][7];

        for (int i = 0; i < arr4.length; i++) {

            for (int j = 0; j < arr4[i].length; j++) {

                if (i == j || j == arr4[j].length - i - 1) {
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }

                System.out.printf("%d ", arr4[i][j]);
            }

            System.out.println();
        }
    }

    private static void testFiveArray(int len, int initialValue) {

        int[] arr5 = new int[len];

        for (int i = 0; i < arr5.length; i++) {

            arr5[i] = initialValue;
            System.out.printf("%d ", arr5[i] );

        }



    }
}

