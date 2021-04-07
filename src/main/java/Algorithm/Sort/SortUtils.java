package Algorithm.Sort;

import javax.swing.*;
import java.util.*;

public final class SortUtils {

    /**
     * @param array  the array which element we want to swap
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
     * @param first  first element
     * @param second second element
     * @return true if the first element is less than the second element
     */
    static <T extends Comparable<T>> boolean less(T first, T second) {
        return first.compareTo(second) < 0;
    }

    /**
     * @param first  first element
     * @param second second element
     * @return true if the first element is more than the second element
     */
    static <T extends Comparable<T>> boolean more(T first, T second) {
        return first.compareTo(second) > 0;
    }

    /**
     * @param toPrint the array we want to print
     */
    static void print(List<?> toPrint) {
        for (Object object : toPrint) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    /**
     * @param toPrint the array we want to print
     */
    static void print(Object[] toPrint) {
        System.out.println(Arrays.toString(toPrint));
        System.out.println();
    }

    /**
     * @param toPrint the StudentData we want to print
     */
    static void printStudentData(StudentData[] toPrint) {
        for (StudentData studentData : toPrint) {
            System.out.println(studentData.getData());
        }
        System.out.println();
    }

    public static void printStudentData(StudentData[] toPrint, JTextArea jTextArea) {
        for (StudentData studentData : toPrint) {
            jTextArea.append(studentData.getData() + "\n");
        }
        jTextArea.append("\n");
    }

    /**
     * @param map the map we want to sort
     * @param <K> the map's key
     * @param <V> the map's value
     * @return sorted map
     */
    public static <K, V extends Comparable<? super V>> TreeMap<K, V> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
                    @Override
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                }
        );
        TreeMap<K, V> sortedMap = new TreeMap<K, V>();
        for(Map.Entry<K, V> sortedEntry : sortedEntries)
            sortedMap.put(sortedEntry.getKey(),sortedEntry.getValue());
        return sortedMap;
    }

}
