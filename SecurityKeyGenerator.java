import java.util.*;

public class SecurityKeyGenerator {

    public static String nextKey(int n, int k, String s) {
        // Step 1: Get sorted set of allowed characters
        TreeSet<Character> allowed = new TreeSet<>();
        for (char c : s.toCharArray()) {
            allowed.add(c);
        }

        char[] chars = new char[k];
        for (int i = 0; i < k; i++) {
            chars[i] = (i < s.length()) ? s.charAt(i) : allowed.first(); // Extend with smallest char
        }

        // Step 2: Traverse from end to find a position to increment
        for (int i = k - 1; i >= 0; i--) {
            Character higher = allowed.higher(chars[i]);
            if (higher != null) {
                chars[i] = higher;
                for (int j = i + 1; j < k; j++) {
                    chars[j] = allowed.first();
                }
                return new String(chars);
            }
        }

        return "-1"; // No lexicographically larger key possible
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        System.out.print("Enter the string s: ");
        String s = scanner.next();

        // Call function and print result
        String result = nextKey(n, k, s);
        System.out.println("Next key: " + result);
    }
}
