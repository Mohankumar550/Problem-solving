import java.util.LinkedList;

public class DoubleLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> test = new LinkedList<>();

        test.add(10);
        
        test.addFirst(99);
        test.addLast(100);
        test.add(0, 3);
        System.out.println(test);
    }
}
