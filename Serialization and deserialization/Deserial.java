import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Deserial {

    public static void main(String[] args) {


        try (FileInputStream fis = new FileInputStream("employee.ser");
        ObjectInputStream ois=new ObjectInputStream(fis)){

            Employee emp=(Employee) ois.readObject();

            System.out.println(emp.get_Name());
            
        }catch(Exception e){
            e.printStackTrace();
        }
        


    }
    
}
