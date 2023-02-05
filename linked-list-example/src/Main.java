import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> guestList = new LinkedList<>();

        guestList.add("Vikram");
        guestList.add("Vishal");
        guestList.add("Vinay");

        //head(contains the addr of first node) --> ["Vikram" | addr of second node] --> ["Vishal" | addr of third node] --> ["Vinay" | addr null] --> null

        guestList.forEach(name -> System.out.println(name));

        System.out.println("second element : " + guestList.get(1));

        System.out.println("Removing 3rd element : " + guestList.remove(2));

        List<String> newGuests = new LinkedList<>();
        newGuests.add("Aditi");
        newGuests.add("Nikita");
        newGuests.add("Anjali");
        guestList.addAll(newGuests);

        System.out.println("List before sorting :");
        guestList.forEach(name -> System.out.println(name));
        Collections.sort(guestList);
        System.out.println("List after sorting :");
        guestList.forEach(name -> System.out.println(name));

//        immutableList = Collections.unmodifiableList(guestList);//immutable list//JDK8

        List immutableList = List.of(newGuests);//JDK9//read only and not add/remove

    }
}