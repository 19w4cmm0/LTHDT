
package lab1_tuan3;

import java.time.LocalDate;


public class Order {
    private int orderID;
    private LocalDate orderDate;
    private OrderDetail lineItems;
    private int cout;
    private Product product;
    OrderDetail lineItem[];
   Order(int orderID, LocalDate orderDate){}
   Order(int orderID, LocalDate orderDate, OrderDetail lineItems, int cout){
       this.orderID=orderID;
       this.orderDate=orderDate;
       this.lineItems=lineItems;
       this.cout=cout;
   }

    Order() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public OrderDetail getLineItems() {
        return lineItems;
    }

    public void setLineItems(OrderDetail lineItems) {
        this.lineItems = lineItems;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + ", cout=" + cout + '}';
    }
    
   public void addLineItems(Product p, int x){ 
       lineItems.add(new OrderDetail(p, x));
   }
   public double calcTotalCharge(){
       
		return product.getPrice()*lineItems.getQuatity();
	
   }
    
}
