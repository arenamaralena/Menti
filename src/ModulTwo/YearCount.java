package ModulTwo;

public class YearCount {
    public static int leapYearCount(int year) {
        return (year / 4 + year / 400 - year / 100);
    }
}
