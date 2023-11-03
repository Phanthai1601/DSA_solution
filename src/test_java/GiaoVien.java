/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_java;

/**
 *
 * @author Admin
 */
public class GiaoVien extends Person {
    private String khoa;
    private int luong;
    public GiaoVien(String ma,String ten,String khoa,String ngaysinh,String diachi,int luong){
        super(ma,ten,ngaysinh,diachi);
        this.khoa=khoa;
        this.luong=luong;
    }

    public int getLuong() {
        return luong;
    }
    
    public void setLuong(int luong) {
        this.luong = luong;
    }
    
    @Override
    public String toString() {
        return super.toString()+" "+this.khoa+" "+this.luong;
    }
    
}
