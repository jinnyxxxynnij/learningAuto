package ru.kfc.autotests;

public class Main {
    public static void main(String[] args) {
        Cards card1 = new Cards(2201, "Петров", 1, 2026, 0.0);
        Bonus card2 = new Bonus(2202, "Сидоров", 3, 2027, 10.0, 5.0);
        Kopilka card3 = new Kopilka(2203, "Иванов", 12, 2030, 100.0, 15.0);

        card1.getCardBalance();
        card2.getCardBalance();
        card3.getCardBalance();

        card1.getAllInfo();
        card2.getAllInfo();
        card3.getAllInfo();
        System.out.println("------------------------------------------");
        card1.setBalance(101.0);
        card1.getCardBalance();
        System.out.println("------------------------------------------");
        card1.popolnenie(205.5);
        System.out.println("------------------------------------------");
        card1.trata(15.3);
    }
}