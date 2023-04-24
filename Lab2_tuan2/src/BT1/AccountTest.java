
package BT1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountList b = new AccountList();
        Account c = null;
        
       int z;
        
    do{
        System.out.println("|=============================================|");
        System.out.println("|1. Them tai khoan                            |");
        System.out.println("|2. So tai khoan hien co                      |");
        System.out.println("|3. In thong tin                              |");
        System.out.println("|4. Nap tien vao tai khoan                    |");
        System.out.println("|5. Rut tien                                  |");
        System.out.println("|6. Chuyen tien                               |");
        System.out.println("|============Nhap phim 0 de thoat=============|");
    System.out.print("Lua chon: ");
    z= sc.nextInt();
    switch(z)
{
    case 1 -> {
        c = new Account();
        b.themtk(c);
    break;
}

    case 2 -> {
        
    break;
}

    case 3 -> {
        b.xuatmang(c);
    break;
}
    case 4 -> {
        c.naptien();
    break;
}
    case 5 -> {
        c.ruttien();
    break;
}
    case 6 -> {
        
    break;
}
    
    default->{}
}

    }while(z!=0);
}
}
