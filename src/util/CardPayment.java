package util;

public class CardPayment implements PaymentMethod{
    private int balance;

    public CardPayment(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean pay(double amount) {
        if(this.balance >= amount){
            this.balance-=amount;
            System.out.println("Успешная оплата.");
            return true;
        }
        System.out.println("Недостаточно средств.");
        return false;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }
}
