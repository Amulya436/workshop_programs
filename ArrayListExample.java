import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args){
ArrayList<Object> l1= new ArrayList<>();
l1.add("apple");
l1.add("Banana");
l1.add("Orange");
l1.get(1);
l1.remove(1);
l1.add(78);
l1.add(78.09);
System.out.println("Elements at index 0: " +l1.get(0));
System.out.println("Elements in the ArrayList "+l1); 
    for (Object fruit: l1) {
System.out.println(fruit);
    }      
    }
    
}