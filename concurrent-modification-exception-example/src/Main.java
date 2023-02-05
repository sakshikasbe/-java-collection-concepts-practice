import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Long> phoneBook = new HashMap<>();

        //Structural modification of HashMap --> This means new node creation or deletion of node or rehashing
        //initially, modCount=0
        //when entries are added to the map then modCount increases as its structure is modified.
        //3 put --> modCount=3
        //If we want to remove any entry from the map then modCount will reduce.
        //This modCount variable is used by Iterator to iterate over the map entries.

        phoneBook.put("Vikram",8149L);
        phoneBook.put("Mike",4981L);
        phoneBook.put("Phil",9418L);

        Iterator<String> iterator = phoneBook.keySet().iterator();


        while(iterator.hasNext()){
            String name = iterator.next();
            if (name.equals("Mike")){
                //phoneBook.put("Ryan",1234L);
                // New node addition --> We are trying to change modCount value --> modCount=4
                phoneBook.remove("Phil");
            }
            System.out.println(iterator.next());
        }


    }
}

//Iterator know below structure
//0[] --> "Vikram"
//1[] --> "Mike"
//2[] --> "Phil"

//We changed the structure of HashMap inside loop using put method.

//Iterator doesn't know below structure
//0[] --> "Vikram"
//1[] --> "Mike"
//2[] --> "Phil"
//3[] --> "Ryan"
