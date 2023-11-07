/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic_class;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private int ID;
    private String TenSV;
    private double DiemTB;

    public SinhVien() {
    }

    public SinhVien(int ID, String TenSV, double DiemTB) {
        this.ID = ID;
        this.TenSV = TenSV;
        this.DiemTB = DiemTB;
    }
    public int HB(){
        if(DiemTB>=9){
            return 200;
        }else if(DiemTB>=8){
            return 100;
        }else return 0;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public double getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(double DiemTB) {
        if(DiemTB<0){
            DiemTB=0;
        }else this.DiemTB=DiemTB;
    }

    @Override
    public String toString() {
        return "ID : "+ID+"\n"
                +"TEN SINH VIEN : "+TenSV+"\n"
                +"DiEM TRUNG BINH : "+DiemTB+"\n"+"HocBong : "+HB()+"\n";
    }
    
    
}