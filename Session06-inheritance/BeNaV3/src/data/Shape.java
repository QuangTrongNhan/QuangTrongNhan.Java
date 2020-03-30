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
//Cha của một đám hình vuông tròn chữ nhật thang,...
//đọc một chiều thuận tự nhiên is a kind of
//hình vuông là một dạng hình học chuẩn
//TG là một dạng hình học chuẩn
//hình học là Htr, vớ vẩn, vì còn nhiều thứ nữa
//cha là nhân tử chung của đám Con, nhiều Con rồi, hơi khó khăn chút

public abstract class Shape {
    private String owner;
    private String color;
    //private double radius; // vớ vẩn, HH k thể có bán kính vì bk dành riêng cho hình tròn
    //private double width; //vô lý cho hình tròn sau này, cạnh chỉ dành cho tam giác, vuông, chữ nhật

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
    
    //tính diện tích tính sao???
    public abstract double getArea(); //{
        //k có cạnh s tính, k có bk s tính
        //để vào thì k đc, do đám Con nó khiếu nại
        //con là CN mà Ba bắt con có bk
        //getArea() là khái niệm chung chung bàn về
        //việc đo đạc bề mặt và tính toán con số
        //đo thế nào thì tùy hình cụ thể, nhưng nói chung mày là hình m tính đc
        //vậy tồn tại mà k cụ thể, chỉ là khái niệm mà th
        //ta gọi là ABSTRACT - trừu tượng
        //môn học trừu tượng vãi: mất tiền thật, số buổi học có thật, bài giảng có thật
        //éo nắm đc gì cả
        //tình yêu trừu tượng: khó nắm bắt, nhưng ai cũng nói về nó
    //}
    //hàm abstract là hàm k có code, sao tính
    //từ từ, đứa nào cụ thể đứa đó lo: CN dư sức tính, Tr dư sức
    //HH thì thua, bố đại diện cho chúng m, hàm abs chính là hàm đại diện
//   public abstract double getPerimeter();
   
    public abstract void paint();
}
// class triangle(A,B,C)
// class righttriangle(A,B) -> con leehcj với cha độ cst của Con, y chang vụ V và CN
//tính S: công thức heron

//ráp vào bài shape luôn, sort cả đám
//trước 7h tối chủ nhật