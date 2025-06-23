package ru.kfc.autotests;

public class Bonus extends Card {
    private Double bonusBalance;
    public Bonus (Integer cardNumber, String cardOwnerName, Integer cardExpMonth, Integer cardEXpYear, Double balance, Double bonusBalance) {
        super (cardNumber, cardOwnerName, cardExpMonth, cardEXpYear, balance);
        this.bonusBalance = bonusBalance;
    }

    @Override
    public void showBalanceInfo() {
        System.out.println("Баланс клиента " + getCardOwnerName() + " составляет: " + getBalance() + ". Баланс бонусных баллов: " + bonusBalance);
    }

    @Override
    public void getAllInfo() {
        super.getAllInfo();
        System.out.println("Баланс бонусных баллов: " + bonusBalance);
    }
/*
    @Override
    public void popolnenie(Double plusBalance) {
        super.popolnenie(plusBalance);
        System.out.println("У вас " + bonusBalance + " баллов.");
    }*/

    @Override
    public void trata(Double minusBalance) {
        if (getBalance() >= minusBalance) {
            setBalance(getBalance() - minusBalance);
            bonusBalance = bonusBalance + minusBalance * 0.01;
            System.out.println("Вы потратили " + minusBalance + ". Ваш новый баланс: " + getBalance() + ". Баланс бонусных баллов: " + bonusBalance);
        }
    }
}
