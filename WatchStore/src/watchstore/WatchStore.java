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
//        Cabinet sell = new Cabinet("Longiness");
//        Scanner sc = new Scanner(System.in);
//        sell.addWatch();
//        sell.addWatch();
//        sell.addWatch();
//        sell.addWatch();
//        sell.addWatch();
//        
//        sell.showAll();
        
        //Search a watch by id 
        Watch ds [] = initWatchList();
        Watch x = searchAWatch(ds, "1236");
        if(x == null){
             System.out.println("Not found");
        }
        else{
            System.out.println("found");
            x.showProfile();
        }
        //update name and price
        if(x != null){
            System.out.println("after updating: ");
            x.setPrice(3000);
            x.setName("Hoành");
            x.showProfile();
            
        }
        
    }
     public static  Watch searchAWatch(Watch[] ds, String id){
            for (Watch x : ds){
                if(x.getId().equalsIgnoreCase(id) == true) {
                    return x;
                }
            }
            return null;
}
     
     public static Watch[] initWatchList(){
         Watch ds[] = new Watch[5];
         ds[0] = new Watch("casio", "1234",1200000);
         ds[1] = new Watch("toki", "1235",1300000);
         ds[2] = new Watch("sanzo", "1236",1400000);
         ds[3] = new Watch("garen", "1237",1500000);
         ds[4] = new Watch("siba", "1238",1600000);
         return ds;
     }
}
