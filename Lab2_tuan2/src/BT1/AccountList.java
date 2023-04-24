
package BT1;


import java.util.Scanner;


public class AccountList {
    Account accList[];
    int count;
    Scanner sc = new Scanner(System.in);
   public AccountList(){
       accList = new Account[2];
       }
    public AccountList(int count){
        accList = new Account[count];
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
  public void themtk(Account a){
      for (int i=0; i<2; i++){
          System.out.println("tk thu " + i);
          a.them();
      }
  }
  public void xuatmang(Account a){
      for (int i=0; i<2; i++){
        a.hien();
  }}
   
}
