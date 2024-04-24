package folder;
import java.util.Queue;
import java.util.LinkedList;
public class Queue1{
    public static void main(String[] args){
        Queue<Object> q=new LinkedList<>();
        q.offer(1);
        q.add(2);
        q.add("hello");
        System.out.println(q);
    }
}