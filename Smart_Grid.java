import java.util.*;
class Smart_Grid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int count=0;
        int [] l=new int[size];
        for(int i=0;i<size;i++){
            l[i]=sc.nextInt();
        }
        int traget=sc.nextInt();
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(l[i]+l[j]==traget){
                    System.out.println(l[i]+" "+l[j]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}