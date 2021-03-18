package Algorithm;

import java.util.Arrays;
import java.util.Collections;

import static Algorithm.SortUtils.less;
import static Algorithm.SortUtils.print;

public class InsertionSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] toSortArray) {
        for (int index = 1; index < toSortArray.length; index++) {
            T key = toSortArray[index];
            int forward = index - 1;
            while (forward >= 0 && less(key, toSortArray[forward])) {
                toSortArray[forward + 1] = toSortArray[forward];
                forward--;
            }
            toSortArray[forward + 1] = key;
        }
        return toSortArray;
    }

    public <T extends Comparable<T>> void ascendingSort(T[] toSortArray){
        Collections.reverse(Arrays.asList(sort(toSortArray)));
    }

    public static void main(String[] argv) {

        InsertionSort sort = new InsertionSort();

        Integer[] integers = {5, 8, 9, 6, 3, 4, 2};
        sort.ascendingSort(integers);
        print(integers);

        String[] strings = {"a", "x", "y", "z", "w"};
        sort.sort(strings);
        print(strings);

        Float[] floats = {3.7f, 8.5f, 7.7f, 6.5f};
        sort.sort(floats);
        print(floats);
    }
}
