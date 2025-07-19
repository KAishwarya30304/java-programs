import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long X = sc.nextLong();
            int p = 0;
            while ((X & 1) == 0) {  // Check if X is even
                p++;
                X >>= 1;            // Divide X by 2
            }
            // If p is even (including zero), it's lucky
            System.out.println((p % 2 == 0) ? "YES" : "NO");
        }
        sc.close();
    }
}
