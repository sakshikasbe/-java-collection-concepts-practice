import java.util.*;

/**
 * Linked --> Doubly LinkedList --> to maintain insertion order
 * Hash --> Hashing Algorithm
 * Map --> Entry --> Key, Value pairs
 */

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> cityPopulation = new LinkedHashMap<>(16,0.75f,false);


        cityPopulation.put("Pune",8000000);
        cityPopulation.put("Mumbai",18000000);
        cityPopulation.put("San Francisco",800000);

        System.out.println("Value against Pune : "+ cityPopulation.get("Pune"));

        Set<Map.Entry<String,Integer>> cityPopEntries =cityPopulation.entrySet();


        for (Map.Entry<String,Integer> entry : cityPopEntries) {
            System.out.println("Kay : " + entry.getKey() + " Value : "+entry.getValue());
        }

        Collection<Integer> values =cityPopulation.values();

        values.forEach(value -> System.out.println("Value from Collection " + value));

        Set<String> keys = cityPopulation.keySet();

        keys.forEach(key -> System.out.println("Key from keys Set "+ key));

        if (cityPopulation.containsKey("Pune")){
            cityPopulation.put("Pune",9000000);
        }

        if (cityPopulation.containsValue(400000)){
            System.out.println("The cityMap contains value 4M");
        }

        if (cityPopulation.isEmpty()){
            System.out.println("Empty map");
        } else {
            System.out.println("Map is not empty");
        }

    }
}
