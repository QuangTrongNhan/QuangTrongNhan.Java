/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
// package là thư mục, ngăn chứa, phòng, mình để đồ
//ở đây là nơi mình cất cái Khuôn Dog
//vì đồ đạc thì phải để ngăn nắp 
// quy tắc đặt tên: danh từ, chữ thường toàn tập
// dùng dấu chấm phân cách ngăn tủ cha, ngăn tủ con
//c:\Window\system32
//c.window.system32
//q9.dhfpt.lau4.phong412
//trong phòng 412 tui thấy có 30 object thuộc nhóm ConNguoi
//q9.dhfpt.lau4.phong412.ConNguoi
/**
 *
 * @author pc
 */
// Khuôn Dog y chan Khuôn CMND, Khuôn TrongDong
//bên trong sẽ chứa vật liệu đổ vô, các chi tiết mình
//design
//chứa các hành động (nếu mình muốn đúc obj có động đậy)
//tivi chứa bên trong hành động: chiếu (), sángĐèn()
//code chỉ viết trong Khuôn, các chi tiết bên trong Khuôn
//cấm nằm ngoài Khuôn, nếu kh Khuôn bị lủng, sao đúc???
public class Dog {
    private String name; // Milu,misa
    private int yob;// nwam sinh có thể:2020,2019,2018,...
    private double weight; // cân nặng: 1,0kg, 50,0kg,...
    private String color; // màu lông: xanh, đỏ,...
    //... rất nhiều đặc điểm khác bạn có thể mô tả
    //private lưu value đơn
    
    //cần lắm luôn cái phễu để hứng đồ đổ vô các chi tiết
    //các đặc điểm của Khuôn
    public Dog(String iName, int iYob, double iWeight, String iColor) {
        name = iName;
        yob = iYob;
        weight = iWeight;
        color = iColor;
    }
    //phễu là 1 hàm đặc biệt dùng để nhận vật liệu bên ngoài 
    //đổ vào bên trong Khuôn
    //còn đc gọi là hàm khởi tạo/hàm khởi dựng/hàm CONSTRUCTOR
    //nó k có giá trị trả về/kh có chữ void luôn
    // mỗi lần xài phễu, một lần đúc obj mới
    
    // có value rồi sau khi đổ, đúc
    // ta thoải mái con gà mái xài các biến ở trên
    //ta cho con cờ hó sủa
    public void bark (){
        System.out.println("welcome to my home");
        System.out.println("My name is " + name);
        System.out.println("By the way, my yob: " + yob);
        System.out.println("Weight: " + weight + "; Color: " + color);
    }
}
