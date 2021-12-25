/*
* Java 1. Homework 6
* @author Darina Guryeva
* @version 25.12.2021
*/

class HW6 {
    public static void main(String[] args) {
        int q = (int) (Math.random() * 600);
        int s = (int) (Math.random() * 10);
        int d = (int) (500 + Math.random() * 2);
        IAnimal cat = new Cat("Pushok", "white", 2, 200, 0);
        IAnimal dog = new Dog("Bobik", "multi-color", 3, 500, 10);
        IAnimal[] animals = { cat, dog };
        for (IAnimal a : animals) {
            a.run(q);
            a.swim(q);

            System.out.println();

            a.run(s);
            a.swim(s);

            System.out.println();

            a.run(d);
            a.swim(d);

            System.out.println();
        }
    }
}

class Cat extends Animal {
    Cat(String name, String color, int age, int maxRun, int maxSwim) {
        super(name, color, age, maxRun, maxSwim);
    }

    @Override
    public void run(int distance) {
        if (this.maxRun >= distance)
            System.out.println(this.name + " run " + distance + " meters");
        else
            System.out.println(this.name + " can't run so much!");

    }

    @Override
    public void swim(int distance) {
        System.out.println("Sorry, but cats don't swim!");
    }
}

class Dog extends Animal {
    Dog(String name, String color, int age, int maxRun, int maxSwim) {
        super(name, color, age, maxRun, maxSwim);
    }

    @Override
    public void run(int distance) {
        if (this.maxRun >= distance)
            System.out.println(this.name + " run " + distance + " meters");
        else
            System.out.println(this.name + " can't run so much!");

    }

    @Override
    public void swim(int distance) {
        if (this.maxSwim >= distance)
            System.out.println(this.name + " swam " + distance + " meters");
        else
            System.out.println(this.name + " can't swim so much!");

    }
}

interface IAnimal {
    void run(int distance);

    void swim(int distance);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected String color;
    protected int age;
    protected int maxRun;
    protected int maxSwim;

    Animal(String name, String color, int age, int maxRun, int maxSwim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }
}
