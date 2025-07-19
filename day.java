// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/import java.util.;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String s= num + "";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                System.out.print("cs");
                break;
            }else if(ch[i]=='2'){
                System.out.print("e");
                break;
            }else if(ch[i]=='3'){
                System.out.print("me");
                break;
            }else if(ch[i]=='4'){
                System.out.print("ce");
                break;
            }else{
                System.out.print("unknown");
                break;
            }
        }
        
        
    }
}*/
import java.util.*;
class day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||i+j==n-1){
                System.out.print(String.valueOf(num));
                num++;
                }else{
                   System.out.print(" ");  
                }
                
            }
            System.out.println();
        }
    }
}