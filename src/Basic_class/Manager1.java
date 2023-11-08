/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic_class;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Manager {
    static int count=0,x;
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        SinhVien Mylist[] = new SinhVien[100];
        int choice,k;
        do{
            System.out.println("-----------------MENU-----------------");
            System.out.println("1.Them vao danh sach mot sinh vien moi");
            System.out.println("2.Tim kiem sinh vien");
            System.out.println("3.Xoa mot sinh vien");
            System.out.println("4.Hien thi danh sach sinh vien");
            System.out.println("5.Chinh sua danh sach sinh vien");
            System.out.println("6.Thoat !");
            System.out.println("---------------------------------------");
            System.out.print("Nhap vao lua chon cua ban : ");
            choice =sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1 :
                    int id;
                    String ten;
                    double diemtb;
                    System.out.print("Nhap vao ID sinh vien can them : ");
                    id =sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap vao ho ten sinh vien : ");
                    ten=sc.nextLine();
                    System.out.print("Nhap vao diem trung binh sinh vien : ");
                    diemtb=sc.nextDouble();
                    Mylist[count]= new SinhVien(id,ten,diemtb);
                    count++;
                    break;
                case 2 :
                    do{
                        System.out.println("1.Tim kiem theo ID ");
                        System.out.println("2.Tim kiem theo ten ");
                        System.out.print("Nhap vao lua chon cua ban : ");
                        int lc=sc.nextInt();
                        sc.nextLine();
                        switch(lc){
                            case 1:
                                System.out.print("Nhap vao ID sinh vien ban muon tim kiem : ");
                                int findid=sc.nextInt();
                                for(int i=0;i<count;i++){
                                    if(Mylist[i].getID()==findid){
                                        System.out.println( Mylist[i].toString());
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Nhap vao ten sinh vien ban muon tim kiem : ");
                                String findname=sc.nextLine();
                                for(int i=0;i<count;i++){
                                    if(findname.equals(Mylist[i].getTenSV())){
                                        System.out.println(Mylist[i].toString());
                                    }
                                }
                                break;
                            default :
                                System.out.println("Lua chon khong hop le");
                                
                        }
                        System.out.println("Nhan 1 de tiep tuc ,nhan 0 de thoat khoi chuong tinh tim kiem !");
                        x=sc.nextInt();
                    }while(x!=0);
                    break;
                case 3:
                    int a;
                    do{
                        System.out.println("1.Xoa sinh vien theo ID ");
                        System.out.println("2.Xoa sinh vien theo ten ");
                        System.out.print("Nhap vao lua chon cua ban : ");
                        int lc2=sc.nextInt();
                        sc.nextLine();
                        switch(lc2){
                            case 1:
                                System.out.print("Nhap vao Id sinh vien ban muon xoa : ");
                                int deleteid=sc.nextInt();
                                for(int i=0;i<count;i++){
                                    if(deleteid==Mylist[i].getID()){
                                        for(int j=i;j<count-1;j++){
                                            Mylist[j]=Mylist[j+1];
                                        }
                                    }
                                }
                                count--;
                                break;
                            case 2:  
                                System.out.print("Nhap vao ten sinh vien ban muon xoa : ");
                                String deletename =sc.nextLine();
                                for(int i=0;i<count;i++){
                                    if(deletename.equals(Mylist[i].getTenSV())){
                                        for(int j=i;j<count-1;j++){
                                            Mylist[j]=Mylist[j+1];
                                        }
                                    }
                                }
                                count--;
                                break;
                            default :
                                System.out.println("Lua chon khong ho le !");
                                
                        }
                        System.out.println("Nhan 1 de tiep tuc ,0 de thoat khoi chuong trinh xoa sinh vien ");
                        a=sc.nextInt();
                    }while(a!=0);
                    break;
                case 4:
                    System.out.println("-------- Danh sach sinh vien----------");
                    for(int i=0;i<count;i++){
                        System.out.println(Mylist[i].toString());
                    }
                    break;
                case 5 :
                    System.out.println("1.Sua sinh vien theo ID");
                    System.out.println("2.Sua sinh vien theo ten ");
                    System.out.print("Moi ban nhap vao lua chon cua minh de sua thong tin sinh vien :");
                    int x=sc.nextInt();
                    sc.nextLine();
                    if(x==1){
                        System.out.print("Nhap vao Id sinh vien ban muon sua :");
                        int fID=sc.nextInt();
                        int NewID;
                        String newname;
                        double newdiem;
                    System.out.print("Nhap vao ID  moi cua sinh vien :");
                    NewID =sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap vao ten moi cua sinh vien :");
                    newname=sc.nextLine();
                    System.out.print("Nhap vao diem trung binh moi cua sinh vien :");
                    newdiem=sc.nextDouble();
                    sc.nextLine();
                        for(int i=0;i<count;i++){if(fID==Mylist[i].getID()){
                                Mylist[i]= new SinhVien(NewID,newname,newdiem);
                            }
                        }
                    }else if(x==2){
                        System.out.print("Nhap vao ten sinh vien ban muon sua :");
                        String fname=sc.nextLine();
                        int NewID;
                        String newname;
                        double newdiem;
                    System.out.print("Nhap vao ID  moi cua sinh vien :");
                    NewID =sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap vao ten moi cua sinh vien :");
                    newname=sc.nextLine();
                    System.out.print("Nhap vao diem trung binh moi cua sinh vien :");
                    newdiem=sc.nextDouble();
                    sc.nextLine();
                        for(int i=0;i<count;i++){
                            if(fname.equals(Mylist[i].getTenSV())){
                                Mylist[i]= new SinhVien(NewID,newname,newdiem);
                            }
                        }
                    }
                    
                    break;
                case 6:
                    System.exit(0);
                default :
                    System.out.println("Lua chon khong hop le !");
            }
            System.out.println("Ban co muon thoat chuong trinh khong , nhan 0 de thoat !");
            k=sc.nextInt();
        }while(k!=0);
    }
}
