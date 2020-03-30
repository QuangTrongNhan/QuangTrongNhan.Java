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
//motor mà extends pet nghe kì lắm lun, về mặt code thì gõ extends pet k sao
//về logic thì k ổn. motor phải extends vehicle thì hợp lí hơn
//IS A vehicle hợp lí hơn IS A PET
public class Motor {
    public static final double MAX_SPEED = 160.0;
    
    private String model; //Exciter 2020, Winner 2019, RGV
    private String vin; //bso, Vehicle Identifier Number
    private int yob; // năm sản xuất
    private double volume; //cm3, phân khối

    public Motor(String model, String vin, int yob, double volume) {
        this.model = model;
        this.vin = vin;
        this.yob = yob;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", vin=" + vin + ", yob=" + yob + ", volume=" + volume + '}';
    }
    
 public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }
    
    public void showRecord() {
        System.out.printf("|MOTOR   |%18s|%4d|%5.1f|%5.1f|%11s\n", model, yob, volume, run(), vin);
    }  
}
