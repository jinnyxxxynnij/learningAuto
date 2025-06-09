package ru.kfc.autotests;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Person student1 = new Person();

        Person student2 = new Person();
        student2.fullName = "Petrov";
        student2.age = 20;

        Person student3 = new Person();
        student3.fullName = "Sidorov";
        student3.age = 23;

        Person student4 = new Person();
        student4.fullName = "Ivanov";
        student4.age = 36;

        student1.talk();
        student2.talk();
        student3.talk();
        student4.talk();

        student1.count();
        //count();
    }
}