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

//TGV nên extends ai???
//TGV nếu extends Shape, ổn, nhưng bạn phải viết lại cạnh, tính diện tích, tính P() k care cthuc gì
//TGV nếu extends TG, gọi là cháu của Shape, ổn luôn và bạn chả cần viết lại gì 
//cùng lắm là hàm paint() mỗi hàm này thoy
public class RightTriangle extends Triangle{

    public RightTriangle(double a, double b, String owner, String color) {
        super(a, b, Math.sqrt(a * a + b * b), owner, color);
    }
    //owner, color: Cha lo giùm, Cha gửi cho ông nội Shape
    //cạnh a, b: cha lo dùm con luôn đi, cha có 3 cạnh lận, để Cha lo luôn
    //Con k còn gì, đâu có sao
    @Override
    public void paint() {
        System.out.printf("|rTriangle |%-10s|%-10s|%4.1f|%4.1f|%4.1f|%6.2f|%6.2f|\n|", color, owner, a, b, c, getArea(), getPerimeter());
    }
}
//CÂY GIA PHẢ ĐÃ XUẤT HIỆN, ĐỜI ÔNG NỘI DI TRUYỀN XUỐNG CHO OWN, CON XUỐNG CHO CON(A B C)
//CON XUỐNG CHO CHÁU (A, B, C, O, C)

