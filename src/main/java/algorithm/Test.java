package algorithm;

import java.util.HashMap;
import java.util.TreeMap;

public class Test {


    public static void main(String[] argv) {
        HashMap<String, TreeMap<String, Integer>> hashMap = new HashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("DS", null);
        hashMap.put("410877027", treeMap);
        hashMap.put("410877001", null);
        System.out.println(hashMap.get("410877001"));

    }
}
