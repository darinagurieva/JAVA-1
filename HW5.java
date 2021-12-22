/*
* Java 1. Homework 5
* @author Darina Guryeva
* @version 22.12.2021
*/

public class HW5 {
    public static void main(String[] args) {
        Employee[] emp_arr = new Employee[5];
        emp_arr[0] = new Employee("Avdyushina Anastasia", "Receptionist", "AAvdyushina@gmail.com", "89211234567", 35000,
                23);
        emp_arr[1] = new Employee("Bushueva Anna", "GM Assistant", "ABushueva@gmail.com", "89212345678", 50000, 21);
        emp_arr[2] = new Employee("Feldman Yanina", "HR Director", "YFeldman@gmail.com", "89214567890", 75000, 48);
        emp_arr[3] = new Employee("Alexandrov Taras", "IT Director", "TAlexandrov@gmail.com", "89216789012", 80000, 49);
        emp_arr[4] = new Employee("Guryeva Darina", "CRM Support", "DGuryeva@gmail.com", "89217890123", 45000, 24);

        System.out.println("Is 40+ : ");

        for (Employee employee : emp_arr)
            if (employee.getAge() > 40)
                System.out.println(employee);

    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return (name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
}