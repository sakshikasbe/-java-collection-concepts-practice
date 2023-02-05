
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * HashMap : HashMap is a data structure that stores key, value pairs.
 * Internally it uses a Node data structure that has hash, key, value, next.
 * Before java8 HashMap was purely LinkedList based.
 * In Java8, this is modified to use LinkedList and Tree(AVL Tree).
 */
public class Main {
    public static void main(String[] args) {

        Map<String, Integer> cityPopulation = new HashMap<>();

        cityPopulation.put("Pune",1000000);
        cityPopulation.put("Mumbai",1800000);
        cityPopulation.put("NYC",1200000);
        cityPopulation.put("London",400000);

        System.out.println("Population of NYC is :" + cityPopulation.get("NYC"));


        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()){
            System.out.println("City Name : " + entry.getKey() + " Population : "+entry.getValue());
        }

        for (Integer pop : cityPopulation.values()){
            System.out.println(pop);
        }

        for (String city : cityPopulation.keySet()){
            System.out.println("City Name : " + city);
        }

        Object[] keys = cityPopulation.keySet().toArray();

        for (int i = 0; i < keys.length; i++) {
            System.out.print(" " + keys[i]);
        }
        System.out.println();


        System.out.println("HashMap Elements in an toString : "+cityPopulation.keySet().toString());

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

        System.out.println("Size of Map is : "+cityPopulation.size());
    }
}