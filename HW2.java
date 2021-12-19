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
        printNTimes("THIS IS JAAAAVAAAA", 5);
    }

    static Boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void checkPositiveOrNegative(int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative");
    }

    static boolean boolCheckPositiveOrNegative(int a) {
        return a < 0;
    }

    static void printNTimes(String s, int N) {
        int i;
        for (i = 0; i < N; i++) {
            System.out.println(s);
        }
    }
}