/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Random;

/**
 *
 * @author pc
 */
public class Cat extends Pet{
    public static final double MAX_SPEED = 60.0;
    private String ribbon; //con khác cha một chút, đã gặp ở Disk(radius) vs. Shape()

    public Cat(String ribbon, String name, int yob, double weight) {
        super(name, yob, weight);
        this.ribbon = ribbon;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }
    
    @Override
    public void showRecord() {
        System.out.printf("|CAT   |%20s|%4d|%5.1f|%4.1f|\n", name, yob, weight, run(),ribbon);
    }  
}
