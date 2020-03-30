/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author pc
 */
//tủ đựng nhiều hồ sơ, đặc điểm của nó là"
//đặc điểm: màu sắc, giá tiền, chất liệu, kích thước, chứa đc bao nhêu hồ sơ(mảng Student đó)
//hành động: nhét hồ sơ vào(đựng), lấy hồ sơ ra (kéo) mình tương tác gọi hành động qua chấm
public class Cabinet {

    private String name; //tên của cái tủ, nhãn dán ngoài tủ: Tủ đựng SV chuyên ngành SE
    //ĐỂ cho vui, quanz trọng nhất là ds hồ sơ
    private Student ds[] = new Student[500]; //mua tủ lớn chứa 500 hồ sơ
    private int count = 0; //mặc định tủ mua về chưa có hồ sơ nào đc bỏ vô, tối đa 500
    //constructor: có nhiều cách làm constructor
    //mua tủ new tủ á, nhét luôn 500 hồ sơ,dán cái tên luôn
    //mua tủ sẽ chứa 500, chưa nhét hồ sơ, tutu bỏ vô, dán cái tên làm trước

    public Cabinet(String name) {
        this.name = name;
    }

    //nhét hồ sơ vào, hàm quan trong nhất
    public void addNewStudent() {
        Student ds[] = new Student[5];
        //for để nhập từng bạn, new từng bạn với inf đc nhập, làm 50 lần
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob;
        double gpa;
            System.out.println("Input student no #"
                    + (count + 1) + "/" + ds.length);
            //mời nhập sinh viên thứ 1/5, 2/5 , 3/5, lừa đảo thứ tự, mảng đếm 0, ta đếm 1
            System.out.println("Input id: ");
            id = sc.nextLine().toUpperCase();

            System.out.println("Input name: ");
            name = sc.nextLine().toUpperCase();

            System.out.println("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());

            System.out.println("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());

            //ds[i] = new Student(id, name, yob, gpa);
            ds[count] = new Student(id, name, yob, gpa);
            count++;
        }
    

    //tủ kiếng trong suốt, mình thấy đc các hồ sơ, tủ cho mình xem hồ sơ
    //dó là hành động showALL() của cái tủ, printAllHoSo()
    public void showAll() {
        if (count == 0) {
            System.out.println("There is no student profile in the cabinet");
            return;
        }
        //ngược lại show đến count
        System.out.println("There are/is " + count + "profile(s) in the cabinet");
        System.out.println("Here it is/they are");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();
        }
        for (Student x : ds) {
            x.showProfile();
        }
    }
}
//BTVN:
//làm tương tự cho bài quản lí các con Dog, hoặc Cat, nhà sách
//ngon làm thêm menu để gọi hàm vào tủ
//deadline: 12h đêm ngày thứ 2 9.3.2020