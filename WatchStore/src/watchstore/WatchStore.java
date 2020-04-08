/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watchstore;

import data.Cabinet;
import data.Watch;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class WatchStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cabinet sell = new Cabinet("Longiness");
        Scanner sc = new Scanner(System.in);
        sell.addWatch();
        sell.addWatch();
        sell.addWatch();
        sell.addWatch();
        sell.addWatch();
        
        sell.showAll();
    }
    
}
