package Algorithm;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import static Algorithm.Sort.SortUtils.sortMapByValue;


public class TreemapTest {

    public static void main(String[] argv) {
        TreeMap<String, Integer> test = new TreeMap<>();
        test.put("test", 990);
        test.put("test1", 888);
        test.put("test2", 1111);
        test.put("test3", 555);
        Map<String, Integer> m = sortMapByValue(test);
        for (Map.Entry<String, Integer> stringIntegerEntry : m.entrySet()) {
            System.out.print(stringIntegerEntry.getKey() + " ");
            System.out.println(stringIntegerEntry.getValue());
        }

    }
}

