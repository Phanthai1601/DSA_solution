//Day con co tong bang k
package DSA_solution;
import java.util.*;

public class Bai_5 {
    static Scanner sc = new Scanner(System.in);
    static int n, k, ans = 0;
    static int[] a = new int[100];
    static int[] x = new int[100];

    public static void inp() {
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
    }

    public static void Try(int sum, int i, int pos) {
        if (sum == k) {
            System.out.print("[");
            for (int j = 1; j < i; j++) {
                System.out.print(x[j]);
                if (j == i - 1) System.out.print("]");
                else System.out.print(" ");
            }
            ans = 1;
            return;
        }
        for (int j = pos; j <= n; j++) {
            if (sum + a[j] <= k) {
                x[i] = a[j];
                Try(sum + a[j], i + 1, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            inp();
            ans = 0;
            Try(0, 1, 1);
            if (ans == 0) {
                System.out.println("-1");
            } else System.out.println();
        }
    }
}
