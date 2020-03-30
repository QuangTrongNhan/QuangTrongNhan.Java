/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drift;

import data.Rectangle;
import data.Square;

/**
 *
 * @author pc
 */
public class Drift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //khai cha new cha, chấm bth
       Rectangle r1 = new Rectangle("Pink", 1.0, 2);
       r1.paint();
       Square s1 = new Square("<3", "Rainbow", 10.0);
       s1.paint(); //xổ tất cả của Cha(xám nhẹ) của con (đen đậm)
       s1.drawTextTile();
       
       //Khai cha new Con, bẻ lái con trỏ nhá
       Rectangle s2 = new Square("><", "VI DIỆU", 20.0);
                        //HV  là HCN, new HV chính là super() new HCN
                        //con trỏ HCN, new HCN
       //s2.drawTextTile();
               //chấm chỉ xổ của Cha, k care Con có gì 
               //tuy nhiên .pain() vì Con cũng có trùng, nên ưu tiên Con để chạy
               //nhưng vì con trỏ lưng chừng nó k thấy hàm riêng Con dưới đáy
               //éo xổ ra .drawTextTile(), éo xổ ra get/setSmile();
               
               //tổ lái con trỏ, quẹo, rê bánh xuống đáy vùng new Square
        //Square tmp = (Square)s2; //s2 đang trỏ vào Rect của vùng new bự Square, kéo xuống
                                 //chụp lại ngay địa chỉ, tọa độ đáy của new Square
                                 //gán tọa độ vào biến tmp kiểu Square, kiểu Square là trỏ đáy
                                 
                                 //coi ra nụ hôn hay k
        //tmp.drawTextTile();
        
        //s2 vẫn trỏ Rectangle, vì nó là biến Rectangle
        //sợi thun, kéo dãn ra, lấy độ dài, nhả tay, thun trở lại như cũ
        
        //cách này tốn biến Square, ổn, nmhwng mình muốn tiết kiệm biến, chỉ kéo, chụp ngay
        //lấy tọa độ rồi chơi luôn, kiểu new rồi chấm lun éo xài con trỏ
        
        //kĩ thuật 2, k biến trung gian, kết, lấy ngay tọa độ, làm gì luôn đi
        //định luật bắc cầu a = b, b = c -> c = a
        //(Square)s2. xổ cái đầu mày, hiểu s2. nghĩa là HCN chấm, éo vuông
        ((Square)s2).drawTextTile();
        
               
               
               
               
    }
    
}
