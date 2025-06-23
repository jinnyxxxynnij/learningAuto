package ru.kfc.autotests;

public class Kopilka extends Card {
    private Double bonusNakoplenie;
    public Kopilka (Integer cardNumber, String cardOwnerName, Integer cardExpMonth, Integer cardEXpYear, Double balance, Double bonusNakoplenie) {
        super (cardNumber, cardOwnerName, cardExpMonth, cardEXpYear, balance);
        this.bonusNakoplenie = bonusNakoplenie;
    }

    @Override
    public void showBalanceInfo() {
        System.out.println("Баланс клиента " + getCardOwnerName() + " составляет: " + getBalance() + ". Включая накопления: " + bonusNakoplenie);
    }

    @Override
    public void getAllInfo() {
        super.getAllInfo();
        System.out.println("Баланс накоплений: " + bonusNakoplenie);
    }

    @Override
    public void popolnenie(Double plusBalance) {
        bonusNakoplenie = bonusNakoplenie + plusBalance * 0.0005;
        super.setBalance(getBalance() + bonusNakoplenie);
        super.popolnenie(plusBalance);
        System.out.println("У вас накоплено " + bonusNakoplenie + " рублей.");
    }


}
