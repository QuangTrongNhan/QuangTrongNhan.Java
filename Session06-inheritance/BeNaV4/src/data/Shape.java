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
//a.b + a.c + d.e -> nhân tử chung là gì??? none
//V Tr CN TG HBH -> color, S() P() chung khái niệm thoi nhen, ý tưởng tính thoy
//hok tính cụ thể đc
public abstract class Shape {
    private String owner;
    private String color;
    //private double radius; //hình mẹ gì có cạnh và bk?
    //private double a, b ,c; //chưa kể lát hồi kế thừa, TG sẽ có bk, Tròn thì có cạnh
    //cạnh, bk là của riêng từng hình, từng con, đám con chỉ chung những cái đc gọi là chung bk là đặc điểm riêng của hình tròn

    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + '}';
    }
   
    public abstract double getArea(); //ý tưởng, khái niệm, cần đo bề mặt, đo thể
    public abstract double getPerimeter(); //nào tùy mỗi hình cụ thể
    public abstract void paint();
    //k có code, without the body of function
    //mình k có kích thước để tính
    //mỗi th in khác nhau
    //class khuôn này chứa hàm k có code, vậy gs cho new Shape(???)
    //nếu chấm vào hàm này thì sao, k có code lấy gì mà tính, coi chừng Exception bi h 
    //cấm new luôn cho rồi, vì m đâu có cụ thể
    //Shape là khái niệm chung chung thoy mà
    //Shape cx là abs
    //class chứa hàm abs gọi là class ABS
    
    //NGƯỢC LẠI ĐC K? MỘT CLASS LÀ ABS MÀ NÓ LẠI K CHỨA HÀM ABS? ĐC
    //VỀ MẶT CODE, VỀ MẶT LOGIC K TH NÀO LÀM THẾ
    
    //NGOÀI ĐỜI GẶP ABS HƠI BỊ NHIỀU
    //Xe máy là một vehicle/PTGT
    //Ô tô là một Vehicle
    //Xe đạp là một Vehicle
    
    //Mèo, cờ hó, Person -> Animal
    
    //Cây thông, Cây cà chua, Cây bắp -> Thực vật
    
    //Mèo, Cây thông, con cờ hó, cây lúa -> Sinh vật
    
    //chung chung đến cỡ nào thì ta có abs đến cỡ đó
    
    //Cha chung chung, Con phải viết code cho chung chung này
    //Con phải code cho hàm abs, ngay và luôn, vì
    //con HCN có cạnh r, tính thoi
    //Con code cho hàm abs của Cha
    //                          implement
    //                          và còn trùng tên hàm Cha, @Override
    //Cha abs, con phải tự lo( vẫn gọi là @Override)
    
    //Cha CN, con V -> Cha lo hết, Con thích thì độ
}
