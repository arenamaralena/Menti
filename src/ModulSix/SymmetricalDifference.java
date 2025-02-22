package ModulSix;

import java.util.Collections;
import java.util.Set;

public class SymmetricalDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<T> set2) {
        Set<? extends T> setWithoutRepeats = set1;
        setWithoutRepeats.removeAll(set2);
        return Collections.unmodifiableSet(setWithoutRepeats);
    }
}
