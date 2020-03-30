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
//Class con bắt đầu
//1.tạo con
//2.tạo đặc điểm của riêng Con nếu cần, phần nào chung với Cha để lên Cha, nhân tử chung
//3.tạo kết nối cha con qua từ khóa extends
//4.tạo cst, độ lại nếu cần
//5. về lí thuyết thì đã xong
// nhưng do cha là abs chứa hàm k code
//nên
//      hoặc con làm biếng, k thèm viết code luôn
//          > Con bắt buộc phải là abs(vì thừa kế hàm abs từ cha)
//          > Con là abs, cấm new luôn, vì new Con, chấm hàm, lấy code đâu mà chạy
//          k new Cha, k new Con, dòng họ vô sinh, k tạo đc obj nào cả ấy


//      hoặc con sẽ viết code
//             thực sự con PHẢI VIẾT TẤT CẢ CÁC HÀM ABS CỦA CHA
//             THÌ CON SẼ TRỞ THÀNH CÁI KHUÔN HOÀN CHỈNH, ĐỦ CODEMĐÚC ĐC NEW ĐC
//             IMPLEMENT ALL ABS METHODS
//             hàm abs của Cja đã có code ở con, Con @Override
public class Disk extends Shape{
    public static final double PI = 3.14;
    //biết thừa owner,color chung với Cha, đám Anh Em (CN,TG)
    //còn lại bk cho riêng anh
    private double radius;
    
    public Disk(double radius, String owner, String color) {
        super(owner, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //việt sub: Cắt Htr, new Htr tức là cắt HH chứ còn gì nữa
    //new Disk() tức là new Shape() ~ super
    //source: câu lệnh super() phải là câu lệnh đầu tiên trong phễu của con
    //lí do: có Cha rồi mới có Con, k có Cha đỡ làm gì có con
    //new Cha xong rồi muốn làm gì thì làm
    //Con sinh ra chẳng qua là phiên bản độ của Cha
    //độ xe máy thì phải có xe rồi mới độ đc
    //BA SẼ LÀ CÁNH CHIM CHO CON BAY THẬT XA
    //the super() statement must be the first one in the Child's constructor
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }
    
    @Override
    public void paint() {
        System.out.printf("|DISK    |%-10s|%-10s|%4.1f|%4.1f|%6.2f|\n|", color, owner, radius , getArea(), getPerimeter());
    }
    
}

 

