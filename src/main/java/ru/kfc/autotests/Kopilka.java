package ru.kfc.autotests;

public class Kopilka extends Cards{
    private Double bonusNakoplenie;
    public Kopilka (Integer cardNumber, String cardOwnerName, Integer cardExpMonth, Integer cardEXpYear, Double balance, Double bonusNakoplenie) {
        super (cardNumber, cardOwnerName, cardExpMonth, cardEXpYear, balance);
        this.bonusNakoplenie = bonusNakoplenie;
    }
    @Override
    public void getCardBalance() {
        System.out.println("Баланс клиента " + getCardOwnerName() + " составляет: " + getBalance() + ". Баланс накоплений: " + bonusNakoplenie);
    }

    @Override
    public void getAllInfo() {
        System.out.println(getCardNumber() + " " + getCardOwnerName() + " " + getCardExpMonth() + "/" + getCardEXpYear() + " " + getBalance() + " " + bonusNakoplenie);
    }

}
