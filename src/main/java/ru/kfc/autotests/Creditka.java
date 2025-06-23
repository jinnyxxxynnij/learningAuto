package ru.kfc.autotests;

public class Creditka extends Card {

    private Double creditLimit = 7000.0;
    private Double creditBalance;
    private Double creditOstatok;
    private Double creditPlus;
    private Double creditMinus;

    public Creditka (Integer cardNumber, String cardOwnerName, Integer cardExpMonth, Integer cardEXpYear, Double balance, Double creditBalance) {
        super (cardNumber, cardOwnerName, cardExpMonth, cardEXpYear, balance);
        this.creditBalance = creditBalance;
    }

    @Override
    public void showBalanceInfo() {
        System.out.println("Баланс клиента " + getCardOwnerName() + " составляет: " + getBalance() + ". Баланс кредитных средств: " + creditBalance);
    }

    @Override
    public void getAllInfo() {
        super.getAllInfo();
        System.out.println("Баланс кредитных средств:  " + creditBalance);
    }

    @Override
    //пополнение кредитки
    public void popolnenie (Double plusBalance) {
        if (creditBalance != creditLimit) {
            if (creditBalance + plusBalance >= creditLimit) {
                creditPlus = creditLimit - creditBalance;
                creditBalance = creditBalance + creditPlus;
                creditOstatok = plusBalance - creditPlus;
                setBalance(getBalance()+creditOstatok);
            } else {
                creditBalance = creditBalance + plusBalance;
            }
        } else {
            setBalance(getBalance() + plusBalance);
        }
        System.out.println("Пополнение на сумму: " + plusBalance + ". Ваш баланс: " + getBalance() + ". Баланс кредитных средств:  " + creditBalance);
    }

    //трата с кредитки
    @Override
    public void trata (Double minusBalance) {
        if (getBalance() + creditBalance > minusBalance) {
            if (getBalance() < minusBalance) {
                creditBalance = creditBalance - (minusBalance - getBalance());
                setBalance(0.0);
            } else {
                setBalance(getBalance() - minusBalance);
            }
            System.out.println("Покупка на сумму:" + minusBalance + ". Баланс счета: " + getBalance() + ". Баланс кредитных средств:  " + creditBalance);
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}

