import java.util.*;
import java.util.LinkedList;

public class QueueImplementation {
    public static void main(String[] args) {
        // Queue<Integer> q1=new PriorityQueue<Integer>();
        Queue<Integer> q1=new LinkedList<Integer>();
        for(int i=0;i<10;i++){
            q1.add(i);
        }

        System.out.println("Queue data look like "+q1);
        System.out.println("before Top element "+q1.peek());
        q1.remove();

        System.out.println("Affter top element "+ q1.peek());
        System.out.println(q1.size());
    }
}
