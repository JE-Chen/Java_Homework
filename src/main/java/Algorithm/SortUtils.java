package Algorithm;

import java.util.Arrays;
import java.util.List;

final class SortUtils {

    /**
     * @param array  swap array
     * @param index1 first element
     * @param index2 second element
     * @return true always
     */
    static <T> boolean swap(T[] array, int index1, int index2) {
        T swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
        return true;
    }

    /**
     * @param first first element
     * @param second second element
     * @return which one less
     */
    static <T extends Comparable<T>> boolean less(T first, T second) {
        return first.compareTo(second) < 0;
    }

    static void print(List<?> toPrint) {
        for (Object object : toPrint){
            System.out.print(object + " ");
        }
        System.out.println();
    }

    static void print(Object[] toPrint) {
        System.out.println(Arrays.toString(toPrint));
    }

}
