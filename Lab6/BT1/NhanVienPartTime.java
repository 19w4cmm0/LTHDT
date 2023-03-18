
package BT1;

public class NhanVienPartTime extends nhanVien {
    private int gioLamViec;
    NhanVienPartTime(){}
    public NhanVienPartTime(String ten, long luong, int gioLamViec){
        super(ten, luong);
   }

    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }
    
   @Override
   public long tinhLuong(){
       setLuong(gioLamViec * 30);
       return getLuong();
   }
    @Override
   public void loaiNhanVien(){
       System.out.println("loai nhan vien part time");
   }
}
