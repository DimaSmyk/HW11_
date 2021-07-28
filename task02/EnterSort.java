package selfwork11.task02;

import java.util.*;

public class EnterSort {

    private static List<String> list = new ArrayList<>();
    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        scScan();
        checkRepeat(list);
        twoMaxValue(map);
    }

    public static void scScan() {

        System.out.println("Enter some repeat lines: ");
        Scanner sc = new Scanner(System.in);
        //List<String> list = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }
    }
    public static void checkRepeat(List<String> list) {

        for (String s : list) {
            if (map.containsKey(s)) {

                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }

    public static void twoMaxValue(Map<String,Integer> map) {

        int value = 0;
        String max = "";
        String secondMax = "";

        for (Map.Entry<String, Integer> ent : map.entrySet()) {
            if (ent.getValue() >= value) {
                value = ent.getValue();
                secondMax = max;
                max = ent.getKey();
            }
        }System.out.println("First max value: " + max + "\nSecond max value: " + secondMax);
    }
}
