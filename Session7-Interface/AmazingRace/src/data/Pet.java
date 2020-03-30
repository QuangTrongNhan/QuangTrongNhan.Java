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
public abstract class Pet {
    protected String name;
    protected int yob;
    protected double weight;

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
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

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
    }
    
    //Pet nó chạy nào, mỗi con chạy khác nhau
    //Mèo:dũng mãnh, Dog: hùng hục (xấu),  Hamster: nhút nhát, lấm lét
    //Thằng lằn: lắc mông, ẹo ẹo
    //mỗi đứa có cách chạy khác nhau, nhưng gọi chung là chạy ->mùi abs
    
    public abstract double run();
    
    public abstract void showRecord();
}
