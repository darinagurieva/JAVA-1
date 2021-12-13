class HW1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = -6;
        int b = 10;
        System.out.println("Sum is " + (a + b >= 0 ? "positive" : "negative"));
    }

    static void printColor() {
        int value = 126;
        if (value <= 0) {
            System.out.println("RED");
        }
        if (value > 0 && value <= 100) {
            System.out.println("YELLOW");
        }
        if (value > 100) {
            System.out.println("GREEN");
        }
        System.out.println("Checking completed");
    }

    static void compareNumbers() {
        int a = 87;
        int b = 198;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}