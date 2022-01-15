package datastructure;

import java.util.*;

public class Map1 {

    public static void main(String[] args) {
        Map<String, String> vehicleInfo = new HashMap<>();

        vehicleInfo.put("plate", "JSK2022");
        vehicleInfo.put("DVM inspection", "jun2022");
        vehicleInfo.put("Insurance", "mar2022");
        vehicleInfo.put("DMV registration", "march2022");;

        System.out.println(vehicleInfo.get("plate"));

        List<String> ModelOfToyota = new ArrayList<>();
        ModelOfToyota.add("camry");
        ModelOfToyota.add("RAV4");
        ModelOfToyota.add("yaris");

        List<String> ModelOfNissan = new ArrayList<>();
        ModelOfNissan.add("elantra");
        ModelOfNissan.add("sonata");
        ModelOfNissan.add("rogue");

        List<String> ModelOfChevrolet = new ArrayList<>();
        ModelOfChevrolet.add("malibu");
        ModelOfChevrolet.add("spark");
        ModelOfChevrolet.add("equinox");

        Map<String, List<String>> map = new LinkedHashMap<>();
        map.put("Toyota", ModelOfToyota);
        map.put("Nissan", ModelOfNissan);
        map.put("Chevrolet", ModelOfChevrolet);

        for (int i = 0; i < map.size(); i++) {

        }

       for (Map.Entry entry: map.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
       }




    }
