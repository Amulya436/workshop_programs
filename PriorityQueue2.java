package folder;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

 public class PriorityQueue2{
    public static void main(String args[])
    {
        PriorityQueue <Integer> pq=new PriorityQueue <Integer>(Collections.reverseOrder());
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            pq.offer(s.nextInt());
            if(i<2){
                System.out.println(-1);

            }
            else
            {
                int first=pq.poll();
                int second=pq.poll();
                int third=pq.poll();
                int res = first*second*third;
                System.out.println(res);
                pq.offer(first);
                pq.offer(second);
                pq.offer(third);
            }
        }
    

    }

 }