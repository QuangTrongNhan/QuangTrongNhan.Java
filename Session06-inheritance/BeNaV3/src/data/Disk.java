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
public class Disk extends Shape{
    public static final double PI = 3.14;
    private double radius; //đồ của riêng con heng

    public Disk(String owner, String color) {
        super(owner, color);
    }
    //đọc dễ thương tự nhiên
    //cắt hình trò chính là cắt HH, new HT chính là new một Shape

    @Override //Cha bắn cái lại cho Con viết hàm tính S(), hợp lí mà
    //vì con giống cha, phế võ công 
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void paint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
