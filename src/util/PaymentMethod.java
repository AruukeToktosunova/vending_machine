package util;

public interface PaymentMethod {
    boolean pay(int amount);
    int getBalance();
}
