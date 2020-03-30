/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benav3;

import data.Disk;
import data.Rectangle;
import data.Square;
import data.Triangle;

/**
 *
 * @author pc
 */
public class BeNaV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cutRectNSquare();
        //sortRectNSquare();
        sortAll();
    }
     public static void sortAll(){
         Triangle t1 = new Triangle(4, 5, 6);
         t1.getAreaTriangle();
         t1.paint();
     }
     public static void sortRectNSquare() {
        Rectangle r1 = new Rectangle("Tía", "Pink", 1.0, 2.0);
        Rectangle r2 = new Rectangle("Má", "Pink", 20.0, 30.0);
        Rectangle r3 = new Rectangle("A.hai", "Blue", 5.0, .0);     
        
        Square s1 = new Square("G.Anh hai", "Blue", 6.0);
        Square s2 = new Square("má ghệ", "red", 7.0);
        Square s3 = new Square("ba ghệ", "green", 5.0);
       
        Rectangle ds[] = new Rectangle[7]; //sẽ có 6 HCN nhen
        ds[0] = r1; //hai chàng 1 nàng
        ds[1] = r2; //má vào mảng
        ds[2] = r3; //a hai vào mảng
        
        ds[3] = s1; 
        ds[4] = s2;
        ds[5] = s3; //khai cha nhưng trỏ vào con đấy
        ds[6] = new Square("BÉ NA", "RAINBOW", 10.0);
        
        
        System.out.println("All of shapes");
        for (Rectangle x : ds) { //x là Rect nhen
            x.pain();
         }//F6 vi diệu
         for (int i = 0; i < ds.length - 1; i++) {
             for (int j = i + 1; j < ds.length; j++) {
                 if(ds[i].getArea() > ds[j].getArea()){
                     Rectangle t;
                     t = ds[i];
                     ds[i] = ds[j];
                     ds[j] = t;
                 }
             }
         }
         System.out.println("All of shapes after soring");
         for (Rectangle x : ds) {
             x.pain();//.pain là của rec
         }            //nhưng khi f6
    }
     
     
    
    public static void cutRectNSquare() {
        Rectangle r1 = new Rectangle("Tía", "Pink", 1.0, 2.0);
        Rectangle r2 = new Rectangle("Má", "Pink", 2.0, 3.0);
        Rectangle r3 = new Rectangle("A.hai", "Blue", 5.0, .0);     
        
        Square s1 = new Square("G.Anh hai", "Blue", 6.0);
        Square s2 = new Square("má ghệ", "red", 7.0);
        Square s3 = new Square("ba ghệ", "green", 5.0);
        
        r1.pain(); //đọc tự nhiên vẽ hình chữ nhật 1
        r2.pain(); //vẽ hình cn 2
        r3.pain();
        
        s1.pain();
        s2.pain();
        s3.pain();
    }
}
