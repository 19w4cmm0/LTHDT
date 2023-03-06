/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

public class fruit {
    private int giaBan;
    private String xuatXu;
    private int ngayNhap;
    private int soLuong;
 public fruit(){}
 public fruit(int giaBan, String xuatXu, int ngayNhap, int soLuong ){
     super();
     this.giaBan=giaBan;
     this.xuatXu=xuatXu;
     this.ngayNhap=ngayNhap;
     this.soLuong=soLuong;
 }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
