package selfwork11.task02;

import java.util.*;

public class EnterSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {

                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }

        }
        System.out.println(map);

        int maxValue = (Collections.max(map.values()));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                System.out.println(entry.getKey());
            }
        }
    }
}
