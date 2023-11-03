/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_java;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Main {
    public static void cht(String s){
         String [] arr= s.split(" ");
         String res="";
         for(String x:arr){
             res+=Character.toUpperCase(x.charAt(0));
             for(int j=1;j<x.length();j++){
                 res+=Character.toLowerCase(x.charAt(j));
             }
         }
         res=s;
    }
    public static void chns(String s){
        StringBuilder sb= new StringBuilder(s);
            if(sb.charAt(1)=='/') sb.insert(0,"0" );
            if(sb.charAt(4)=='/') sb.insert(3, "0");
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<SinhVien> arr1 = new ArrayList<>();
        ArrayList<GiaoVien> arr2 = new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String ngaysinh=sc.nextLine();
            String diachi =sc.nextLine();
            cht(ten);
            chns(ngaysinh);
            if(ma.substring(0,2).equals("GV")){
                String khoa =sc.nextLine();
                int luong =sc.nextInt();
                GiaoVien gv = new GiaoVien(ma,ten,khoa,ngaysinh,diachi,luong);
                arr2.add(gv);
            }else {
                String lop=sc.nextLine();
                double gpa=sc.nextDouble();
                SinhVien sv= new SinhVien(ma,ten,lop,ngaysinh,diachi,gpa);
                arr1.add(sv);
            }
        }
        Collections.sort(arr1,new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getGpa()!=o2.getGpa()){
                    if(o1.getGpa()>o2.getGpa()) return -1;
                    return 1;
                }else {
                    return o1.getMa().compareTo(o2.getMa());
                }
            }
            
        });
        System.out.println("Danh sach sinh vien :");
        for(SinhVien x:arr1){
            System.out.println(x);
        }
        Collections.sort(arr2,new Comparator<GiaoVien>(){
            @Override
            public int compare(GiaoVien o1, GiaoVien o2) {
             if(o1.getLuong()!=o2.getLuong()){
                 return o2.getLuong() - o1.getLuong();
             }  else {
                 return o1.getMa().compareTo(o2.getMa());
             } 
            }
            
        });
        System.out.println("Danh sach giao vien ");
        for(GiaoVien x:arr2){
            System.out.println(x);
        }
    }
}
