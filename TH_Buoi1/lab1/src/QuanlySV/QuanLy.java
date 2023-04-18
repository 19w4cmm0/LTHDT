/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanlySV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QuanLy {
    
     ArrayList<SinhVienNhap>dssinhvien;

    public QuanLy() {
        dssinhvien = new ArrayList<>();
    }

    public void themDSSinhVien(SinhVienNhap svn){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap so luong can them: ");
       int n = sc.nextInt();
       for (int i = 0; i < n; i++) {
       System.out.println("Lan nhap thu " + (i + 1) + ": ");
       if (svn instanceof SinhVienNhap) {
       svn = new SinhVienNhap();
       svn.nhap();
       } 
       dssinhvien.add(svn);
    }
}
   
    public void hienDSSinhVien() {
    System.out.println("----------------------------------------------");
    for (SinhVienNhap x : dssinhvien) {
    x.hien();      
  }
}
   
    public void menu(){
        System.out.println("#1.Nhap sinh vien");
        System.out.println("#2.Danh sach sinh vien sap xep theo ma sinh vien");
        System.out.println("Chon chuc nang");
        System.out.println("----Nhan phim 0 de thoat khoi chuong trinh, xin cam on!----");
    }
   
    public void sapXepDS(){
        Collections.sort(this.dssinhvien, new Comparator<SinhVienNhap>(){
        @Override
        public int compare(SinhVienNhap svn1, SinhVienNhap svn2){
                if(svn1.getMaSV() < svn2.getMaSV()){
                    return 1;
                }
                else if(svn1.getMaSV() > svn2.getMaSV()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
    }
    
}
