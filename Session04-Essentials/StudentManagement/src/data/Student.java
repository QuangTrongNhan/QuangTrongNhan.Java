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
public class Student {
    private String id; //SE12354 non-static
    public static String name; // có static
    public static int yob;
    private double gpa;     //điểm tb
                            //mình sẽ xếp hạng sv đc từ gpa
                            //hàm xếp hạng nằm ở class Student
    //k đi kèm static tui gọi đặc điểm này là non-static
    //private/public/protected default gọi là quyền đc sờ
    //đứn

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
//        String msg = String.format(name, yob);
//        return msg;
        return "Student{" + "id=" + id + ", name=" + name + ", yob=" + yob + ", gpa=" + gpa + '}';
    }//độ lại bên trong theo kiểu soái ca- về nhà
    
    public String getRank(){
        if(gpa < 5)
            return "POOR";
        else if (gpa < 6)
            return ("AVERAGE");
        else
        return "GOOD";
    }
    
    public void showProfile (){
        System.out.printf("%-8s|%-25s|%4d|%4.1fl|%-10s|\n",id, name,yob,gpa,getRank());
                                
    }
    
    public static void sayHi(){
        System.out.println("Hi everyone");
        System.out.println("My name is: " + name);
        System.out.println("Yob: " + yob); //static nwamf chung 1 nơi, obj nào cũng phải
        //tuy nhiên hàm static k thể biết lấy id ,gpa của obj do có quá nhieeuff 
        //obj đc new, c9s q7as nhiều id
        // k chơi với non vì k biết ưu tiên
    }
//show tất cả info()
//show luôn cả rank, vì rank là chuỗi trả về từ hàm
//sout (getRank());
}
