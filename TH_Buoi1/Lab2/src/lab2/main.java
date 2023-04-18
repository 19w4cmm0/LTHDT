
package lab2;


public class main {
    public static void main(String[] args) {
        ThongTinDangKyXe xe1 = new ThongTinDangKyXe("Nguyen Thu Loan", "Future neo", 35000000, 100);
        ThongTinDangKyXe xe2 = new ThongTinDangKyXe("Le Minh Tinh", "Ford Ranger", 250000000,3000);
        ThongTinDangKyXe xe3 = new ThongTinDangKyXe("Nguyen Minh Triet","Landscape",1000000000, 1500);
        xe1.tinhThue();
        System.out.println("Ten chu xe          "+ "Loai xe          "+"Dung tich          "+"Tri gia          "+"Thue phai nop          ");
        System.out.println("===========================================================================================================");
        System.out.print(xe1.getChuXe());
        System.out.print("     "+xe1.getLoaiXe());
        System.out.print("          "+xe1.getDungTichXyLanh());
        System.out.print("             "+xe1.getGiaTriXe());
        System.out.println("                "+xe1.tinhThue());
        System.out.print(xe2.getChuXe());
        System.out.print("        "+xe2.getLoaiXe());
        System.out.print("         "+xe2.getDungTichXyLanh());
        System.out.print("            "+xe2.getGiaTriXe());
        System.out.println("               "+xe2.tinhThue());
        System.out.print(xe3.getChuXe());
        System.out.print("   "+xe3.getLoaiXe());
        System.out.print("           "+xe3.getDungTichXyLanh());
        System.out.print("            "+xe3.getGiaTriXe());
        System.out.println("              "+xe3.tinhThue());
         
    }
}
