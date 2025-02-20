package ModulFour.Abstract;

public class FunctionSquare extends AbstractExample {
    private final int b;
    private final byte x;

    public FunctionSquare(int x, int b, byte x1) {
        super(x);
        this.b = b;
        this.x = x1;
    }

    @Override
    public String function() {
        return "x * x =" + (x * x);
    }
}
