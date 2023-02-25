/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Procedure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a;
        System.out.println("Nhap luong tang: ");
        a = scanner.nextFloat();
        NhanVien nv = new NhanVien();
        nv.setTenNhanVien("Nguyen Van A");
        System.out.println("Ten Nhan Vien: " +nv.getTenNhanVien());
        nv.setLuongCoBan(5000);
        nv.setHeSoLuong(2);
        float luong=(float) ((float) nv.getHeSoLuong()*nv.getLuongCoBan());
        System.out.println("Luong:" +luong);
        nv.setHeSoLuong(a);
        double tangluong=((double) nv.getHeSoLuong()*nv.getLuongCoBan());
         if(tangluong>nv.getLuongMax())
         {
            System.out.println("False");
            
         }
         else{
             System.out.println("Luong tang: "+tangluong);}
         
             
        
        
        
    }
}
