package Algorithm.Sort;

import static Algorithm.Sort.SortUtils.*;

public class InsertionSort implements SortAlgorithm {
    /**
     * @param unsorted the array we want to sort
     * @return sorted array
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        for (int index = 1; index < unsorted.length; index++) {
            T key = unsorted[index];
            int forward = index - 1;
            while (forward >= 0 && more(key, unsorted[forward])) {
                unsorted[forward + 1] = unsorted[forward];
                forward--;
            }
            unsorted[forward + 1] = key;
        }
        return unsorted;
    }

    public static void main(String[] argv) {

        InsertionSort sort = new InsertionSort();

        Integer[] integers = {5, 8, 9, 6, 3, 4, 2};
        sort.sort(integers);
        print(integers);

        String[] strings = {"a", "x", "y", "z", "w"};
        sort.sort(strings);
        print(strings);

        Float[] floats = {3.7f, 8.5f, 7.7f, 6.5f};
        sort.sort(floats);
        print(floats);
    }
}
