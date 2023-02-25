
package BT1;




public class HinhTron {
    private double pI=3.14;
    private float duongKinh;
    private float banKinh;
    private float chuVi;
    private float dienTich;
    public HinhTron()
    {
        
    }
    public HinhTron(double pI, float duongKinh, float banKinh, float chuVi, float dienTich)
    {
        this.pI=pI;
        this.duongKinh=duongKinh;
        this.banKinh=banKinh;
        this.chuVi=chuVi;
        this.dienTich=dienTich;
        
    }

    
    public double getPI(){
        return pI;
    }
    public void setPI(double pI){
        this.pI=pI;
    }
    public float getDuongKinh(){
        return duongKinh;
    }
    public void setDuongKinh(float duongKinh){
        this.duongKinh=duongKinh;
    }
    public float getBanKinh(){
        return banKinh;
    }
    public void setBanKinh(float banKinh){
        this.banKinh=banKinh;
    }
    public float getChuVi(){
        return chuVi;
    }
    public void setChuVi(float chuVi){
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
