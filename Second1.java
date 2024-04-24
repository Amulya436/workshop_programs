package folder;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Second1{
    public static void main(String[] args){
        LinkedHashMap<Integer, Integer> hm=new LinkedHashMap<Integer, Integer>();
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        } 
        for(int i=0;i<n;i++){
            int key=arr[i];
            if(!hm.containsKey(key)){
                hm.put(key,1);

            }
            else{
                int value=hm.get(key);
            hm.put(key, value+1);
        }
    }
    System.out.println(hm);
    for(int i=0;i<n;i++){
        if(hm.get(arr[i])==1){
            System.out.println(hm);
        }
    }
}
}
