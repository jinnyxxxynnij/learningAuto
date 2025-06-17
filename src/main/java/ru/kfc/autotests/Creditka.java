package ru.kfc.autotests;

public class Creditka extends Cards{
    private Double creditBalance;

    public Creditka (Integer cardNumber, String cardOwnerName, Integer cardExpMonth, Integer cardEXpYear, Double balance, Double creditBalance) {
        super (cardNumber, cardOwnerName, cardExpMonth, cardEXpYear, balance);
        this.creditBalance = creditBalance;
    }

    @Override
    public void getCardBalance() {
        System.out.println("Баланс клиента " + getCardOwnerName() + " составляет: " + getBalance() + ". Баланс накоплений: " + creditBalance);
    }

    @Override
    public void getAllInfo() {
        System.out.println(getCardNumber() + " " + getCardOwnerName() + " " + getCardExpMonth() + "/" + getCardEXpYear() + " " + getBalance() + " " + creditBalance);
    }

    @Override
    public
}
