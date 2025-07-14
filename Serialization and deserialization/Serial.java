import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Serial {

    public static void main(String[] args) {
            Employee test = new Employee(12,"Mohan");
            System.out.println(test.get_Id());

    
    try (FileOutputStream fos= new FileOutputStream("employee.ser");
    ObjectOutputStream oss = new ObjectOutputStream(fos)){

        oss.writeObject(test);

        System.out.println("completed");



    }
    catch(Exception e)
    {

        e.printStackTrace();

    }
   
}
}

