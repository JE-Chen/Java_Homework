package Algorithm;

import java.util.Arrays;
import java.util.Collections;

import static Algorithm.SortUtils.print;

public class MergeSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] toSortArray) {
        mergeSort(toSortArray, 0, toSortArray.length - 1);
        return toSortArray;
    }

    public <T extends Comparable<T>> void ascendingSort(T[] toSortArray){
        Collections.reverse(Arrays.asList(sort(toSortArray)));
    }

    private static <T extends Comparable<T>> void mergeSort(T[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] array, int left, int middle, int right) {
        int length = right - left + 1;
        T[] temp = (T[]) new Comparable[length];
        int i = left;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= right) {
            if (array[i].compareTo(array[j]) <= 0) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= middle) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }
        System.arraycopy(temp, 0, array, left, length);
    }

    public static void main(String[] argv) {

        MergeSort mergeSort = new MergeSort();

        Integer[] integers = {3, 555, 4, 8, 6, 33, 22, 115, 3};
        mergeSort.ascendingSort(integers);
        print(integers);

        Character[] characters = {'e', 'k', 'e', 'u', 'n'};
        mergeSort.sort(characters);
        print(characters);
    }

}
