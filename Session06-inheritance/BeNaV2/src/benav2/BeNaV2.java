/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benav2;

import data.Disk;
import data.Rectangle;
import data.Square;

/**
 *
 * @author pc
 */
public class BeNaV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cutRectNSquare();
        sortRectNSquare();
    }
     public static void shortAll(){
         Rectangle ds [] = new Rectangle[3];
         ds[0] =  new Rectangle("Tía", "Pink", 1.0, 2.0);
         ds[1] = new Square("má ghệ", "red", 7.0);
         //ds[3] = new Disk("Bé Na", "Rainbow", 10.0);
         //gẫy, sai kiểu, Tròn k phải là vuông và CN
         //bé Na: chú có ngon, chơi luôn tam giác, hbh, hình thang, thoy, con chơi đc đấy
         //vậy Tròn và CN chắc chắn phải chung mảng nào đó thì ok
         //???ds[] = new ???[3]
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
    }//tùy vùng new lúc đó là Rect hay square
     //mà hàm pain() tương ứng đc gọi
     //trong tình huống ds[i] trỏ đến V, ưu tiên gọi tên pain() của con
     //thay vì gọi cha 
     //nếu con có tên hàm cùng trùng với cha, ưu tiên gọi con thay vì cha 
     //ưu tiên Con - override - phế võ công cha
     //cùng 1 tên hàm lúc cha lúc con tùy ngữ cảnh
     //hiện tượng này gọi là tính đa hình, đa xạ, đa sắc thái, đa ánh xạ
     //POLYMORPHISM
     //cùng 1 tên hàm, có nhiều cách code khác nhau
     //từ một ánh xạ ra nhiều - đa xạ - POLYMORPHISM
     
     
    
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
