import java.util.*;
class Peak_Element{
    public void Peak(int size,int arr[]){
        for(int i=0;i<size;i++){
            if(i==0){
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i]+" ");
            
            }else{
                System.out.println(arr[i+1]);
        
            }
        }if(i==size-1){
            if(arr[size-1]<arr[size-2]){
                System.out.println(arr[size-2]+" ");

            }else{
                System.out.println(arr[size-1]+" ");
        
            }
          }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Peak_Element oj=new Peak_Element();
        oj.Peak(size, arr);
    }
}