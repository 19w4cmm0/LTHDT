/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

/**
 *
 * @author Admin
 */
abstract class phuongTienDiChuyen implements HangSanXuat{
    public String loaiPhuongTien;
    public HangSanXuat hangSanXuat;
    public String layTenHangSanXuat(){
        return tenHangSanXuat;  
    }
    public void batDau(){
    }
    public void tangToc(){}
    public void dungLai(){}
    abstract double layVanToc();
}
