/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0084_multyply;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Multiple {

    public void print() {

        Validation val = new Validation();
        System.out.println("Input number 1: ");
        int firstNum;
        firstNum = Validation.getString();
        System.out.println("Input number 2: ");
        int secondNum;
        secondNum = Validation.getString();
        System.out.println("Result = " + (firstNum * secondNum));
    }
}
