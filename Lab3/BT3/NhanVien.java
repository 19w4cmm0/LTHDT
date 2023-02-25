/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double luongMax;
    public NhanVien(){
        
    }
    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double luongMax)
    {
        this.tenNhanVien=tenNhanVien;
        this.luongCoBan=luongCoBan;
        this.heSoLuong=heSoLuong;
        this.luongMax=luongMax;
    }
    public String getTenNhanVien(){
        return tenNhanVien;}
    public void setTenNhanVien(String tenNhanVien){
        this.tenNhanVien=tenNhanVien;
    }
    public double getLuongCoBan(){
        return luongCoBan;
    }
    public void setLuongCoBan(double luongCoBan){
        this.luongCoBan=luongCoBan;
    }
    public double getHeSoLuong(){
        return heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong){
        this.heSoLuong=heSoLuong;
    }
    public double getLuongMax(){
        return luongMax;
        
    }
    public void setLuongMax(double luongMax){
        this.luongMax=luongMax;
    }
    
}
