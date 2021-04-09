package Algorithm.Sort;

import java.util.Arrays;

public class RadixSort {

    public static int getMax(int[] array, int arrayLength) {
        int maxNumber = array[0];
        for (int i = 0; i < arrayLength; i++)
            if (array[i] > maxNumber)
                maxNumber = array[i];
        return maxNumber;
    }
    
    public static void countSort(int[] array, int arrayLength, int exp) {
        int[] outputArray = new int[arrayLength];
        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);
        for (i = 0; i < arrayLength; i++) {
            count[(array[i] / exp) % 10]++;
        }
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (i = arrayLength - 1; i >= 0; i--) {
            outputArray[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }
        for (i = 0; i < arrayLength; i++)
            array[i] = outputArray[i];
    }

    static void print(int[] array, int arrayLength) {
        for (int i = 0; i < arrayLength; i++)
            System.out.print(array[i] + " ");
    }

    public static void radixSort(int[] array, int arrayLength) {
        int maxNumber = getMax(array, arrayLength);
        for (int exp = 1; maxNumber / exp > 0; exp *= 10)
            countSort(array, arrayLength, exp);
    }

    public static void main(String[] argv) {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};
        int arrayLength = array.length;
        radixSort(array, arrayLength);
        print(array, arrayLength);
    }
}
