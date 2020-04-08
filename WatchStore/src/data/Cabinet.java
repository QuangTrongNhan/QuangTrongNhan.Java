/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;


/**
 *
 * @author pc
 */
public class Cabinet {
    private String name;
    private Watch ds[] = new Watch[100];
    private int count = 0;

    public Cabinet(String name) {
        this.name = name;
    }
    
    public void addWatch() {
        //Watch ds[] = new Watch[count];
        Scanner sc = new Scanner(System.in);
        String id, name;
        int price;
        System.out.println("Input the Watch: " + (count + 1) + "/" + ds.length);
        System.out.println("input name: ");
        name = sc.nextLine();
        
        System.out.println("input id: ");
        id = sc.nextLine();
        
        System.out.println("input price: ");
        price = Integer.parseInt(sc.nextLine());
        
        ds[count] = new Watch(name, id, price);
        count++;
    }
    
    public void showAll() {
        if(count == 0){
            System.out.println("nothing: ");
        }     
        System.out.println("There are " + count + " " + "profile(s) in the cabinet");
        for (int i = 0; i < count; i++) {
              ds[i].showProfile();
        }
        
    }
    }
    
