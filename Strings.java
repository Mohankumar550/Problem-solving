public class Strings {


    public static void main(String[] args) {


        // String is immutable stored in string pool memory

        String s ="abc";
        System.out.println("str1 reference: " + System.identityHashCode(s));

        s = s + "def"; // here creating new object
        System.out.println(s);
        System.out.println("str1 reference: " + System.identityHashCode(s));


        StringBuilder s1 = new StringBuilder("test");
        System.out.println("sb1 "+System.identityHashCode(s1));

        s1.append("123");
        System.out.println("sb2 "+System.identityHashCode(s1));



        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("sbuf 1 "+System.identityHashCode(sb));
        sb.append(" World");
        
        System.out.println(sb);  // Output: Hello World
        System.out.println("sbuf 2 "+System.identityHashCode(sb));

        


        



    }
    
}
