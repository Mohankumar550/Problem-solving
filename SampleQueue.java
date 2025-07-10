import java.util.LinkedList;
import java.util.Queue;

public class SampleQueue {
    public static void main(String[] args) {
        Queue<String> test = new LinkedList<>();

        test.add("test");
        test.add("test2");

        System.out.println(test);

    }
}
