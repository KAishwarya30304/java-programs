import java.util.*;
class Oops{
    private int a;
    private int b;

    public void setter(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int sum(){
        return a+b;
    }
    public static void main(String[] args) {
        Oops obj=new Oops();
        obj.setter(10, 20);
        System.out.println(obj.sum());

        
    }
}