import java.util.Stack;

public class SampleStack {
    public static void main(String[] args) {
        Stack<String> test =new Stack<>();

        test.add("t1");
        test.add("t2");
        test.add("t3");
        test.add("t4");
        test.add("t1");

        System.out.println(test);
    }
}
