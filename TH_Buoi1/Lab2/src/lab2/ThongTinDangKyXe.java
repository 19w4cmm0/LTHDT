
package lab2;


public class ThongTinDangKyXe {
    private String chuXe;
    private String loaiXe;
    private int giaTriXe;
    private int dungTichXyLanh;
   
   public ThongTinDangKyXe(){}
   public ThongTinDangKyXe(String chuXe, String loaiXe, int giaTriXe, int dungTichXyLanh){
       this.chuXe=chuXe;
       this.loaiXe=loaiXe;
       this.giaTriXe=giaTriXe;
       this.dungTichXyLanh=dungTichXyLanh;
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

    public int getGiaTriXe() {
        if (giaTriXe <0){
            return -1;
        }
        else {
            return giaTriXe;
        }
    }

    public void setGiaTriXe(int giaTriXe) {
        this.giaTriXe=giaTriXe;   }

    public int getDungTichXyLanh() {
       if (dungTichXyLanh <0){
            return -1;
        }
        else {
            return dungTichXyLanh;
        }
    }

    public void setDungTichXyLanh(int dungTichXyLanh) {
        this.dungTichXyLanh = dungTichXyLanh;
    }

   public int tinhThue(){
       int thue;
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
