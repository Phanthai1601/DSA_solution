// di chuyen trong me cung 2
package DSA_solution;
import java.util.*;
public class Bai_9 {
   static int n,ok=0;
   static int [][] a= new int [100][100];
   static int[] dx = {1,0,0,-1};
   static int[] dy={0,-1,1,0};
   static String p="DLRU";
   static Scanner sc= new Scanner(System.in);
   public static void inp(){
       n=sc.nextInt();
       for(int i=1;i<n;i++){
           for(int j=1;j<=n;j++){
               a[i][j]=sc.nextInt();
           }
       }
   }
   public static void Try(int i,int j,String s){
       if(i==n&&j==n){
           System.out.println(s);
           ok=1;
           return;
       }
       for(int k=0;k<4;k++){
           int i1=i+dx[k],j1=j+dy[k];
           if(i1>=1&&i1<=n&&j1>=1&&j1<=n&&a[i1][j1]==1){
               a[i1][j1]=0;
               Try(i1,j1,s+p.charAt(k));
               a[i1][j1]=1;
           }
       }
   }
    public static void main(String [] args){
        int t=sc.nextInt();
        while(t-->0){
            ok=0;
            inp();
            if(a[1][1]==1&&a[n][n]==1){
                a[1][1]=0;
                Try(1,1,"");
            }
            if(ok==1){
                System.out.println();
            }else System.out.println("-1");
        }
    }
}
