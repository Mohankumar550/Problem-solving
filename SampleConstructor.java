public class SampleConstructor {
    public static void main(String args[]){      
  Bike obj = new Bike();//creating object      
  obj.run();//calling method      
  }      
}
class Vehicle{      
  //defining a method      
  void run(){System.out.println("Vehicle is running");}      
}      
//Creating a child class      
class Bike extends Vehicle{      
  //defining the same method as in the parent class      
  void run(){System.out.println("Bike is running safely");}     
}  