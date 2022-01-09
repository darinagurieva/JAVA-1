/*
* Java 1. Homework 7
* @author Darina Guryeva
* @version 09.01.2022
*/

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 5, false);
        cats[1] = new Cat("Murzik", 7, false);
        cats[2] = new Cat("Pyatnyshko", 3, false);
        cats[3] = new Cat("Polosochka", 1, false);
        cats[4] = new Cat("Busya", 9, false);

        Scanner sc = new Scanner(System.in);
        int a;

        Plate plate = new Plate(20);

        for (int i = 0; i < cats.length; i++) {
            if (cats[i].fullness == false && cats[i].appetite <= plate.food) {
                cats[i].eat(plate);
                cats[i].fullness = true;
                System.out.println("Cat " + cats[i].name + " has finished its lunch!");
            } else {
                System.out.println("Cat " + cats[i].name + " can't eat from this plate!");
            }
        }

        System.out.println("How much should I add?");
        a = sc.nextInt();
        plate.increaseFood(a);
        sc.close();

        for (int i = 0; i < cats.length; i++) {
            if (cats[i].fullness == false && cats[i].appetite <= plate.food) {
                cats[i].eat(plate);
                cats[i].fullness = true;
                System.out.println("Cat " + cats[i].name + " has finished its lunch!");
            } else {
                System.out.println("Cat " + cats[i].name + " can't eat from this plate!");
            }
        }

        for (int i = cats.length - 1; i >= 0; i--) {
            System.out.println(cats[i]);
        }
    }
}

class Cat {
    protected String name;
    protected int appetite;
    protected boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

    boolean getFullness() {
        return fullness;
    }

    @Override
    public String toString() {
        return "Cat " + name + ", fullness: " + fullness;
    }

}

class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int food) {
        this.food -= food;
    }

    void increaseFood(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }
}