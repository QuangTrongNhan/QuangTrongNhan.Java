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
public class Dog extends Pet {
    public static final double MAX_SPEED = 50.0;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }
    
    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }
    
    @Override
    public void showRecord() {
        System.out.printf("|Dog   |%20s|%4d|%5.1f|%4.1f|\n", name, yob, weight, run());
    }  
}
