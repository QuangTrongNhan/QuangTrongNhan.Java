/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benav1;

import data.Rectangle;
import data.Square;

/**
 *
 * @author pc
 */
public class BeNaV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cutRectNSquare();
        //sortRectNSquare();
    }
    //GIUPS CÔ GIÁO LƯU TRỮ KẾT QUẢ HỌC TẬP VÀ LÀM THỦ CÔNG CỦA CÁC BÉ, TRONG ĐÓ CÓ BÉ NA
    //BÉ NA CẮT CÁC HÌNH,TÔ MÀU, GHI CHÚ TẶNG AI ĐÓ
    //CÔ GIÁO MUỐN BIẾT CON ĐÃ LÀM ĐC BAO NHIÊU HÌNH
    
    //CÔ GIÁO THÁCH THỨC DANH HÀI: HÃY SORT DÙM CÔ DT CỦA CÁC HÌNH ĐÃ CẮT T
    //DT TĂNG DẦN
    
     public static void sortRectNSquare() {
        Rectangle r1 = new Rectangle("Tía", "Pink", 1.0, 2.0);
        Rectangle r2 = new Rectangle("Má", "Pink", 20.0, 30.0);
        Rectangle r3 = new Rectangle("A.hai", "Blue", 5.0, .0);     
        
        Square s1 = new Square("G.Anh hai", "Blue", 6.0);
        Square s2 = new Square("má ghệ", "red", 7.0);
        Square s3 = new Square("ba ghệ", "green", 5.0);
        //mún sort thì phải làm s ??cần tạo mảng
        //Khai gì thì new đấy
        Rectangle ds[] = new Rectangle[6]; //sẽ có 6 HCN nhen
        ds[0] = r1; //hai chàng 1 nàng
//chứng minh chàng này tát con bé, chàng kia thấy mặt con bé bị đỏ
//        ds[0].pain();       
//        ds[0].setColor("Màu hường");
        ds[1] = r2; //má vào mảng
        ds[2] = r3; //a hai vào mảng
        
        ds[3] = s1; //thua, vuông k vào mảng chữ nhật đc 
        //Rectangle x = new Square(...); //sao mà đc, k tương thích
        //MẢNG: CHẤP NHẬN ĐÁM CÙNG KIỂU, CHỈ CÙNG KIỂU MÀ THÔI
        //THẤY TÍA MÁ RỒI VUÔNG K VÀO MẢNG CHỮ NHẬT, SAO SẮP XẾP VUÔNG VÀ CHỮ NHẬT CHUNG
        //VỚI NHAU. SẮP RIÊNG ÉO THÈM NÓI
        //NGOÀI ĐỜI CÓ: SẮP DANH SÁCH NGÀNH SE -> CÙNG KIỂU
        //SẮP DANH SÁCH THỦ KHOA TOÀN TRƯỜNG, CHẤP CÁC NGÀNH, GOM CÁC NGÀNH THÀNH ĐIỂM MAX
        //BÉ NA LÀM ĐC: NÓ CHỈ CẦN NHÌN HÌNH TO TO XẾP DƯỚI, NHO NHỎ TRÊN
        //CHẤP LÀ HÌNH GÌ
        //MÁY MÌNH CORE I9, RAM 16GB, JDK MỚI NHẤT, KH LẼ THAU BÉ NA?
        //VẤN ĐỀ: BÉ NA K QUAN TÂM LAOIJ DATA, CHỈ QUAN TÂM DIỆN TÍCH
        //MẢNG JAVA: QUAN TÂM, KHÁC KIỂU K CHUNG XUỒNG
        //MÚN HÒA BÉ NA: VUÔNG PHẢI VÀO MẢNG CN HAY NGƯỢC LẠI, HOẶC CHUNG MẢNG NÀO ĐÓ
        //MỚI FOR CẢ ĐÁM ĐƯỢC
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
