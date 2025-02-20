package Polimorfism;

public class Mortgage extends BorrowingMoney{
    @Override
    int percent() {
        return 30;
    }

    @Override
    String paymentTime() {
        return "1 год";
    }

    @Override
    String amount() {
        return "100 тыс";
    }
}
