
package BT.BTVN;


import java.util.Scanner;
public class DocSo {
    public static void main(String[] args) {
        int so;
Scanner sc = new Scanner(System.in);
int x;
System.out.println("Moi nhap so nguyen ba chu so: ");
so = sc.nextInt();

if (so < 100 && so > 999) {
	System.out.println("khong hop le!");
}

int donvi = so % 10;
so/=10;
int chuc = so % 10;
int tram = so / 10;



if (tram == 1)
{


 System.out.printf("Mot");
}
else if (tram == 2)
{
 System.out.printf("Hai");
}
else if (tram == 3)
{
 System.out.printf("Ba");
}
else if (tram == 4)
{
System.out.printf("Bon");
}
else if (tram == 5)
{
System.out.printf("Nam");
}
else if (tram == 6)
{
System.out.printf("Sau");
}
else if (tram == 7)
{
System.out.printf("Bay");
}



else if (tram == 8)
{
System.out.printf("Tam");
}
else if (tram == 9)
{
System.out.printf("Chin");
}
System.out.printf(" Tram ");

if (chuc == 2)
{
System.out.printf("Hai");
}
else if (chuc == 3)
{
System.out.printf("Ba");
}
else if (chuc == 4)
{
System.out.printf("Bon");
}
else if (chuc == 5)
{
System.out.printf("Nam");
}



else if (chuc == 6)
{
System.out.printf("Sau");
}
else if (chuc == 7)
{
System.out.printf("Bay");
}
else if (chuc == 8)
{
System.out.printf("Tam");
}
else if (chuc == 9)
{
System.out.printf("Chin");
}

System.out.printf(" Muoi ");

if (donvi == 1)
{
System.out.printf("Mot");
}
else if (donvi == 2)
{
System.out.printf("Hai");


}
else if (donvi == 3)
{

System.out.printf("Ba");
}
else if (donvi == 4)
{
System.out.printf("Bon");
}
else if (donvi == 5)
{
System.out.printf("Lam");
}
else if (donvi == 6)
{
System.out.printf("Sau");
}
else if (donvi == 7)
{
System.out.printf("Bay");
}
else if (donvi == 8)
{
System.out.printf("Tam");
}
else if (donvi == 9)


{
System.out.printf("Chin");
}
}
    }
    
    

