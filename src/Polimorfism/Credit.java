package Polimorfism;

public class Credit extends BorrowingMoney{
    @Override
    int percent() {
        return 13;
    }

    @Override
    String paymentTime() {
        return "2 года";
    }

    @Override
    String amount() {
        return "300 тыс";
    }
}
