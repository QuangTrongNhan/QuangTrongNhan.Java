/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benav4;

import data.Disk;
import data.RightTriangle;
import data.Triangle;



/**
 *
 * @author pc
 */
public class BeNaV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Triangle t1 = new Triangle("Pink", "Tía", 3, 4, 5);
       Triangle rt1 = new RightTriangle("Yellow", "má", 3, 4);
       Triangle d1 = new Disk("Bé Na", "Rainbow", 2.0);
       //tía má, k cùng kiểu, k ở chung, đó là vấn đề
       //lát hồi còn CN, V, HBH, THOY,....
       
       //tìm nhân tử chung của đám V, tr, CN, TG, TGV, HBH, THOY,...
       //đều là IS A KIND OF SHAPE
       //           --color
       //           --owner
       //           --canh??? ăn đòn, bk??? ăn đòn, chẳng chung nhau cmg
       //           --diện tích? có, nhưng k chung code chỉ chung khái niệm
       //           mỗi thành tính khác nhau mà
       //           đều gọi là tính S() đo bề mặt
       //tính S() là khái niệm thoy, nói rằng đo bề mặt, đo thế nào tùy từng hình
       //đưa ra ý tưởng hoy, chứ k có cụ thể- ABSTRACT- trừu tượng, khái niệm chung
       //Class mà chứa HÀM K CÓ CODE, CHỨA HÀM ABSTRACT, CHỨA HÀM TRỪU TƯỢNG
       //CHỨA HÀM CHỈ MANG Ý NGHĨA KHÁI NIỆM, CLASS ĐÓ LÀ CLASS ABSTRACT
       //NẾU CLASS NÀY LÀ ABS, TỨC LÀ NÓ SINH RA ĐỂ GOM CÁC THỨ KHÁC BIỆT
       //VÀ CÓ PHẦN CHUNG NHAU CHUNG CHUNG(S, P) THÌ ĐÂY LÀ 1 HÌNH THỨC TỔNG QUÁT
       //MỨC CAO, TRỪU TƯỢNG CAO, MỨC CHUNG CHUNG, MANG TÍNH  PHÂN LOẠI
       //NÓ K ĐẠI DIỆN CHO 1 CÁI GÌ CỤ THỂ LẮM LUÔN
       //HỆ QUẢ CẤM NEW CLASS ABS, K ĐÚC ĐC CLASS NÀY
       //~CÂU VẼ CHO TAO CÁI HÌNH, MÌNH ÉO VẼ ĐC, VÌ ĐÂU CÓ BIẾT HÌNH MẸ GÌ MÀ VẼ
       //CẤM NEW ABS CLASS
       
       //NẾU MÀ NGOAN CÓ MÀ NEW -> XÀI ANONYMOUS CLASS
       
       //HÀM K CÓ CODE, HÀM ABS, CÒN ĐC GỌI LÀ HÀM WITHOUT BODY OF FUNCTION
       //CODE TRONG HÀM GỌI LÀ THÂN HÀM - BODY OF FUNCTION
    }
    
}
