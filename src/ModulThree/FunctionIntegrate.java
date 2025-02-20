package ModulThree;

import java.util.function.DoubleUnaryOperator;

public class FunctionIntegrate {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double stepLength = 0.000001;
        double result = 0.0;
        for (double x = a; x < b; x += stepLength) {
            result += f.applyAsDouble(x) * stepLength;
        }
        return result;
    }
}
