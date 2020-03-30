/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petcarev1;

import data.Dog;

/**
 *
 * @author pc
 */
public class PetCareV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog chiHu = new Dog("CHI HU HU", 2020, 0.5, "white");
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2019, 50.0, "red");
        
        chiHu.showSoaiCa();
        ngaoDa.showSoaiCa();
        chiHu.bark();
        ngaoDa.bark();
        //chiHu sủa lại, để xem có bị đụng biến hay k 
        //name đang có vẻ xài chung cho CHH và NĐ;
        chiHu.bark();
        //ta thấy biến name trong Khuôn Dog lưu dc cả CHH
        //ND, tương lai còn lưu cả vàng ơi, Bê-Tô, Nanh Trắng
        //hậu trường là do toán tử "new"
        // new ~ malloc () calloc () bên C
        // new tương đương việc nhân bản cái Khuôn
        Dog vangOi = new Dog("Vàng ƠI", 1950, 10.0, "YELLOW");
        //vangOi la mot con Dog, với các info đi kèm
        //info bên kia đại diện duy nhất cho 1 obj Dog cụ thể
        //vì có qá nhìu info, ta gọi tắt nó là vangOi
        //vậy vangOi dc gọi là biến obj
        //Dog dc là kiểu dữ liệu, kiểu Dog
        //~ lệnh int yob = 2000;
        //yob là tên tắt đại diện cho value bên kia 2000
        //thuộc nhóm số nguyên
        //yob đc gọi là biến
        // int đc gọi là kiểu dữ liệu
        
        //tui muốn biết tên \ưcủa con chiHu
        System.out.println("CHH name: " + chiHu.getName());
        
        //tui muốn lấy cân nặng của con ngaoDa
        ngaoDa.getWeight();
        System.out.println("NĐ weight: " + ngaoDa.getWeight());
        //tui mún biết màu lông của chiHu
        System.out.println("CH color: " + chiHu.getColor());
        
        // bố đổi lông m đây
        chiHu.setColor("RAINBOW");
        System.out.println("CH color: " + chiHu.getColor());
        
        chiHu.showAll();
        ngaoDa.showAll();
        
        //tui muốn biết tuổi con ngaoDa
        System.out.println("ND age: " + ngaoDa.getAge());
    }
}
