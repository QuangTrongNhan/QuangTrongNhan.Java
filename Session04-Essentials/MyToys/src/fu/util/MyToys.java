/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class MyToys {
    //giúp cho tên hàm kèm đầu vào là duy nhất - signature of a method must be unique
    //hiện tượng 1 class bất kì có chứa các hàm trùng tên nhau khác tham số đứa vào
    //gọi là OVERLOAD/OVERLOADING
     public static int getAnInteger(int msg, String errorMsg){
        return 0;
     }
    //vì class này Khuôn này mang ý nghĩa vùng xài chung cung cấp hàm dịch vụ
    //nó chẳng cần nhớ j riêng cho nó, nên khỏi cần field/biến/đặc điểm nào cả
    //k đặc điểm cần j đổ vào
    //thằng nào gọi MyToys đầu tiên, thằng đó phải tạo ra vùng static, wc công cộng đã có

    // hàm static, khi sờ em thì sờ trực tiếp qua dấu chấm với MyToys khỏi cần new gì cả
    //MyToys.getAnInteger() --> Math.sqrt() String.format()
    //kh cần nhớ thông báo riêng cho mình
    public static int getAnInteger(String msg, String errorMsg) {
        int n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print(msg);
            try {
                n = Integer.parseInt(sc.nextLine());
                //break;
//                if(n < ? || n > ?)
//                else
//                    return;
                return n; //thoát luôn hàm có value hợp lệ return lun cho lành
            } catch (Exception e) {
                System.out.println(errorMsg);
            }

        } while (true);
        //return n;
    }
}
//alt-shift-f
