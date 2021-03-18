package Algorithm;

import java.util.Arrays;
import java.util.List;

public interface SortAlgorithm {

    <T extends Comparable<T>> T[] sort(T[] unSorted);

    default <T extends Comparable<T>> List<T> sort(List<T> unSorted) {
        return Arrays.asList(sort(unSorted.toArray((T[]) new Comparable[unSorted.size()])));
    }
}
