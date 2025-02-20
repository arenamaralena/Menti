package ModulTwo;

public class TwoArraysInOne {
    public static int[] mergeArrays(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int f = 0, s = 0, r = 0;
        while (f < first.length && s < second.length) {
            if (first[f] < second[s]) {
                result[r] = first[f];
                f++;
                r++;
            } else {
                result[r] = second[s];
                s++;
                r++;
            }
        }
        while (f < first.length) {
            result[r] = first[f];
            f++;
            r++;
        }
        while (s < second.length) {
            result[r] = second[s];
            s++;
            r++;
        }
        return result;
    }
}
