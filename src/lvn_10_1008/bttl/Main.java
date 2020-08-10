package lvn_10_1008.bttl;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        Map<Key, Value> treeMap = new TreeMap<>();
        Map<Key, Value> hashMap = new HashMap<>();
        hashMap.put(new Key(10), new Value("name10"));
        hashMap.put(new Key(100), new Value("name100"));
        System.out.println(hashMap.get(new Key(10)).getName());

    }
}
