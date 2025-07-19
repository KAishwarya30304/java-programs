import java.lang.Runtime.Version;
import java.util.*;
class Vechiles{
    public void Display(){
    String model;
     int Version;
   
    }
    public void show(){
        System.out.println("this is the world of motors");
    }

}
class Car extends Vechiles{
    public void CarDisplay(String model,int Version){
        System.out.println(model);
        System.out.println(Version);
    }
}
class Bike extends Vechiles {
    int v=30;
    public void BikeDisplay(String model,int Version){
        System.out.println(model);
        System.out.println(" beforw "+Version);


    }
     
}
class Update_Bike extends Bike{

    @Override
    
    public void BikeDisplay(String model, int Version) {
        Version=20;
        super.BikeDisplay(model, Version);
        
    }
    public voi
    
}
public class Inheritence {
    public static void main(String[] args) {
        Update_Bike obj=new Update_Bike();
        Car obj1=new Car();
        obj.show();
        obj1.CarDisplay("toyota", 8);
        obj1.show();
        obj.BikeDisplay("Duke", 4);
      

        
    }
}
