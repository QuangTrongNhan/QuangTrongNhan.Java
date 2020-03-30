/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingrace;


import data.*;

/**
 *
 * @author pc
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //round1
       //Pet vào đường đua
       Pet d1 = new Dog("Vàng ơi", 1950, 10.0);
       Dog d2 = new Dog("BÊ-TÔ", 2010, 8.0);
       
       Pet c1 = new Cat("<3", "kitty", 1980, 2.0);
       Pet c2 = new Cat("><", "OGGY", 2010, 8.0);
       
//       Pet racer[] = new Pet[4]; //đường đua 4 lane, 4 làn, 4 cháu
//       racer[0] = d1;

       Pet racer[] = {d1, d2, c1, c2};
       //            [0]  [1]
       //IN KQ LƯỢT ĐUA 1
       System.out.println("The records of all racers");
        for (Pet x : racer) {
            x.showRecord();
        }
        
        //mỗi lượt chạy tốc độ khác nhau, hắc não: đố sort được đó
        //vì mỗi cái if ([i].run() > [j].run())
        //          swap biến tạm Pet học Rồi
        //khốn nạn: gọi run() là tốc độ khác
        
       Motor ex = new Motor("EX", "68f1-2204", 2020, 150);
       Motor win = new Motor("Winner", "86F1-6789", 2019, 150);
       
       ex.showRecord();
       win.showRecord();
    }
    
}
