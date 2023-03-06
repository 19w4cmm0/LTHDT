/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3;

/**
 *
 * @author Admin
 */
public class Square extends Rectangle{
    private double side;
    
    public Square(){
        
    }
    public Square(double side,String color,boolean filled){
    super();
    this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
