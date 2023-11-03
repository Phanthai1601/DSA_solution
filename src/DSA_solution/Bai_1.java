package DSA_solution;
import java.util.*;
public class Bai_1{
    static int n,k,s,ans=0;
    static int [] a= new int [100];
    static Scanner sc= new Scanner(System.in);
    public static void inp(){
        n=sc.nextInt();
        k=sc.nextInt();
        s=sc.nextInt();
    }
    public static void Try(int i){
    for(int j=a[i-1]+1;j<=n-k+i;j++){
        a[i]=j;
        System.out.print(a[i]+" ");
        if(i==k){
            int sum=0;
            for(int z=1;z<=k;z++){
                sum+=a[z];
            }
            if(sum==s) ans++;
        }else Try(i+1);
    }
}
    public static void main(String [] args){
        while(1>0){
            inp();
            if(n+k+s==0) break;
            ans=0;
            Try(1);
            System.out.println(ans);
        }
        
    }
}