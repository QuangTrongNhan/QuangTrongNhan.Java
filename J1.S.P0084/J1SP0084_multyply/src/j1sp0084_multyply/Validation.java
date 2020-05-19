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
public class Validation {

    public static int getString() {
        int result;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                result = Integer.parseInt(sc.nextLine());
                return result;
            } catch (Exception e) {
                System.out.println("Please input again");
            }
        }
    }

    public static String MsgError() {
        String result;
        Scanner sc = new Scanner(System.in);
//        while (true) {
//            try {
//                result = sc.nextLine();
//                if (result.equalsIgnoreCase("N") == true) {
//                    return result;
//                } else if (result.equalsIgnoreCase("Y") == true) {
//                    return result;
//                } else {
//                    System.out.println("Please input again");
//                }
//            } catch (Exception e) {
//                System.out.println("Please input again");
//            }
//        }
        do {
            result = sc.nextLine();
            if (result.equalsIgnoreCase("N") == true) {
                return result;
            } else if (result.equalsIgnoreCase("Y") == true) {
                return result;
            } else {
                System.out.println("Please input again");
            }
        } while (true);
    }
}
