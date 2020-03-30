/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Stage {
    //sàn thứ cấp, thứ 2, ko mặc định, mún mở nó lên Shift f6
    //thằng sàn mặc định gọi F6, ko cần mở sẵn
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", 1950, "Blue-White", 'M');
        tom.showAll();
        //gọi thầm tên em
        System.out.println(tom); //gọi toString ngầm
        
        //tui mún con mèo Doremon xuất hiện
        String name, color;
        char sex; 
        int yob; //biến cục bộ đón value từ bàn phím 
        //nso chính là nguyen liệu để đổ vào Khuôn Mèo để đúc từng con mèo cụ thể nào đó
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        name = sc.nextLine();
        
        System.out.println("Input color: ");
        color = sc.nextLine();
        
        System.out.println("Input sex (M|F|U): ");
        sex = sc.nextLine().charAt(0); //cắt ký tự đầu tiên 
                                       //của chuỗi nhập vào
        System.out.println("Input yob: ");
        yob = sc.nextInt();
        
        Cat oggy = new Cat(name, yob, color, sex);
        oggy.showAll();
             
    }
}
