//bai toan n quan hau
package DSA_solution;
import java.util.*;
public class Bai_8 {
    static int n,ans=0;
    static int [] x= new int [100];
    static int []hang= new int [100];
    static int [] d1 = new int [100];
    static int [] d2= new int [100];
    static Scanner sc= new Scanner(System.in);
    public static void Try(int i){
        for(int j=1;j<=n;j++){
            if(hang[j]==1&&d1[i-j+n]==1&&d2[i+j-1]==1){
                //x[i]=j;
                hang[j]=d1[i-j+n]=d2[i+j-1]=0;
                if(i==n){
                    ans++;
                }
                else 
                {
                    Try(i+1);
                }
                    hang[j]=d1[i-j+n]=d2[i+j-1]=1;
                }
            }
        }
    
    public static void main(String [] args){
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            ans=0;
            for(int i=1;i<100;i++){
            hang[i]=d1[i]=d2[i]=1;
            
        }
          Try(1);
          System.out.println(ans);  
        }
    }
}
