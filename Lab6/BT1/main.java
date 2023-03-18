
package BT1;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
      nhanVien nv = new nhanVien();
      
      
      Scanner sc = new Scanner(System.in);
      System.out.println("chon loai nhan vien: 1 - parttime / 0 - fulltime");
      int choose = sc.nextInt();
       if (choose == 0){
            NhanVienFullTime loaiNhanVien;
           loaiNhanVien = new NhanVienFullTime();
           NhanVienFullTime ft = new NhanVienFullTime();
           ft.setTen("Nguyen");
           ft.setNgayLamThem(23);
           ft.setLoaiChucVu(1);
           ft.tinhLuong();
           System.out.println("Ten Nhan Vien: " + ft.getTen());
           System.out.println("Luong: "+ ft.getLuong());}
           if (choose == 1){
          NhanVienPartTime loaiNhanVien = new NhanVienPartTime();
          NhanVienPartTime pt = new NhanVienPartTime();
          pt.setTen("Nguyen");
          pt.setGioLamViec(4);
          pt.tinhLuong();
          System.out.println("Ten: " + pt.getTen());
          System.out.println("Luong: "+ pt.getLuong());

                   }
         
       }
      
      /*NhanVienPartTime pt = new NhanVienPartTime();
      pt.setTen("Nguyen");
      pt.setGioLamViec(4);
      pt.loaiNhanVien();
      pt.tinhLuong();
      System.out.println("Ten: " + pt.getTen());
      System.out.println("Luong: "+ pt.getLuong());
      nv.xuatThongTin();
      
    }*/
}
