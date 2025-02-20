package Polimorfism;

public class Installment extends BorrowingMoney{
    @Override
    int percent() {
        return 6;
    }

    @Override
    String paymentTime() {
        return "20 лет";
    }

    @Override
    String amount() {
        return "6 млн";
    }
}
