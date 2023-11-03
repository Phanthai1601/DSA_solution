/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_java;

/**
 *
 * @author Admin
 */
public class SinhVien  extends Person{
    private String lop;
    private double gpa;
    public SinhVien(String ma,String ten,String lop,String ngaysinh,String diachi,double gpa){
        super(ma,ten,ngaysinh,diachi);
        this.lop=lop;
        this.gpa=gpa;
    }
    public String getMa(){
        return ma;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return super.toString()+" "+this.lop+" "+this.gpa;
    }
    
}
