/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benav5;

import data.*; //import all
import java.util.Random;



/**
 *
 * @author pc
 */
public class BeNaV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Triangle t1 = new Triangle(3, 4, 5, "Tía", "red");
       Triangle rt1 = new RightTriangle(3, 5, "Má", "white");
       
       Shape ds[] = new Shape[5];
       ds[0] = new Disk(2.0, "Anh", "blue");
       ds[1] = new Triangle(6, 8,10, "Ghệ", "Brown");
       ds[2] = t1; //đc luôn. 2 chàng 1 nàng
       ds[3] = rt1; //TGV là một hình học
       ds[4] = new Disk(2.0, "ghệ bé na", "rainbow");
       //chung mảng rồi, tự sort
        System.out.println("The list of shapes");
        for (Shape x : ds) {
            x.paint(); // hàm paint(); của cha đó, abs đó
            //đừng lo, con sẽ giành quyền ưu tiên, override Cha, qua mặt Cha
            //
        }
        System.out.println("after sorting");
        for (int i = 0; i < ds.length - 1; i++) {
            for (int j = i + 1; j < ds.length; j++) {
                if(ds[i].getArea() > ds[j].getArea()){
                    Shape t;
                    t = ds[i];
                    ds[i] = ds[j];
                    ds[j] = t;
                }
            }
        }
        for (Shape x : ds) {
            x.paint();
        }
       
        //cắt một hình mà chưa biết rõ nhóm, chắc chắn là hình,chắc chắn là new Shape
        //rồi vì hình nào cx new shape sẵn lúc đúc ( qua lệnh super())
        //ta mươn luôn shape để new hình cà chớn vừa cắt
        //mà éo cần class cụ thể 
        
//        Shape x = new Shape(owner, color) {
//            @Override
//            public double getArea() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//            
//            @Override
//            public double getPerimeter() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//            
//            @Override
//            public void paint() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        };
            
        //phần bung rộng chính là phần code của Con phải viết nốt để hoàn thiện Cha
        //vùng này chính là Class con nếu bạn làm lẻ riêng Khuôn con
        //do đây ta làm biến tạo Khuôn con
        //nhưng lại vẫn muốn có  obj Con
        //vật thì hoàn thiện nốt cho Cha đi
        //thỏa công thức con của abs Cha abs:
                    //new Cha + viết code cho all abs Cha
                    //super() Cha + viết code cho tất cả abs cha
                    //Gọi là hoàn thiện cha ON THE GO, éo tạo class riêng 
                    //class vô danh gọi là -- anonymous
        //Bé Na cắt 1 hình gì đó mà k biết nhóm, k gọi tên được
        //hình ngẫu nhiên k gọi tên đc, nhưng chắc chắn mà là hình học, v mày thỏa
        //nhóm shape, có S nhưng phải đo bằng tay, do m k thuộc Nhóm mà loài ng biết
        //và tổng kêt thành cthuc khi chưa biết Nhóm cụ thể của Con của Shape
        //new Shape + phần đính kèm code cho 3 hàm abs là thành obj Con thoi
        //cần quái gì class Con tạo trước, miễn thỏa vùng ram là đc rồi
        //kĩ thuật mượn Shape new ra obj nào đó cũng là 1 hình nào đó ngẫu nhiên
        //mượn gió bẻ măng( mượn Shape new obj)
        //Shape xxx = new HBH(????);
        
        Shape anonymous = new Shape("Bé Na", "Bảy màu") {
            //phần bên trong nay chính là không giang của cái class HBH/HThoy, Thang
            //mà mình tạo lẻ, tạo sẵn, explicit như truyền thống phải chuột/new/class
            
            //về mặt nào, mình có quyền khai báo biến ở đây, viết thêm hàm khác
            //ở đây vì đây chính là 1 class lẽ ra tạo riêng ấy
            
            //nay mình chơi trò on the go, take away vừa tạo Khuôn vừa new luôn
            //nặn chén = tay, Khuôn là tay luôn, hàng handmade
            
            //cách này bị hạn chế là phải ăn theo cons của cha, k độ cons
            //với đầu vào riêng như class rời làm sẵn Disk, Rect
            
            //viết code cho 3 hàm thì sao, thì phải tự đo kích thước diện tích
            //ta chơi trò random dt
            //NHÀ GIÀU: tập bắn súng để đi săn, tập tenis
            //máy bắn vật thể nhiều hướng khác nhau, ngẫu nhiên, người chơi hứng vật thể
            //để tập dợt
            //mua Vietlott, máy tính phát sinh ra dãy số 6/45 ngẫn nhiên(6 số k trúng từ 1..45)
            //2 thằng mày, 2 obj thuộc nhóm class Random, thuộc java.util
            @Override
            public double getArea() {
                Random mayNgauNhien = new Random();
                double tmpArea = mayNgauNhien.nextDouble() * 50;
                return tmpArea;
            }
            //nextDouble() trả con số ngẫu nhiên(0...1)
            //sát 1 * 50 thì lá sát 50, 49.999999999
            //đây là kĩ thuật lấy con số thực k vứt quá N nào đó
            @Override
            public double getPerimeter() {
               return new Random().nextDouble() * 40;
            }//dt k quá 40
            //obj vừa sinh ra, trả con số ngẫu nhiên, sau đó obj bị JVM giết
            //vì k có con trỏ neo/móc nó lại
            //ta k xài biến con trỏ, new luôn, lấy tọa độ new, chấm luôn, mò vùng new làm luôn
            //bớt biến con trỏ, chỉ xài khi k có nhu cầu chấm lại
            
            @Override
            public void paint() {
                System.out.printf("|?????  |%-10s|%-10s|%6.2f|%6.2f|\n", owner, color, getArea(), getPerimeter());
            }
        };//kết thúc lệnh new mà 
        //xong class Vô Danh rồi, new luôn rồi, goppj lệnh mà, éo làm class rời như Disk, hbh
        //giá trả: mỗi khi new là 1 lần hộc máu viết code, handmade mà
        anonymous.paint();
}
}
//btvn tự sort all 
