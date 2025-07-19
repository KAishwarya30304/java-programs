import java.util.*;
public class Getter_Settee {
    private String name ;
    private int salary;
     public Getter_Settee(String name,int salary){
        this.name=name;
        this.salary=salary;
     }
     public void getter(){
        System.out.println(name);
        System.out.println(salary);
     }
public void setter(String name,int salary){
    this.name=name;
    this.salary=salary;
    System.out.println(name+" hello ");
    System.out.println("salary is :"+ salary);
}
    public static void main(String[] args) {
        Getter_Settee obj=new Getter_Settee("aishu",30000);
        obj.getter();
        obj.setter("Aishu",400000);
        
    } 
}
