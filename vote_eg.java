import java.util.*;

class vote_eg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        boolean voterId = sc.nextBoolean();
        sc.nextLine();  
        boolean indian = sc.nextBoolean();
        
        if (indian==true) { 
            if (age >= 18) {
                if (voterId==false) {
                    System.out.println("Does not have voter id");
                } else {
                    System.out.println("Can vote");
                }
            } else {
                System.out.println("Does not have voting age");
            }
        } else {
            System.out.println("Person not an Indian");
        }
    }
}
