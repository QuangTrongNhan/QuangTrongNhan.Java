/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fu.util.MyToys; //fake giống như java.util.Scanner

/**
 *
 * @author pc
 */
public class Stage {

    public static void main(String[] args) {
//        int yob = MyToys.getAnInteger();
//        System.out.println("yob: " + yob);
//
//        int gf = MyToys.getAnInteger();
//        System.out.println("No of gf: " + gf);
        
       // MyToys boiroi = new MyToys();
       int yob = MyToys.getAnInteger("Nhập năm sinh: ", "mày có biết nhập k ku");
        System.out.println("yob: " + yob);
    }
}
