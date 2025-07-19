import java.util.*;
class Node{
    int data;
    Node next;
}

public class Sum_LL{
     static Node head=null;
     public static void add_element(int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        if(head==null){
            head=newnode;
        }else{
            Node temp=head;
            while (temp.next!=null) {
             temp=temp.next;
            }
          temp.next=newnode;

        }
     }

    public static void Sum_even(){
        int sum=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                sum+=temp.data;
            }
            temp=temp.next;
        }
        System.out.println("The sum even num is : "+sum);

    }
    public static void Sum_odd(){
        int sum=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data%2!=0){
                sum+=temp.data;
            }
            temp=temp.next;
        }
        System.out.println("The sum od odd num is : "+sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            add_element(data);
        }
        Sum_even();
        Sum_odd();
    }
    
}