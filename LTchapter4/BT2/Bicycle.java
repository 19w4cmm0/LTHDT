/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

/**
 *
 * @author Admin
 */
public class Bicycle extends Vehicle {
    private String type;
    public Bicycle(){}
    public Bicycle(String type, String color, String model){
        super(color, model);
        this.type=type;}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
    
}
