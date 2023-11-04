// bai toan phan tich so
package DSA_solution;
import java.util.Arrays;
import java.util.Scanner;

public class Bai_10 {
    static int[] a = new int[100];
    static int n, k, ok;
    static int[] x = new int[100];
    static Scanner sc = new Scanner(System.in);

    public static void inp() {
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 1; i <n+1; i++) {
            a[i] = sc.nextInt();
        }
        //Arrays.sort(a);

    }
    public static void Try(int pos,int cnt,int sum){
        if(sum==k){
            System.out.print("[");
            for(int i=0;i<cnt;i++){
                System.out.print(x[i]);
                if(i!=cnt-1) System.out.print(" ");
            }
            System.out.print("]");
            ok=1;
            return;
        }
        for(int j=pos;j<=n;j++){
            if(a[j]+sum<=k){
                x[cnt]=a[j];
                Try(j,cnt+1,sum+a[j]);
            }
        }
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            inp();
            ok = 0;
            Try(1,0,0);
            if (ok == 0) {
                System.out.println("-1");
            } else System.out.println();
        }
    }
}
