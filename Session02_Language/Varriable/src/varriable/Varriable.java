/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varriable;

/**
 *
 * @author pc
 */
public class Varriable {
    
     /*@param args the command line arguments
     */
    public static void main(String[] args) {
       // playWithInt();
       playWithDouble();
       
    }
    public static void playWithString (){
        // java cung cấp kiểu dữ liệu mới so với C để lưu chuỗi
        // từng kí tự: char (2 byte thay vì 1 byte như C - Hỗ trợ unicode
        
    }
    public static void playWithDouble (){
        // mặc định java khoái chơi với double hơn là float, 8 byte đc ưa
        // thích hơn 4 byte
        double vat = 0.1; // double 10^308
        System.out.println("Thuế là: " + vat);
        float pi = 3.14f; // f số thực nhỏ
        System.out.println("Số PI = " + pi);
    }
    public static void playWithInt(){
    int yob; // xin 4 byte trong ram
    // dat ten la yob, dung de on off 1 con
    // so nguyen. ta goi la khai bao 1 bien
    // declare a variable 
    // vung ram nay chua cho info, data
    //C: se tu on offf ngau nhien, rac
    yob = 2000; // on off vung ram, gan gia tri cho bien
    System.out.println ("yob: " + yob);
    System.out.println("your age:" + (2020-yob));
    // lưu ý về kiểu int, long
    // java mặc định thích chơi với int hơn là long
    // ở trên mình chơi int rồi, nay ta chơi long
    char fL = 'H';
    System.out.println("kí tự: "+ fL);
    // 2 BYTE trong ram 
    
    String name = "Đại học fpt xavalo";
    System.out.println("Name" + name);
    
    //~C: char name [40] = "DAI HOC FPT...";
        System.out.println("Name in lower case:" + name.toLowerCase());
    // 2 BYTE trong ram 
    

    
    //~C: char name [40] = "DAI HOC FPT...";
   
    
    //long money = 5_000_000_000l; // l đc ám chỉ con số nguyên này là nguyên bự
   // System.out.println("money = " + money);
    }
}
