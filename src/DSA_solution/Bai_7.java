
// dem so truong di trong ma tran
package DSA_solution;
import java.util.*;
public class Bai_7 {
    static int n,m,ans=0;
    static Scanner sc= new Scanner(System.in);
    static int [][] a= new int [105][105];
    public static void inp(){
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    public static void Try(int i,int j){
        if(i==n&&j==m){
            ans++;
            
            return;
        }
        if(i+1<=n) {Try(i+1,j);}
        if(j+1<=m) {Try(i,j+1);}
    }
    public static void main(String[] args){
       int  t=sc.nextInt();
        while(t-->0){
          inp();
          ans=0;
          Try(1,1);
            System.out.println(ans);
        }
    }
}
