package ModulTwo;

public class ErrMeasurement {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c)<(1E-4);
    }
}
