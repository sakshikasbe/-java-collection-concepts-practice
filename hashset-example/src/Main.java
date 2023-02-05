import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> booksToRead = new HashSet<>();

        booksToRead.add("Rich Dad Poor Dad");

        booksToRead.add("7 habits of highly effective people");

        booksToRead.add("Coffee can investing");


        System.out.println(booksToRead.contains("Test book"));

        System.out.println(booksToRead.size());

        booksToRead.forEach(System.out::println);

//        Iterator<String> iterator = booksToRead.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


//        for (Object name: booksToRead.toArray()) {
//            System.out.println(name.toString());
//        }


    }
}