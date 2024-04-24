import java.util.ArrayList;

interface PositionalList<E> {
    void insert(E element, int index);
    void remove(int index);
    void set(int index, E element);
    E get(int index);
    boolean isEmpty();
    int size();
}
    class ArrayListPositionalList <E> implements PositionalList<E> {

    
    private ArrayList<E> list;
    public ArrayListPositionalList() {
        list = new ArrayList<>();

    }
    public void insert(E element, int index){
         list.add(index, element);
    }
    public void remove(int index) {
        list.remove(index);
    }
    public void set(int index, E element){
        list.set(index, element);

    }
    public E get(int index) {
        return list.get(index);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int size() {
        return list.size();
    }
    }
    class Test {
    public static void main(String[] args){
        PositionalList<String> list = new ArrayListPositionalList<>();
        list.insert("a", 0);
        list.insert("b", 1);
        list.insert("c", 2);
        list.remove(1);
        list.set(0,"d");
        String element = list.get(1);
        boolean empty = list.isEmpty();
        int size = list.size();
        System.out.println("List after operations:");
        for (int i = 0; i < list.size(); i++){

        System.out.println(list.get(i));
        }
        System.out.println("Is list empty? " +empty);
        System.out.println("Size of list: "+size);
        System.out.println("Element at position 2: "+element);
    }
}
