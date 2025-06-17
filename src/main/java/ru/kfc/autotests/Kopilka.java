package ru.kfc.autotests;

public class Kopilka extends Cards{
    private Double bonusNakoplenie;
    public Kopilka (Integer cardNumber, String cardOwnerName, Integer cardExpMonth, Integer cardEXpYear, Double balance, Double bonusNakoplenie) {
        super (cardNumber, cardOwnerName, cardExpMonth, cardEXpYear, balance);
        this.bonusNakoplenie = bonusNakoplenie;
    }

    //public void get bonusNakoplenie

    public Double getBalance(Double balance, Double bonusNakoplenie) {
        super.getBalance = balance;
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
/*
    @Override
    public double getBalance() {
        return super.getBalance(Double balance, Double bonusNakoplenie) {
            this.getBalance();
            this.bonusNakoplenie =  bonusNakoplenie;
        }
    }

    @Override
    public void setBalance(Double balance, Double bonusNakoplenie) {
        this.setBalance(balance);
        this.bonusNakoplenie = getBalance() * 0.01;
    }
*/

}
