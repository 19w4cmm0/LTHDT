
package BT1;


public class TinhHinhVuong {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong();
        hv.setCanh(2);
        
        hv.setDienTich(hv.getCanh()*2);
        System.out.println("Dien tich hinh vuong la "+ hv.getDienTich());
        hv.setChuvi(hv.getCanh()*4);
        System.out.println("Chu vi hinh vuong la "+ hv.getChuVi());
    }
    
}
