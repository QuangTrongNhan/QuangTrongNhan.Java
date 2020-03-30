/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author pc
 */
//ta có câu tự nhiên: TGV là một TG (k được đọc lại)
//cắt TGV chính là cắt 1 TG
//tgv ta đề cập 2 cạnh v: a b, mà k thèm nói c = căn bậc 2...
//lí do c luôn đc tính từ 2 cạnh kia
//y chang thiết kế DB: cột số lượng     cột đơn giá      k làm cột thành tiền
//                                                          derived column, cột dẫn xuất
//                                                                luôn tính đc từ thằng kia 
//đặt nhân tử chung của con lên cha, hoặc những gì Cha làm đc, con đâu cần làm
//Tao/Cha có rồi Mày con xài đi, con kế thừa, con mang cốt nhục, dòng máu của Cha
//TGV có owner, Cha có
//TGV có color, Cha có
//TGV có 2 cạnh a b, Cha còn có hơn
public class RightTriangle extends Triangle{
     //Con chả cần khai báo gì, nhân tử chung trọn trong Cha
    public RightTriangle(String color, String owner, double A, double B) {
        super(color, owner, A, B, Math.sqrt(A * A + B * B ));
    }//super() ~ new Cha() ~ new Triangle(...)
    //cắt/new TGV chính là cắt/ new TG
    //mày đang đúc TGV hả, chính là m đang đúc TG
    //Cha Con cãi nhau
    @Override
    public void paint() {
        System.out.printf("|rTriangle |%-10s|%-10s|%4.1f|%4.1f|%4.1f|%6.2f|%6.2f|\n|", color, owner, A, B, C, getArea(), getPerimeter());
    }
  
   
    
    
}
