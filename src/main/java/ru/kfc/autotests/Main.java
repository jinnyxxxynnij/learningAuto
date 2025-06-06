package ru.kfc.autotests;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello ");
        System.out.println("world!");*/

        int[] myArray = new int[20];
        for (int i = 0; i < myArray.length; i ++) {
            myArray[i] = new Random().nextInt(20);
        }
        int maxElement = 0;
        int sumElement = 0;
        int item = 0;

        for (int i = 0; i < myArray.length; i++) {
            item = (myArray[i]);
            System.out.println(item);

            if (item > maxElement) {
                maxElement = item;
            }

            sumElement = sumElement + item;

            }
        System.out.println("2. максимальное число в массиве = " + item);
        System.out.println("3. Сумма всех элементов = " + sumElement);
    }


}