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
public class Triangle{
    protected String color;
    protected String owner;
    protected double A;
    protected double B;
    protected double C;
  
//    public Triangle(String owner, String color){
//        super(owner, color);

    public Triangle(String color, String owner, double A, double B, double C) {
        this.color = color;
        this.owner = owner;
        this.A = A;
        this.B = B;
        this.C = C;
    }
    //hack não: điều gì xảy ra nếu ta đưa 3 cạnh cà chớn, k cho đúc
    //3 cạnh cà chớn: tam giác chuẩn thì phải là: tổng 2 cạnh bất kì phải lớn hơn 
    //cạnh thứ 3
    //vẽ tam giác 3 cạnh thì sao: vẽ cạnh đáy 5, lấy compa, chấm đầu mút cạnh đáy quay 1 vòng
    //bk3, đầu mút kia quay compa vòng bk4, giao nhau 2 vòng chính là đỉnh còn lại
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    @Override
    public String toString() {
        return "Triangle{" + "color=" + color + ", owner=" + owner + ", A=" + A + ", B=" + B + ", C=" + C + '}';
    }
    
    public double getPerimeter() {
        return A + B + C;
    }
    
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
    
    public void paint() {
        System.out.printf("|Triangle |%-10s|%-10s|%4.1f|%4.1f|%4.1f|%6.2f|%6.2f|\n|", color, owner, A, B, C, getArea(), getPerimeter());
    }
}