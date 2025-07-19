import java.util.*;
public class Demo_List {

    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("aishu");
        ls.add("mano");
        ls.add("priya");
        for(String name:ls){
            System.out.println(name);

        }
        System.out.print(ls);
        System.out.print(ls.indexOf("aishu"));
        ls.get(1);
        ls.size();
    }
}