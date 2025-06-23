package ru.kfc.autotests;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(2201, "Петров", 1, 2026, 0.0);
        Bonus card2 = new Bonus(2202, "Сидоров", 3, 2027, 10.0, 5.0);
        Kopilka card3 = new Kopilka(2203, "Иванов", 12, 2030, 100.0, 15.0);
        Creditka card4 = new Creditka(2204, "Абрамова", 9, 2036, 2000.0, 1000.0);

        card1.showBalanceInfo();
        card2.showBalanceInfo();
        card3.showBalanceInfo();

        card1.getAllInfo();
        card2.getAllInfo();
        card3.getAllInfo();
        card4.getAllInfo();
        System.out.println("------------------------------------------");
        card1.setBalance(0.0);
        card1.showBalanceInfo();
        System.out.println("------------------------------------------");
        card1.popolnenie(500000.0);
        System.out.println("------------------------------------------");
        card1.trata(4529.5);
        System.out.println("------------------------------------------");
        card1.showBalanceInfo();
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        card2.popolnenie(500000.0);
        card2.showBalanceInfo();
        System.out.println("------------------------------------------");
        card3.popolnenie(340000.0);
        card3.showBalanceInfo();
        System.out.println("------------------------------------------");
        card3.trata(214.52);
        card3.showBalanceInfo();
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        card4.showBalanceInfo();
        card4.trata(2500.0);
        System.out.println("------------------------------------------");
        card4.popolnenie(7000.0);


    }
}