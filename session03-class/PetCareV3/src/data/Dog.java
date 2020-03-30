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

public class Dog {
    private String name; // Milu,misa
    private int yob;// nwam sinh có thể:2020,2019,2018,...
    private double weight; // cân nặng: 1,0kg, 50,0kg,...
    private String color; // màu lông: xanh, đỏ,...

    public Dog(String name, int yob, double weight, String color) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + ", color=" + color + '}';
    }
    
    
    public void bark (){
        System.out.println("welcome to my home");
        System.out.println("My name is " + name);
        System.out.println("By the way, my yob: " + yob);
        System.out.println("Weight: " + weight + "; Color: " + color);
    }
}
    
   