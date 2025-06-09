package ru.kfc.autotests;

public class Person {
    int id = 0;
    String fullName;
    int age;
    public static int idCounter = 0;

    //конструктор с параметрами
    public Person (int id, String fullName, int age) {
        this();
        this.id = idCounter++;
        this.fullName = fullName;
        this.age = age;
    }

    //конструктор без параметров
    public Person() {
        this.id = idCounter++;
        System.out.println("");
    }


    public void talk() {
        if (id == 2) {
            System.out.println("Привет, я, " + fullName + ", избранный!");
        } else if (fullName != null) {
            System.out.println("Привет, я - " + fullName + " и мне " + age + " лет");
        }
        else System.out.println("_");
    }
    public static void count() {
        System.out.println("Текущее значение счётчика - " + idCounter);
    }
}
