package Algorithm.Sort;

import static Algorithm.Sort.SortUtils.*;

public class InsertionSort implements SortAlgorithm {

    private int swapCount = 0, compareCount = 0;

    public static void main(String[] argv) {

        InsertionSort insertionSort = new InsertionSort();

        Integer[] integers = {3, 555, 4, 8, 6, 33, 354, 453, 3, 777, 55, 66, 123, 5, 65, 4, 654, 654, 65, 789, 51, 879, 16, 54, 89, 7, 8941, 4, 132, 869, 4, 65, 3, 64};
        insertionSort.sort(integers);
        print(integers);

        String[] strings = {"a", "x", "y", "z", "w"};
        insertionSort.sort(strings);
        print(strings);

        Integer[] sortedIntegers = {5, 4, 3};
        insertionSort.sort(sortedIntegers);
        print(sortedIntegers);

        Float[] floats = {3.7f, 8.5f, 7.7f, 6.5f};
        insertionSort.sort(floats);
        print(floats);

        StudentData[] studentData = {
                new StudentData(97502, "DS", 79, "DM", 76, "LA", 63, "DS"),
                new StudentData(97501, "DS", 76, "DM", 79, "LA", 98, "DS"),
                new StudentData(97523, "DS", 49, "DM", 49, "LA", 78, "DS")};
        insertionSort.sort(studentData);
        printStudentData(studentData);
    }


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
                swapCount++;
                compareCount++;
                unsorted[forward + 1] = unsorted[forward];
                forward--;
            }
            compareCount++;
            unsorted[forward + 1] = key;
        }
        System.out.println("比較次數: " + compareCount);
        System.out.println("交換次數: " + swapCount);
        /* when exec this class
        swapCount = 0;
        compareCount = 0;
         */
        return unsorted;
    }

    @Override
    public String getSortData() {
        String sortData = String.format("使用Insertion Sort排序，系統完成排序共比較%d次，交換元素%d次", compareCount, swapCount);
        swapCount = 0;
        compareCount = 0;
        return sortData;
    }
}
