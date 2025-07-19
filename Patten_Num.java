import java.util.Scanner;

public class Patten_Num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        for (int i = 0; i < size - 1; i++) {
            int newFirst=arr[0]+1;
            for (int j=size-1;j>0;j--) {
                arr[j]=arr[j-1];
            }
            arr[0]=newFirst;
            printArray(arr);
        }
    }
    private static void printArray(int[] arr) {
        for (int num:arr){
            System.out.print(num+ " ");
        }
        System.out.println();
    }
}
