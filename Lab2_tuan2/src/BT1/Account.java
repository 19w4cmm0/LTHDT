
package BT1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    private double sotien;
    private int sotk;
    private String tentk;
    private String trangthai;
    Locale localVI = new Locale("vi", "vn");
   public Account(){}
  
   public Account(double sotien, int sotk, String tentk, String trangthai){
       this.sotien=sotien;
       this.sotk=sotk;
       this.tentk=tentk;
       this.trangthai=trangthai;
   }
    public double getSotien() {
        return sotien;
    }

    public void setSotien(double sotien) {
        this.sotien = sotien;
    }

    public int getSotk() {
        return sotk;
    }

    public void setSotk(int sotk) {
        this.sotk = sotk;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public void hien() {
        System.out.println( "Account{" + "sotien=" + getSotien() + ", sotk=" + getSotk() + ", tentk=" + getTentk() + ", trangthai=" + getTrangthai() + '}');
    }
    public void them(){
          System.out.println("Nhap so tien: ");
          sotien = sc.nextDouble();
          System.out.println("Nhap  so tai khoan: ");
          sotk = sc.nextInt();
          System.out.println("Ten tai khoan: ");
          tentk = sc.nextLine();
          sc.nextLine();
          System.out.println("Nhap trang thai: ");
          trangthai= sc.nextLine();
    }

    @Override
    public String toString() {
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
		String tienvn = currencyVN.format(sotien);
        return "Account{" + "sotien=" + sotien + ", sotk=" + sotk + ", tentk=" + tentk + ", trangthai=" + trangthai + ", localVI=" + localVI + ", sc=" + sc + '}';
    }
    
    
    Scanner sc = new Scanner(System.in);
    public void naptien(){
        System.out.println("Nhap so tien muon nap: ");
	double tiennap = sc.nextDouble();
	NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
	String tienvnnap = currencyVN.format(tiennap);
	sotien = tiennap + sotien;
	System.out.println("Ban vua nap: " + tienvnnap + "VND");
    }
    public void ruttien(){
        System.out.println("Nhap so tien rut: ");
	double tienrut = sc.nextDouble();
	NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
	String tienvnrut = currencyVN.format(tienrut);
	sotien = sotien - tienrut;
	System.out.println("Ban vua rut: " + tienvnrut + "VND");
    }
    public void daohan(){
        double laisuat = 0.035;
	sotien = sotien + sotien*laisuat;
	NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
	String tiendaohan = currencyVN.format(sotien);
	System.out.println("Dao han: " + tiendaohan + "VND");
    }
    public void nhapsotk() {
		System.out.println("Nhap so tai khoan: ");
		sotk = sc.nextInt();
	}

        
    
   
}
