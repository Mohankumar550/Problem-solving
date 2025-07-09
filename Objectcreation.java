class Car{
    String color = "white";
}


public class Objectcreation {

    public static void main(String[] args) {
        
        Car a =new Car();
        a.color = "blue";

        Car b = new Car();
        b.color = "maroon";

        System.out.println(b.color +" "+ a.color);
    }
    
    
}
