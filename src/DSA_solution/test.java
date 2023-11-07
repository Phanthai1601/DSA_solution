package DSA_solution;
import java.util.*;
abstract class Nguoi{
    private String hoten;
    private String ngaysinh;
    private String diachi;
    private String loaiSV;
    protected double TDKT;
    protected int  SMKT;
    protected double DTKTHP;

    public void Nhapthongtin(){
    Scanner sc= new Scanner(System.in);
    String hoten=sc.nextLine();
    String ngaysinh=sc.nextLine();
    String diachi=sc.nextLine();
    String loaiSV=sc.nextLine();
    double TDKT=sc.nextDouble();
    int SMKT=sc.nextInt();
    double DTKTHP=sc.nextDouble();
    
    
    }

    public Nguoi(String hoten, String ngaysinh, String diachi, String loaiSV,double TDKT,int SMKT,double DTKTHP) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.loaiSV = loaiSV;
        this.DTKTHP=DTKTHP;
        this.SMKT=SMKT;
        this.TDKT=TDKT;
    }
    public abstract double tinhdiem();
    public String inthongtin(){
        return this.hoten+" "+this.diachi+" "+this.ngaysinh+" "+this.loaiSV+" "+tinhdiem();
    }
}
class SVCDN extends Nguoi{
    private String masv;
    private String malop;
    public SVCDN(String hoten,String ngaysinh,String diachi,String loaiSV,String masv,String malop,double TDKT,int SMKT,double DTKTHP){
        super(hoten,ngaysinh,diachi,loaiSV,TDKT,SMKT,DTKTHP);
        this.malop=malop;
        this.masv=masv;
    }
    @Override
    public double tinhdiem(){
        return TDKT/SMKT;
    } 

    @Override
    public String toString() {
        return super.toString()+this.masv+" "+this.malop;
    }
    
}
class SVCDCQ extends Nguoi{
    private String malop;
    private String masv;
    public SVCDCQ(String hoten,String ngaysinh,String diachi,String loaiSV,String masv,String malop,double TDKT,int SMKT,double DTKTHP){
        super(hoten,ngaysinh,diachi,loaiSV,TDKT,SMKT,DTKTHP);
        this.masv=masv;
        this.malop=malop;
    }
    @Override
    public double tinhdiem(){
        return (TDKT/SMKT+DTKTHP)/3;
    }

    @Override
    public String toString() {
        return super.toString()+" "+this.masv+" "+this.malop;
    }
    
}
public class test{
   public static void main(String [] args){
       Scanner sc= new Scanner(System.in);
       String t="SVCDCQ";
       for(int i=0;i<2;i++){
           String hoten=sc.nextLine();
           String ngaysinh=sc.nextLine();
           String diachi=sc.nextLine();
           String loaiSV=sc.nextLine();
           if(loaiSV.equals(t)){
               double TDKT=sc.nextDouble();
               int SMKT=sc.nextInt();
               double DTKTHP=sc.nextDouble();
               sc.nextLine();
               String masv=sc.nextLine();
               String malop=sc.nextLine();
               SVCDCQ a= new SVCDCQ(hoten,ngaysinh,diachi,loaiSV,masv,malop,TDKT,SMKT,DTKTHP);
               
           }else {
               double TDKT=sc.nextDouble();
               int SMKT=sc.nextInt();
               double DTKTHP=sc.nextDouble();
               sc.nextLine();
               String masv=sc.nextLine();
               String malop=sc.nextLine();
               SVCDN b= new SVCDN(hoten,ngaysinh,diachi,loaiSV,masv,malop,TDKT,SMKT,DTKTHP);
               
           }
           
       }
   }
}