package datastructure;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Mpa2 {
    public static void main(String[] args) {

        List<Integer> Price = new LinkedList<>();
        Price.add(10000);
        Price.add(15000);
        Price.add(25000);
        Price.add(32000);


        List<Integer> IdNumber = new LinkedList<>();
        IdNumber.add(0123);
        IdNumber.add(0456);
        IdNumber.add(1235);
        IdNumber.add(1230);

        List<Integer> Area = new LinkedList<>();
        Area.add(251);
        Area.add(326);
        Area.add(145);
        Area.add(865);

        Map<String, List<Integer>> info = new LinkedHashMap<>();
        info.put("aptPrice", Price);
        info.put("ClientId", IdNumber);
        info.put("aptArea", Area);
        for (Map.Entry entry : info.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}