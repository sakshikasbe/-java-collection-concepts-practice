import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueJavaExample {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();
        System.out.println(integerQueue.isEmpty());
        System.out.println(integerQueue.add(10));
        System.out.println(integerQueue.add(20));
        System.out.println(integerQueue.add(30));

        System.out.println(integerQueue.isEmpty());
        System.out.println(integerQueue.remove());
        System.out.println(integerQueue.remove());
        System.out.println(integerQueue.remove());

        System.out.println(integerQueue.isEmpty());

    }


}