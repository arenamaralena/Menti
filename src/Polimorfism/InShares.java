package Polimorfism;

public class InShares extends BorrowingMoney{
    @Override
    int percent() {
        return 0;
    }

    @Override
    String paymentTime() {
        return "2 месяца";
    }

    @Override
    String amount() {
        return "5 тыс";
    }
}
