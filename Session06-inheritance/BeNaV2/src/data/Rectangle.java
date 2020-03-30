/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author pc
 */
public class Rectangle {
    //giấu ng ngoài, public với con cháu -> protected: hàng xài có kiểm soát
    protected String owner;
    protected String color;
    protected double width;
    protected double length;

    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    @Override //sửa thành soái ca String.format() y chang prinf()
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + '}';
    }
    //hàm tự tui
    
    public double getArea (){
        return width + length;
    }
    
    public double getPerimeter() {
        return (width + length) * 2;
    }
    
    public void pain() { //99.9cm ->4.1f
        System.out.printf("||RECTANGLE|%-10s|%-10s|%4.1f|%4.1f|%6.2f|%6.2f|\n", owner, color, width,length,getArea(),getPerimeter());
    }
}
