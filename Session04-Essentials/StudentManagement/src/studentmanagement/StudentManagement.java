/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import data.Student;

/**
 *
 * @author pc
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Student Nhan = new Student("SE140052", "Trọng Nhân", 2000, 9.2);
         Student Binh = new Student("SE140022", "Bình Lê", 2000, 10);
         Student cuong = new Student("SE120022", "ở dơ", 2000, 0.0);
         Nhan.showProfile();
         Binh.showProfile();
         System.out.println("Nhân: " + Nhan);// gọi thầm tên em 
         System.out.println("Bình: " + Binh.toString());// k gọi thầm
         //có 2 loại dấu chấm
         //chấm qua tên obj, túc là đồ của riêng object, Nhan.showProfile() Nhan.yob gs yob public
         //gọi là ta đang xài non-static, xài đồ gắn với riêng obj
         
         
    }
    
}
