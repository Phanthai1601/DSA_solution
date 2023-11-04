package DSA_solution;
import java.util.*;
public class Bai_6{
    static Scanner sc= new Scanner(System.in);
    static int n,k,ans=0;
    static int [] a= new int [1000];
    public static void inp(){
        n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        if(sum%2==1){
            System.out.println("NO");
            return;
        }else{
            boolean [] mark = new boolean[sum/2+1];
            for(int i=0;i<sum/2+1;i++){
                mark[i]=false;
            }
            for(int i=0;i<n;i++){
                for(int j=sum/2;j>=a[i];j--){
                    if(mark[j-a[i]]==true||j==a[i]){
                        mark[j]=true;
                    }
                }
            }
            if(mark[sum/2]==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static void main(String [] args){
        int t=sc.nextInt();
        while(t-->0){
            inp();
        }
    }
}