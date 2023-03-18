
package BT1;

public class NhanVienFullTime extends nhanVien{
    private int loaiChucVu;
    private int ngayLamThem;


    public int getLoaiChucVu() {
        return loaiChucVu;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    public int getNgayLamThem() {
        return ngayLamThem;
    }

    public void setNgayLamThem(int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
    }
    
  NhanVienFullTime(String ten, int luong, int ngayLamThem, int loaiChucVu){
   super(ten, luong);}
  NhanVienFullTime(){}
  @Override
  public void loaiNhanVien(){
      System.out.println("Loai nhan vien full time");
  }
  public int soNgayLam(){
    return ngayLamThem;    
  }
  @Override
  public long tinhLuong(){
      if (loaiChucVu == 0)
      {
          setLuong(500 * ngayLamThem);}
      else if (loaiChucVu == 1){
          setLuong(300 * ngayLamThem);
      }
      else
       return -1;
        return getLuong();
      
      
      
          
      
  }
}
