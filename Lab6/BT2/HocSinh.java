
package BT2;


public class HocSinh {
    private String hoTen;
    private int lop;
    private int toan;
    private int ly;
    private int hoa;
    public void HocSinh(){}
   public void HocSinh(String hoTen, int lop, int toan, int ly, int hoa, float DTB){
       this.hoTen = hoTen;
       this.lop = lop;
       this.toan = toan;
       this.ly = ly;
       this.hoa = hoa;
   }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getToan() {
        return toan;
    }

    public void setToan(int toan) {
        this.toan = toan;
    }

    public int getLy() {
        return ly;
    }

    public void setLy(int ly) {
        this.ly = ly;
    }

    public int getHoa() {
        return hoa;
    }

    public void setHoa(int hoa) {
        this.hoa = hoa;
    }
   public float diemTB(){
       float DTB = (toan + ly + hoa)/3;
       return DTB;
       
   }
   
}
