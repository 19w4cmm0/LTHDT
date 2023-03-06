/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape {
    private double width = 1.0;
    private double length =1.0;
    
    public Rectangle(){
       super();
    }
    public Rectangle(double width,double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;      
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
