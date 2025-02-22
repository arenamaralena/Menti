package ZadanieTwo;

import static java.lang.Integer.parseInt;

public class DataFilter {
    public static int lookForBadIndicator(String[] values, int maxCount) {
        int countOfBadIndicator = 0;
        for (int columnNumber = 2; columnNumber < values.length; columnNumber++) {
            if (parseInt(values[columnNumber]) > maxCount) {
                countOfBadIndicator++;
            }
        }
        return countOfBadIndicator;
    }
}
