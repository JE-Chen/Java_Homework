package Algorithm;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import static Algorithm.Sort.SortUtils.sortByValue;


public class TreemapTest {

    public static void main(String[] argv) {
        TreeMap<String, Integer> test = new TreeMap<>();
        test.put("test", 990);
        test.put("test1", 888);
        test.put("test2", 1111);
        test.put("test3", 555);
        Map m = sortByValue(test);
        Iterator i = m.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry map = (Map.Entry) i.next();
            System.out.print(map.getKey() + " ");
            System.out.println(map.getValue());
        }

    }
}

