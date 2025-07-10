import java.util.LinkedHashSet;

public class SampleLinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> test = new LinkedHashSet<>();

        test.add("test");
        test.add("test3");
        test.add("test3");
        test.add("test4");
        test.add("test5");
        

        System.out.println(test);
    }
}
