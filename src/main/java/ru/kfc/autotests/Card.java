package ru.kfc.autotests;

public abstract class Card {

    private Integer cardNumber;
    private String cardOwnerName;
    private Integer cardExpMonth;
    private Integer cardEXpYear;
    private Double balance;

    //getters
    public Integer getCardNumber() {
        return cardNumber;
    }

    public String getCardOwnerName() {
        return cardOwnerName;
    }

    public Integer getCardExpMonth() {
        return cardExpMonth;
    }

    public Integer getCardEXpYear() {
        return cardEXpYear;
    }

    public Double getBalance() {
        return balance;
    }

    //setters
    public void setCardExpMonth(Integer cardExpMonth) {
        if (cardExpMonth < 0 || cardExpMonth > 12) {
            System.out.println("Указывая месяц, ведите число от 1 до 12");
            return;
        }
        this.cardExpMonth = cardExpMonth;
    }

    public void setCardEXpYear(Integer cardEXpYear) {
        if (cardEXpYear < 2024 || cardEXpYear > 2050) {
            System.out.println("Указывая год, ведите число от 2025 до 2050");
            return;
        }
        this.cardEXpYear = cardEXpYear;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    //конструктор карт
    public Card(Integer cardNumber, String cardOwnerName, Integer cardExpMonth, Integer cardEXpYear, Double balance) {
        this.cardNumber = cardNumber;
        this.cardOwnerName = cardOwnerName;
        this.cardExpMonth = cardExpMonth;
        this.cardEXpYear = cardEXpYear;
        this.balance = balance;
    }

    //метод получения баланса
    public void showBalanceInfo() {
        System.out.println("Баланс клиента " + cardOwnerName + " составляет: " + balance);
    }

    //пополнение баланса
    public void popolnenie(Double plusBalance) {
        balance = balance + plusBalance;
        System.out.println("Вы пополнилил баланс на " + plusBalance + ". Ваш новый баланс: " + balance);
    }

    //совершение покупки
    public void trata(Double minusBalance) {
        if (balance >= minusBalance) {
            balance = balance - minusBalance;
            System.out.println("Вы потратили " + minusBalance + ". Ваш новый баланс: " + balance);
        }
    }

    //получить всю инфу о карте
    public void getAllInfo() {
        System.out.println(cardNumber + " " + cardOwnerName + " " + cardExpMonth + "/" + cardEXpYear + " " + balance);
    }

}
