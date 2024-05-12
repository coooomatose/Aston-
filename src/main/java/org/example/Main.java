import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        checkSumSign();
    }

    // method 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // method 2
    public static void checkSumSign() {
        int a = 10;
        int b = -5;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // method 3
    public static void printColor() {
        int value = 50; // любое значение
        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    // method 4
    public static void compareNumbers() {
        int a = 5;
        int b = 3;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // method 5

    //{
    //            int num1 = 5;
    //            int num2 = 6;
    //
    //            System.out.println(isSumInRange(num1, num2));
    //        }

    public static boolean isSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }

    // method 6
    // {
    //            checkNumber(5);
    //            checkNumber(-3);
    //            checkNumber(0);
    //        }
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is a negative number.");
        }
    }

    //method 7
    //int num = -5;
    //        System.out.println(isNegative(num))

    public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    // method 8
    // printStringMultipleTimes("Hello", 5)
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // method 9
    // int year = 2024;
    //        if (isLeapYear(year)) {
    //            System.out.println(year + " is a leap year.");
    //        } else {
    //            System.out.println(year + " is not a leap year.");
    //        }
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }



    // method 10
//  int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 0) {
//                array[i] = 1;
//            } else {
//                array[i] = 0;
//            }
//        }
//
//        System.out.print("Modified array: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

    // method 11
// int[] arr = new int[100];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//
//        // Вывод значений массива для проверки
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

    // method 12
// int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 6) {
//                array[i] *= 2;
//            }
//        }
//
//        for (int num : array) {
//            System.out.print(num + " ");
//        }

    // method 13
//int n = 5; // размерность массива
//        int[][] array = new int[n][n]; // создание двумерного массива
//
//        // заполнение главной диагонали единицами
//        for (int i = 0; i < n; i++) {
//            array[i][i] = 1;
//        }
//
//        // вывод массива на экран
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

    // method 14
// int len = 5;
//        int initialValue = 10;
//
//        int[] result = createArray(len, initialValue);
//        System.out.println(Arrays.toString(result))
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}






