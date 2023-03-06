
package BT2;


public class Vehicle {
    private String color;
    private String model;
  public Vehicle(){}
  public Vehicle(String color, String model){
      super();
      this.color=color;
      this.model=model;
  }
  public static void run(){
      System.out.println("go go!");
  }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
  
}
