import java.util.Scanner;

public class Overlapping_Intervals {
    public void check(int[][] arr, int num) {
        boolean[] merged = new boolean[num];
        for (int i=0;i<num;i++) {
            if (merged[i]) continue;
            int start=arr[i][0];
            int end=arr[i][1];

            for (int j = i + 1; j < num; j++) {
                if (merged[j]) continue;

                int s = arr[j][0];
                int e = arr[j][1];

                // If intervals i and j overlap
                if (s <= end && e >= start) {
                    // Merge them
                    start = Math.min(start, s);
                    end = Math.max(end, e);
                    merged[j] = true;
                }
            }

            System.out.println(start + " " + end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];

        for (int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Overlapping_Intervals obj = new Overlapping_Intervals();
        obj.check(arr, num);
    }

    public void Print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
