import java.util.Scanner;

public class Profit {
    public void cal(int size,int [] arr){
       int  total=0;
       int count=0;
        for(int i=0;i<size-1;i++){
            if(arr[i]<arr[i+1]){
                total+=arr[i+1]-arr[i];
            }

        }
        System.out.print(total);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Profit obj=new Profit();
        obj.cal(size,arr);

    }
}