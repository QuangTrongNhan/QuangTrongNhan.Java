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
//HV là phiên bản mở rộng của hình chữ nhật, nó có khác biệt xíu, u ú đều đều, bản chất vẫn là 
//HCN(CON CHÍNH LÀ phiên bản mở rộng của cha)
//1. Phát hiện is - tự nhiên
//2.Class Con extends class cha 
//3.Tạo riêng các đặc điểm con có
//4.Tạo phễu của con như mọi class khác
//5.Độ lại phễu của con đảm bảo tương thích như bản gốc của cha
//6.Độ lại hàm của Cha nếu muốn
//           @override
//NHỮNG GÌ CỦA CHA SẼ LÀ CỦA CON(KẾ THỪA MÀ, INHERITANCE(N)
//NHỮNG GÌ CỦA RIÊNG CON, LÀ CỦA RIÊNG CON, BA MÁ KH ĐC BIẾT, K ĐC SỜ,CHẠM





public class Square extends Rectangle{

    public Square(String owner, String color, double egde) {
        super(owner, color,  egde, egde);
    } //new Rectangle(?, ?, ?, ?)
    //cắt, đúc HV chính là đúc/cắt 1 HCN
    //super() chính là new Rectangle...đấy-hợp logic ngoài đời
    //đúc HV chính là đúc HCN có 2 cạnh kề như nhau, w và 1 bằng nhau
    //đang xài lại hàm pain() vì V là CN, xài luôn đồ của CN, giá trả là 
    //in ra lun chữ Rectangle cạnh 10 10 của Na, cho những vuông còn lại y chang
    
    //sao em lại k viết gì thêm ngoài việc đúc
    //rõ ràng: phễu cần đúc, đúc rồi
    //đúc V chính là đúc HCN, V là CN, có hàm gì xài luôn cho tiện
    //chính vì tiện phải ăn theo hành động của CN
    //mình ở phòng trọ, mún làm gì thì làm
    //về nhà tía má, cũng là nhà mình, phải ăn ở theo nếp ba má
    @Override
     public void pain() { //99.9cm ->4.1f
        System.out.printf("||SQUARE   |%-10s|%-10s|%4.1f|%4.1f|%6.2f|%6.2f|\n", owner, color, width, width, getArea(), getPerimeter());
    }//Cha hết đó, nhưng nhả cho con
    //hiện tượng class Con có hàm trùng tên 100% với class Cha
    //gọi là hiện tượng Override, Con phế võ công Cha
}
