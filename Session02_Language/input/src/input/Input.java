/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.util.Scanner;  // ctrl-cách giúp import tự động
// ~ include<stdio.h> em mượn bác món đồ
// xài đồ ngkh, xài thư viện thì phải khai báo
//C: #include
//Java: import
//C#: using
/**
 *
 * @author pc
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double point; // 8byte 
       // point = 1000;
        System.out.print("Input your points: ");
        Scanner banPhimCuaTui = new Scanner(System.in);
        point = banPhimCuaTui.nextDouble();
        System.out.println("your points: " + point);
        
    }
    
}
