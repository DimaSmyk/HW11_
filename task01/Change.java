package selfwork11.task01;

import java.util.HashMap;
import java.util.Map;

public class Change {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Vasya", 1);
        map.put("Pete", 4);
        map.put("Misha", 3);
        map.put("Anna", 28);
        map.put("Valera", 8);
        map.put("Dima", 16);
        map.put("Ruslan", 14);
        map.put("Hleb", 90);
        map.put("Julia", 11);
        map.put("Vlad", 19);

        reverse(map);
    }

    public static void reverse(Map<String, Integer> map) {
        Map<Integer, String> mapFin = new HashMap<>();
        for (Map.Entry<String, Integer> ent : map.entrySet()) {
            String key = ent.getKey();
            Integer value = ent.getValue();
            mapFin.put(value, key);
        }for (Map.Entry<Integer, String> entFin : mapFin.entrySet()){
            Integer keyFin = entFin.getKey();
            String valueFin = entFin.getValue();
            System.out.println(keyFin + " = " + valueFin);
        }
    }
}
