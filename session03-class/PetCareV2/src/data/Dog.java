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
    public Dog(String name, int yob, double weight, String color) { // hàm constructor
        name = this.name; //ngáo,đổi vật liệu ra ngoài cmnr
        this.name = name;
        this.yob = yob; // ý tui mún là năm sinh bên ngoài đổ vào bên trên
        this.weight = weight;
        this.color = color; // nhận ghi bên trái
        
        //this này là của một con dog bất kì trong tương lai đang nói về chính mình
        // xài this khi có sự nhầm lẫn về tên biến
        // khi muốn nhấn mạnh
    }
    // biến khai báo trong hàm:local variable
    // biến ngoài hàm (c):instance variable, field,pro
    //phễu là 1 hàm đặc biệt dùng để nhận vật liệu bên ngoài 
    //đổ vào bên trong Khuôn
    //còn đc gọi là hàm khởi tạo/hàm khởi dựng/hàm CONSTRUCTOR
    //nó k có giá trị trả về/kh có chữ void luôn
    // mỗi lần xài phễu, một lần đúc obj mới
    // tên giống 100% class
    //có value rồi sau khi đổ, đúc
    //ta thoải mái con gà mái xài các biến ở trên
    //ta cho con cờ hó sủa
    public void bark (){
        System.out.println("welcome to my home");
        System.out.println("My name is " + name);
        System.out.println("By the way, my yob: " + yob);
        System.out.println("Weight: " + weight + "; Color: " + color);
    }
    
    //trong con Dog bất kì đang có info: name, yob, weight,...
    //những info này đc đổ khi xài phễu rồi
    //do đó con Dog sẵn sàng để để cung nó ra khi đc hỏi
    //ta làm hàm getInfo() tương ứng khi ai hỏi
    // bạn muốn biết tên của tôi hả??? hãy hỏi đi để tui trả lời
    
    public String getName(){
        return name;
    }
    
    // bạn muốn biết năm sinh của tui hả???? hỏi đi, tui trả lời
    public int getYob(){
        return yob;
    }
    public double getWeight(){
       return weight; 
    }
    //tương tự cho các đặc điểm còn lại của ta
    //tui đc đổ info lúc tui đc đúc
    //nhưng tui k hài lòng tui muốn theo trend, v tui đè nó
    //bằng màu mới, thay đổi màu lông, thay đổi nick name....
    //tui thay đổi tui, nghĩa là set() lại cái gì đó của tui
    //đó là hàm set ... ()
    public void setColor(String color){
        this.color = color;
    }
        //màu bên trong đc đè/overwrite bằng màu mới đưa vào
        //nghe có mùi giống hàm constructor
    //các hàm mà k phải là constructor
    //thì bạn có thể gọi nhiều lần tùy thích vì đó là hành động của 1 obj bất kì đc đúc
    //còn constructor là cái phễu, mỗi lần gọi phễu là
    //1 lần tạo ra obj mới à nhen
    //tui có thể hỏi tên bạn cả tỷ lần
    //tui có thể thay đổi kiểu tóc n lần
    //tui chỉ đc đúc duy nhất 1 lần trên cuộc đời này
    //1 kiếp/1 mạng mà thôiiiii
    
    public String getColor(){
        return color;
    }  //mún hỏi màu lông tui tl
    //tui gặp Pikachu, tui cần phải show ra info của tui
    //tức là phải sout () hết cacs info sủa ra hết các info ()
    //chính là tương đương hành động đưa ra cái CMND cso hết info
    public void showAll(){
        // hàm đưa ra tất cả info của dog
        //1 con Dog thì có: name, yob,weight,color....
        //mình in tất cả thay vì chỉ sủa() và cái info
        System.out.println("My detailed info");
        System.out.println("Name: " + name
                            + "\nYob: " + yob
                            + "\nWeight: " + weight
                            + "\nColor: " + color);
    }
    
    //tui có năm sinh, tui còn hay hơn nữa, tui nói
    //cho bạn biết luôn về tuổi của tui
    //ai có nhiều thông tin nhất, gã đó nên xử lí nó
    //triết lí để phân bổ hàm vào đúng nơi chốn
    public int getAge (){
        return 2020 - yob;
    }
    
    // in ra toàn bộ info của mình dạng soái ca, tabular
    public void showSoaiCa(){
       // System.out.println("Name: " + name + "; yob: " + yob);
       // k giống lề
       // giờ ta chơi trò hay hơn
        System.out.printf("|%-15s|%4d|%4.1f|%10s|\n",
                           name, yob, weight, color);
    }
}
