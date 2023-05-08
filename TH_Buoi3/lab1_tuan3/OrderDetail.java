
package lab1_tuan3;


public class OrderDetail extends Product{
    private int quatity;
    private Product product;
    public OrderDetail(){}
    
   OrderDetail(Product p, int x){}
   OrderDetail(int quatity, Product product){
       
   }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
   public double calcTotalPrice(){
       double ttt=quatity*getPrice();
      return ttt;
   }

    void add(OrderDetail orderDetail) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
   
}
