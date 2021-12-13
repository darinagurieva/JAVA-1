/*
* Java 1. Homework 2
* @author Darina Guryeva
* @version 13.12.2021
*/

class HW2 {
    public static void main(String[] args) {
        System.out.println(checkSum(10, 5));
        System.out.println(checkSum(30, 5));
        checkPositiveOrNegative(-11);
        checkPositiveOrNegative(11);
        System.out.println(boolCheckPositiveOrNegative(-4));
        System.out.println(boolCheckPositiveOrNegative(4));
        printNTimes(3);
    }

    static Boolean checkSum(int a, int b) {
        int summa = a + b;
        if (summa >= 10 && a + b <= 20)
            return true;
        else
            return false;
    }

    static void checkPositiveOrNegative(int a) {
        if (a >= 0)
            System.out.println("This digit is " + a + " and it is positive");
        else
            System.out.println("This digit is " + a + " and it is negative");
    }

    static boolean boolCheckPositiveOrNegative(int a) {
        if (a < 0)
            return true;
        else
            return false;
    }

    static void printNTimes(int N) {
        int i;
        for (i = 0; i < N; i++) {
            System.out.println("This is JAAAAAVAAAAAA!");
        }
    }
}