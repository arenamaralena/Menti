package Polimorfism;

public class MaimP {
    public static void makeOffer(BorrowingMoney borrowingMoney){
        System.out.println("Даем "+ borrowingMoney.amount() + " под " + borrowingMoney.percent()
                + "% на срок: " + borrowingMoney.paymentTime());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] tracer;
        tracer = new Throwable().getStackTrace();
        if (tracer.length > 2) {
            return tracer[2].getClassName() + "#" + tracer[2].getMethodName();
        } else return null;
    }
    public static void main(String[] args) {
        Installment installment = new Installment();
        Credit credit = new Credit();
        BorrowingMoney mortgage = new Mortgage();


        makeOffer(installment);
        makeOffer(credit);
        makeOffer(mortgage);



    }
}
