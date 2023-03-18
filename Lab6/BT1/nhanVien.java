
package BT1;
import java.util.Scanner;
public class nhanVien {
Scanner sc = new Scanner(System.in);
 private String ten;
 private long luong;
public nhanVien(String ten, long luong){
    super();
    this.ten=ten;
    this.luong=luong;
}
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
 
 nhanVien(){}
 public void loaiNhanVien(){
   System.out.println("Full time or part time");
 }
 public long tinhLuong(){
  return luong;
 }
 public void xuatThongTin(){
   System.out.println("Ten nhan vien: "+ getTen());
   System.out.println("Luong: "+ getLuong());
   
 }
 
 
   
 
        
    }
    

