package ModulTwo;


import java.math.BigInteger;

public class Main {
    String[] roles = {
            "Городничий", "Аммос Федорович",
            "Лука",
            "Лука Лукич", "Борис"};
    String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Лука: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Лука: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

    TFTest test = new TFTest();
    boolean b = test.booleanExpression(true, true, false, false);
    YearCount yearCount = new YearCount();
    int countOfLeapYears = yearCount.leapYearCount(20);
    ErrMeasurement errMeasurement = new ErrMeasurement();
    Boolean isErrLittle = errMeasurement.doubleExpression(0.1, 0.2, 0.3);
    ChangeBit changeBit = new ChangeBit();
    int numberAfterChange = changeBit.flipBit(1, 0);
    SymbolUni symbolUni = new SymbolUni();
    char newSymbol = symbolUni.charExpression(29);
    TwoPowers twoPowers = new TwoPowers();
    boolean isNumber = twoPowers.isPowerOfTwo(8);
    Paliondrome paliondrome = new Paliondrome();
    boolean isStringPal = paliondrome.isPalindrome("Madam, I'm Adam!");
    Factorial factorial = new Factorial();
    BigInteger factOfNumber = factorial.factorial(6);
    TwoArraysInOne twoArraysInOne = new TwoArraysInOne();
    int[] newArray = twoArraysInOne.mergeArrays(new int[]{0, 2, 2}, new int[]{1, 3});
    Script script = new Script();
    String rolesAndLines = script.printTextPerRole(roles, textLines);

    public static void main(String[] args) {
        System.out.println("");

    }
}
