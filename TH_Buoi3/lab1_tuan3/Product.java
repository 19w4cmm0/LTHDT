
package lab1_tuan3;


public class Product {
    private String discription;
    private String productID;
    private double price;
   Product(){}
   Product(String discription, String productID, double price){
       this.discription=discription;
       this.price=price;
       this.productID=productID;
       
   }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
}
