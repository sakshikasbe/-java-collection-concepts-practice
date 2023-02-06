
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulation = new TreeMap<>();

        cityPopulation.put("Pune",8000000);
        cityPopulation.put("Mumbai",18000000);
        cityPopulation.put("San Francisco",800000);

        cityPopulation.entrySet().forEach(stringIntegerEntry ->
                System.out.println(stringIntegerEntry.getKey() + " "+stringIntegerEntry.getValue()));


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