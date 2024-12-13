package util;

public interface PaymentMethod {
    boolean pay(double amount);
    int getBalance();
}
