import java.util.*;
public class Sum_Alternative_SubArray {
    public static int Sum_Sub(int size,int arr[]){
        int dp[]=new int[size];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<size;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        return dp[size-1];

    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(Sum_Sub(size, arr));
    
}
}