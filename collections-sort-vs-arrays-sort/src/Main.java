import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>();

        guestList.add("Tom");
        guestList.add("Bob");
        guestList.add("Mike");
        guestList.add("Peter");

        Collections.sort(guestList);

        Integer[] evenNumber = {0,12,4,16,8};//declared and initialized

        Arrays.sort(evenNumber);
    }
}