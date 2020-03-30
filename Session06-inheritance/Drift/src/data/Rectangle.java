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
public class Rectangle {
    protected String color;
    protected double width;
    protected double length;

    public Rectangle(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "color=" + color + ", width=" + width + ", length=" + length + '}';
    }
    
    
    public double getArea() {
        return width * length;
    }
    
   
    public double getPerimeter() {
        return (width * length) * 2;
    }
    
    public void paint() {
         System.out.printf("|Rectangle   |%-10s|%4.1f|%4.1f|%6.2f|%6.2f|\n", color, width ,length, getArea(), getPerimeter());
    }
    //THẰNG CON BẤT HIẾU
    //NHỮNG GÌ CỦA CHA LÀ CỦA CON
    //NHỮNG GÌ CON K CÓ, CỨ LẤY CHA MÀ XÀI
    //NHỮNG GÌ CỦA RIÊNG CON, CẤM CHA SỜ, CHA K THẤY LUÔN
    //CÓ CÁC CÁCH SAU KHI BÀN VỀ CHA CON VÀ THÁNH THẦN
    //KHAI CHA NEW CHA( CHA CỤ THỂ - KHAI GÌ NEW ĐẤY)
    //KHAI CHA NEW CON( KẾ THỪA, IS A)  RECTANGLE X = NEW SQUARE(); //V LÀ CN
    //KHAI CON NEW CON( CHUẨN CƠM TỪ DDAAUAF KÌ, KHAI GÌ NEW NẤY)
    
    
    //KHAI CON NEW CHA, GÃY, Square x = new Rectangle()
    //                                      HCN là HV, điên ngáo nặng
    
    
    //Drift chỉ xảy ra ở khai cha new con, is a á
}
