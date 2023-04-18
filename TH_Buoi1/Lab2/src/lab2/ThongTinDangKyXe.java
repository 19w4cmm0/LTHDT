/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Admin
 */
public class ThongTinDangKyXe {
    private String chuXe;
    private String loaiXe;
    private float giaTriXe;
    private float dungTichXyLanh;
    private float thue;
   
   public ThongTinDangKyXe(){}
   public ThongTinDangKyXe(String chuXe, String loaiXe, float giaTriXe, float dungTichXyLanh, float thue){
       this.chuXe=chuXe;
       this.loaiXe=loaiXe;
       this.giaTriXe=giaTriXe;
       this.dungTichXyLanh=dungTichXyLanh;
       this.thue=thue;
   }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public float getGiaTriXe() {
        return giaTriXe;
    }

    public float setGiaTriXe(float giaTriXe) {
        if (giaTriXe <0){
            return -1;
        }
        else {
            return giaTriXe;
        }
    }

    public float getDungTichXyLanh() {
        return dungTichXyLanh;
    }

    public void setDungTichXyLanh(float dungTichXyLanh) {
        this.dungTichXyLanh = dungTichXyLanh;
    }

    public float getThue() {
        return thue;
    }

    public void setThue(float thue) {
        this.thue = thue;
    }
   public float tinhThue(){
       if (dungTichXyLanh < 100){
           thue = (1/100)*giaTriXe;
       }
       else if (dungTichXyLanh > 200){
           thue = (5/100)*giaTriXe;
       }
       else
       {
           thue = (3/100)*giaTriXe;
       }
       return thue;
   }
}
