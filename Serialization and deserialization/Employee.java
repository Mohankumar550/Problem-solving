import java.io.Serializable;

public class Employee implements Serializable{
    private int Id;
    private String Name;

    public Employee(int Id ,String Name) 
    {
        this.Id = Id;
        this.Name = Name;
    }

    public int get_Id()
    {
        return this.Id;

    }
    public String get_Name()
    {
        return this.Name;
    }
    
}