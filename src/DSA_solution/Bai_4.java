package DSA_solution;
import java.util.*;
public class Bai_4 {
    static Scanner sc= new Scanner(System.in);
    static int n;
    static int [][]a = new int [100][100];
    public static void inp(){
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    public static void Try(int i,int j,String s){
        if(i==n&&j==n){
            System.out.print(s);
        }
        if(i+1<=n&&a[i+1][j]==1){
            Try(i+1,j,s+'D');
        }
        if(j+1<=n&&a[i][j+1]==1){
            Try(i,j+1,s+'R');
        }
    }
    public static void main(String [] args){
    int t=sc.nextInt();
    while(t-->0){
        inp();
        int ok=0;
        if(a[1][1]==1&&a[n][n]==1){
            Try(1,1,"");
        }
        System.out.println();
    }
    }    
}
