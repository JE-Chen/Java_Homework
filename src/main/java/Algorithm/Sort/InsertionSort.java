package Algorithm.Sort;

import static Algorithm.Sort.SortUtils.more;
import static Algorithm.Sort.SortUtils.print;

public class InsertionSort implements SortAlgorithm {
    public static void main(String[] argv) {

        InsertionSort sort = new InsertionSort();

        Integer[] integers = {3, 555, 4, 8, 6, 33, 22, 115, 3,777,55,66,123};
        sort.sort(integers);
        print(integers);

        String[] strings = {"a", "x", "y", "z", "w"};
        sort.sort(strings);
        print(strings);

        Float[] floats = {3.7f, 8.5f, 7.7f, 6.5f};
        sort.sort(floats);
        print(floats);
    }

    /**
     * @param unsorted the array we want to sort
     * @return sorted array
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        int swapCount = 0;
        int compareCount = 0;
        for (int index = 1; index < unsorted.length; index++) {
            T key = unsorted[index];
            int forward = index - 1;
            while (forward >= 0 && more(key, unsorted[forward])) {
                swapCount++;
                compareCount++;
                unsorted[forward + 1] = unsorted[forward];
                forward--;
            }
            compareCount++;
            unsorted[forward + 1] = key;
        }
        System.out.println("交換次數: " + swapCount);
        System.out.println("比較次數: " + compareCount);
        return unsorted;
    }
}
