package floder;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Reverse{
    public static void main(String[] args){ 

    Queue<Integer> q=new LinkedList <>();
    q.offer(10);
    q.offer(20);
    q.offer(30);
    q.add(40);
    q.add(50);
    System.out.println(q);
    Stack <Integer> s=new Stack<Integer>();
    while(q.size () >0)
    {
        s.push(q.poll());
    }
    while(s.size () >0)
    {
        q.offer(s.pop());
        
    }
    System.out.println(q);
    
    }
}