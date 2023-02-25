
package BT1;




public class TinhHinhTron {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.setDuongKinh(10);
        float duongKinh=ht.getDuongKinh();
        double pI=ht.getPI();
        ht.setDienTich((float) (pI * duongKinh));
        System.out.println("Dien tich hinh tron la: "+ ht.getDienTich());
        ht.setBanKinh((float) ht.getDuongKinh()/2);
        float banKinh=ht.getBanKinh();
        ht.setChuVi((float)(2*pI*banKinh));
        System.out.println("Chu vi cua hinh tron la: "+ ht.getChuVi());
    }
    
}
