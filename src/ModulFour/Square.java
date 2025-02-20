package ModulFour;

public class Square {
    public static double sqrt(double x) throws IllegalArgumentException {
        if (x < 0) throw new IllegalArgumentException("Expected non-negative number, got" + x);
        return Math.sqrt(x); // your implementation here
    }

    public static String getCallerClassAndMethodName() {

        StackTraceElement[] tracer;
        tracer = new Throwable().getStackTrace();
        if (tracer.length > 2) {
            return tracer[2].getClassName() + "#" + tracer[2].getMethodName();
        } else return null;

    }
}
