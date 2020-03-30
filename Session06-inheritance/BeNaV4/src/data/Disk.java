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
//Disk mà extend Rectangle/Square nghe vô lí lắm luôn
//v thì phải làm tutu đã
public class Disk {
    public static final double PI = 3.14;
    private String owner;
    private String color;
    private double radius;

    public Disk(String owner, String color, double radius) {
        this.owner = owner;
        this.color = color;
        this.radius = radius;
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Disk{" + "owner=" + owner + ", color=" + color + ", radius=" + radius + '}';
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }
    
    public void paint() {
        System.out.printf("|DISK    |%-10s|%-10s|%4.1f|%4.1f|%6.2f|%6.2f|\n|", color, owner, radius , getArea(), getPerimeter());
    }
    

  
}

 

