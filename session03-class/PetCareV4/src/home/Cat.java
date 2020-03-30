/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

/**
 *
 * @author Admin
 */
public class Cat {
    private String name;
    private int yob;
    private String color;
    private char sex;

    public Cat(String name, int yob, String color, char sex) {
        this.name = name;
        this.yob = yob;
        this.color = color;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        //return "Cat{" + "name=" + name + ", yob=" + yob + ", color=" + color + ", sex=" + sex + '}';
        //độ toString giống soái ca luôn
        String tmp = String.format("|%-15s|%4d|%-10s|%1s|",
                               name, yob, color, sex);
        //hàm format() trả ra chuỗi y chang như printf()
        //dùng kỹ thuật % ghép, điền vào chỗ trống 
        return tmp;
    }
    
    //hàm của riêng mình
    //tính tuổi con mèo bất kì
    public int getAge() {
        return 2020 - yob;
    }// code cứng/hard code
    
    public void showAll() {
        //viết giống lề kiểu tabular
        System.out.printf("|%-15s|%4d|%-10s|%1s|\n",
                               name, yob, color, sex);
        //System.out.println("Name: " + ... + "Yob" + ...);
    }
}
