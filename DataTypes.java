public class DataTypes {
    public static void main(String args[]) {

        int a = 10;

        // Primitive to float (explicit type casting)
        float b = (float) a;

        // Primitive to String
        String c = String.valueOf(b);
        System.out.println("Primitive to String: " + c);

        // Autoboxing: primitive float to Float wrapper
        Float s = b;
        System.out.println("Autoboxed Float: " + s);

        // Unboxing: Float wrapper to primitive float
        float d = s;
        System.out.println("Unboxed float: " + d);

        // String to primitive (int)
        String st = "123";
        int in = Integer.parseInt(st);
        System.out.println("String to int: " + in);
    }
}
