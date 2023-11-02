package DSA_solution;
import java.util.*;
public class Bai2 {
    static int n;
    static int [] a= new int [100];
    public static void Try(int i){
        if(i==0) return;
        System.out.print("[");
        for(int j=1;j<=i;j++){
            System.out.print(a[j]+" ");
            if(j==i){
                System.out.print("]\n");
            }else System.out.print("");
        }
        for(int j=1;j<i;j++){
            a[j]+=a[j+1];
        }
        Try(i-1);
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            for(int i=1;i<=n;i++){
                a[i]=sc.nextInt();
            }
            Try(n);
        }
    }
}
