package floder;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args){
        PriorityQueue <Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}