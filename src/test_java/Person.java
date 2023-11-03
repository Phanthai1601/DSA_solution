/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_java;

/**
 *
 * @author Admin
 */
public class Person {

    String ma;
    private String ten,ngaysinh,diachi;

    public Person(String ma, String ten, String ngaysinh, String diachi) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    @Override
    public String toString() {
        return this.ma+" "+this.ten+" "+this.ngaysinh+" "+this.diachi;
    }
    
}
