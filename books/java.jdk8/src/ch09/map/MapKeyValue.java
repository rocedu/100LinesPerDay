package ch09.map;

import java.util.*;
import static java.lang.System.out;

public class MapKeyValue {
    public static void main(String[] args) {
        //Map<String, String> map = new HashMap<>();
        Map<String, String> map = new TreeMap<>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");
        
        out.println("显示键");
        // keySet()傳回Set
        map.keySet().forEach(key -> out.println(key));
        
        out.println("显示值");
        // values()傳回Collection
        map.values().forEach(key -> out.println(key));
    }
}
