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
public class J1SP0084_multyply {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Multiple multiple = new Multiple();
        String cont = "";
        System.out.println("====Multiply two digits number====");
        do{
            multiple.print();
            System.out.println("Do you want to continue? Y/N");
            cont = Validation.MsgError();
        }while(cont.equalsIgnoreCase("Y"));
    }
}
