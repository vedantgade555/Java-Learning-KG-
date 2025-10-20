package MapInterface;

import java.util.HashMap;

public class TestingMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Vedant",55);
        map.put("Anchit",122);
        map.put("Pramod",25);
        map.put("Yash",0);

        System.out.println(map.size());
        System.out.println(map.get("Vedant"));
        System.out.println(map.containsKey("Yash"));
        System.out.println(map.remove("Yash"));
        System.out.println(map);

        for(String key:map.keySet())
        {
            System.out.printf("%s : %s",key,map.get(key));
        }
    }
}
