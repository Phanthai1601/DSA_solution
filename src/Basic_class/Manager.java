package Basic_class;
import java.util.Scanner;
public class Manager {
    static int count=0;
    public static String tachten(String s){
        String [] arr = s.split(" ");
        String temp="";
        for(String x:arr){
            temp=x;
        }
        return temp;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        SinhVien Mylist [] = new SinhVien[100];
        int choice,k;
        do {
            System.out.println("-------------------MENU-----------------");
            System.out.println("1.Them vao danh sach mot sinh vien moi.");
            System.out.println("2.Tim mot sinh vien .");
            System.out.println("3.Xoa mot sinh vien .");
            System.out.println("4.In ra danh sach sinh vien .");
            System.out.println("5.Chinh sua danh sach sinh vien .");
            System.out.println("6.Thoat !");
            System.out.println("---------------------------------------");
            System.out.print("Moi ban nhap vao lua chon cua minh :");
            choice =sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1 :
                    int id;
                    String ten;
                    double diemtb;
                    System.out.print("Nhap vao ID sinh vien ban muon them :");
                    id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap vao ten sinh vien :");
                    ten=sc.nextLine();
                    System.out.print("Nhap vao diem trung binh cua sinh vien :");
                    diemtb=sc.nextDouble();
                    Mylist[count] = new SinhVien(id,ten,diemtb);
                    count++;
                    break;
                case 2 :
                    int t;
                    System.out.println("Nhap vao lua chon cua ban :");
                    System.out.println("1.Tim kiem sinh vien theo ID :");
                    System.out.println("2.Tim kiem sinh vien theo ten :");
                    t=sc.nextInt();
                    sc.nextLine();
                    if(t==1){
                        int findID;
                        System.out.print("Nhap vao ID sinh vien ban muon tim :");
                        findID=sc.nextInt();
                        for(int i=0;i<count;i++){
                            if(Mylist[i].getID()==findID){
                                System.out.println(Mylist[i].toString());
                            }
                        }
                    }else if(t==2){
                        String findName;
                        System.out.print("Nhap vao ten sinh vien ban muon tim kiem :");
                        findName=sc.nextLine();
                        for(int i=0;i<count;i++){
                            if(findName.equals(tachten(Mylist[i].getTenSV()))){
                                System.out.println(Mylist[i].toString());
                            }
                            }
                    }else{
                        System.out.println("Khong tim thay sinh vien !");
                    }
                    break;
                case 3 : 
                    System.out.println("Nhap vao lua chon cua ban de xoa sinh vien :");
                    System.out.println("1.Xoa sinh vien theo ID");
                    System.out.println("2.Xoa sinh vien theo ten");
                    int lc=sc.nextInt();
                    sc.nextLine();
                    if(lc==1){
                        System.out.println("Nhap vao ID sinh vien ma ban muon xoa :");
                        int DeleteID=sc.nextInt();
                        for(int i=0;i<count;i++){
                            if(DeleteID==Mylist[i].getID()){
                                for(int j=i;j<count-1;j++){
                                    Mylist[j]=Mylist[j+1];
                                }
                            }
                        }
                        count--;
                    }
                    else if(lc==2){
                        System.out.println("Nhap vao ten sinh vien ban muon xoa :");
                        String deletename =sc.nextLine();
                        for(int i=0;i<count;i++){
                            if(deletename.equals(tachten(Mylist[i].getTenSV()))){
                                for(int j=i;j<count-1;j++){
                                    Mylist[j]=Mylist[j+1];
                                }
                            }
                        }
                        count--;
                    }else {
                        System.out.println("Khong tim thay sinh vien de xoa !");
                    }
                    break;
                case 4 :
                    for(int i=0;i<count;i++){
                        System.out.println(Mylist[i].toString());
                    }
                    break;
                case 5 :
                    System.out.println("Moi ban nhap vao lua chon cua minh de sua thong tin sinh vien :");
                    System.out.println("1.Sua sinh vien theo ID");
                    System.out.println("2.Sua sinh vien theo ten ");
                    int x=sc.nextInt();
                    int NewID;
                    String newname;
                    double newdiem;
                    System.out.println("Nhap vao ID  moi cua sinh vien :");
                    NewID =sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap vao ten moi cua sinh vien :");
                    newname=sc.nextLine();
                    System.out.println("Nhap vao diem trung binh moi cua sinh vien :");
                    newdiem=sc.nextDouble();
                    sc.nextLine();
                    if(x==1){
                        System.out.println("Nhap vao Id sinh vien ban muon sua :");
                        int fID=sc.nextInt();
                        for(int i=0;i<count;i++){if(fID==Mylist[i].getID()){
                                Mylist[i]= new SinhVien(NewID,newname,newdiem);
                            }
                        }
                    }else if(x==2){
                        System.out.print("Nhap vao ten sinh vien ban muon sua :");
                        String fname=sc.nextLine();
                        for(int i=0;i<count;i++){
                            if(fname.equals(tachten(Mylist[i].getTenSV()))){
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