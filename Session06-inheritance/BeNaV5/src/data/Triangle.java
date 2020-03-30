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
//TG là con của shape nhưng lại là Cha của TGV
//Cha cứ tồn tại đi, Con kết nối
public class Triangle extends Shape{
   //mô tả tg: owner, color(Cha Shape giữ)
   //ta còn lại 3 cạnh
   //Cha chung 1 đám con thay vì ngày xưa chỉ là câu chuyện của 2 cha con tg tgv dễ xử lí
   protected double a;
   protected double b;
   protected double c;

    public Triangle(double a, double b, double c, String owner, String color) {
        super(owner, color); //must be 1st position
        this.a = a;
        this.b = b;
        this.c = c;
    }

    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + b;
    }
    
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    @Override
    public void paint() {
        System.out.printf("|Triangle |%-10s|%-10s|%4.1f|%4.1f|%4.1f|%6.2f|%6.2f|\n|", color, owner, a, b, c, getArea(), getPerimeter());
    }
   
    
}