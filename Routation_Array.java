import java.util.*;
public class Routation_Array {
    public void Rout(int size,int arr[],int k){
      int last=0;
        for(int i=0;i<k;i++){
            last=arr[size-1];
            arr[i]=arr[i+1];     

        }
        arr[0]=last;
       for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
       }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int k=sc.nextInt();

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Routation_Array oj=new Routation_Array();
        oj.Rout(size, arr,k);
    }

    
}