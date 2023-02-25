/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

/**
 *
 * @author Admin
 */
public class HinhVuong {
    private float canh;
    private float chuVi;
    private float dienTich;
    public HinhVuong()
    {
        
    }
    public HinhVuong(float canh, float chuVi, float dienTich)
    {
        this.canh=canh;
        this.chuVi=chuVi;
        this.dienTich=dienTich;
    }
    public float getCanh(){
        return canh;}
    public void setCanh(float canh){
        this.canh=canh;
    }
    public float getChuVi(){
        return chuVi;
    }
    public void setChuvi(float chuVi){
        this.chuVi=chuVi;
    }
    public float getDienTich(){
        return dienTich;
    }
    public void setDienTich(float dienTich)
    {
        this.dienTich=dienTich;
    }

    
}
