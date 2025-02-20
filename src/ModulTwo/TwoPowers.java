package ModulTwo;

public class TwoPowers {
    public static boolean isPowerOfTwo(int value) {
        int ost;
        value = Math.abs(value);
        if ((value != 0) & (value % 2 == 0)) {
            ost = value / 2;
            while (ost / 2 > 1) {
                if (ost % 2 == 0) {
                    ost = ost / 2;
                } else return false;
            }
            if ((ost / 2 == 1) & (ost % 2 == 0)) {
                return true;
            }
        } else if (value == 1) {
            return true;
        }
        return false;
    }
}
