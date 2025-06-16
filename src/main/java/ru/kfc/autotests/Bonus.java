package ru.kfc.autotests;

public class Bonus extends Cards{
    private Double bonusBalance;
    public Bonus (Integer cardNumber, String cardOwnerName, Integer cardExpMonth, Integer cardEXpYear, Double balance, Double bonusBalance) {
        super (cardNumber, cardOwnerName, cardExpMonth, cardEXpYear, balance);
        this.bonusBalance = bonusBalance;
    }

    @Override
    public void getCardBalance() {
        System.out.println("Баланс клиента " + getCardOwnerName() + " составляет: " + getBalance() + ". Баланс бонусных баллов: " + bonusBalance);
    }

    @Override
    public void getAllInfo() {
        System.out.println(getCardNumber() + " " + getCardOwnerName() + " " + getCardExpMonth() + "/" + getCardEXpYear() + " " + getBalance() + " " + bonusBalance);
    }


}
