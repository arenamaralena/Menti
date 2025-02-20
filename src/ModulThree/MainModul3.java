package ModulThree;

import java.util.function.DoubleUnaryOperator;

import static ModulThree.FunctionIntegrate.integrate;
import static ModulThree.Robot.findDifference;

public class MainModul3 {

    public static void moveRobot(Robot robot, int toX, int toY) {
        int xStart = robot.getX();
        int yStart = robot.getY();
        int differenceX = findDifference(xStart, toX);
        int differenceY = findDifference(yStart, toY);

        if (xStart < toX) {
            robot.turn(robot, Direction.RIGHT);
            robot.go(robot, differenceX);

        } else if (xStart > toX) {
            robot.turn(robot, Direction.LEFT);
            robot.go(robot, differenceX);
        }
        if (yStart < toY) {
            robot.turn(robot, Direction.UP);
            robot.go(robot, differenceY);

        } else if (yStart > toY) {
            robot.turn(robot, Direction.DOWN);
            robot.go(robot, differenceY);
        }

    }

    public static double myFunction(double x) {
        return x * x;
    }

    public static void main(String[] args) {


        Robot robot = new Robot(1, -10, Direction.DOWN);
        moveRobot(robot, -10, 20);
//
//        ComplexNumber first = new ComplexNumber(2, 1);
//        ComplexNumber second = new ComplexNumber(1, 2);
//        System.out.println(first.equals(second));

        String string = "Ilovedogs";
        byte[] bytes = string.getBytes();
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(bytes);
        System.out.println(asciiCharSequence.delete(2, 7));
        System.out.println(asciiCharSequence.delete(0, 1));
        System.out.println(asciiCharSequence.delete(7, 9));

        integrate(x -> x * x, 0, 10);

        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() {
            @Override
            public double applyAsDouble(double x) {
                return x * x;
            }
        };
        integrate(doubleUnaryOperator, 0, 10);

        DoubleUnaryOperator f = MainModul3::myFunction;
        integrate(f, 0, 10);


        String[] spamKeywords = {"first", "bad"};
        String[] wordsForCount = {"джава"};
        int maxNumber = 5;
        TextAnalyzer[] textAnalyzers1 = {new SpamAnalyzer(spamKeywords), new NegativeTextAnalyzer(), new MaxNumberOfWordsAnalyzer(maxNumber, wordsForCount)};
        TextAnalyzer[] textAnalyzers2 = {new SpamAnalyzer(spamKeywords), new MaxNumberOfWordsAnalyzer(maxNumber, wordsForCount), new NegativeTextAnalyzer()};


        // тестовые комментарии
        String[] tests = new String[4];
        tests[0] = "джава это круто"; // OK
        tests[1] = "я джава, я учу людей джава, джава чертовски хорош, джава это куча денег, джава";
        tests[2] = "джава джаваскрипт";
        tests[3] = "джава джава? джава. джава! джава)скрипт";
        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2};
        MainModul3 testObject = new MainModul3();
        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
        for (String test : tests) {
            numberOfAnalyzer = 1;
            System.out.print("test #" + numberOfTest + ": ");
            System.out.println(test);
            for (TextAnalyzer[] analyzers : textAnalyzers) {
                System.out.print(numberOfAnalyzer + ": ");
                System.out.println(testObject.checkLabels(analyzers, test));
                numberOfAnalyzer++;
            }
            numberOfTest++;
        }
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label result = analyzer.processText(text);
            if (result != Label.OK) {
                return result;
            }
        }
        return Label.OK;
    }
}
