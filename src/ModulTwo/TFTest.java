package ModulTwo;

public class TFTest {
    public static boolean booleanExpression(boolean first, boolean second, boolean third, boolean fourth) {
        return (first & second & (!third) & (!fourth)) ^
                (first & (!second) & (!third) & fourth) ^
                (first & (!second) & third & (!fourth)) ^
                ((!first) & second & third & (!fourth)) ^
                ((!first) & second & (!third) & fourth) ^
                ((!first) & (!second) & third & fourth);
    }
}
