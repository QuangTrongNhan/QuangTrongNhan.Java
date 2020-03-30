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
//Disk mà extend Rectangle/Square nghe vô lí lắm luôn
//v thì phải làm tutu đã
public class Disk {
    public static final double PI = 3.14;
    //public: đứng ngoài khuôn chấm đc, éo cần get() set()
    //static: xài chung cho cả dòng họ, đc quyền chấm trực tiếp là k cần new
    //Disk.PI
    //final ~ const bên C: hằng số, cấm thay đổi value nhen
    //double: kiểu dữ liệu
    //PI: tên biến gắn sẵn value
    //định nghĩa hằng số/biến hằng/biến cấm thay đổi value, và cho xài chung luôn/ sờ luôn
    //quy tắc đặt tên: CHỮ_HOA_TOÀN_TẬP_SHIFT_GẠCH_PHÂN_TÁCH_CÁC_TỪ
    
    private String owner;
    private String color;
    private double radius;

    public Disk(String owner, String color, double radius) {
        this.owner = owner;
        this.color = color;
        this.radius = radius;
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override //k thấy rỏ ghi extends gì cả mà lại override là s ? Cha của Tròn là ai?
    public String toString() {
        return "Disk{" + "owner=" + owner + ", color=" + color + ", radius=" + radius + '}';
    }
    
    //hàm tự tui
    public double getPerimeter() {
        return 2 * PI * radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
       
    public void pain() { //99.9cm ->4.1f
        System.out.printf("||DISK    |%-10s|%-10s|%4.1f|%4.1f|%6.2f|%6.2f|\n", owner, color, radius, getArea(),getPerimeter());
    }
}
