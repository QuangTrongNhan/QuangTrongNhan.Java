/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samurai;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Samurai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithADP();
        //playWithQT();
        //dù QT hay ADP ta mới chỉ giải quết câu chiện trôi lệnh
        //chưa giải quết đc trường đưa
        //killMySelf();
        playWithTryCatch();
    }
    
    //tình huống bạn cần viết 1 app nhập thông tin sv
    //id,name,yob(try, trôi lệnh), addr,điểm văn(try trôi lệnh)
    //việc nhập số nói chung lặp đi lặp lại việc try, trôi lnehej
    //tách thành riêng hàm nhập số ói về số, chửi khi nhập sai
    //hàm dịch vụ cung cấp cho nơi khác xài value của nó 
    //hàm thuộc nhóm service,helper giống như bồi bàn
    //hàm này xài chung, chấm lun,khỏi new
    //y chang cái kiểu Math.sqrt(???) -> ???
    
    public static void playWithQT (){
        int yob = 0;
        
        String name, address;
        Scanner sc = new Scanner(System.in);
       
        System.out.print("InPut name: ");
        name = sc.nextLine();
        
        System.out.print("Input yob: |1990..2K|: ");
        yob = Integer.parseInt(sc.nextLine()); //QT solution
        //hốt tất cả trong buffer kể enter, loại bỏ enter, phần chuỗi còn lại
        //vd là "2000" đưa đầu vào cho hàm parseInt() convert chuỗi 2000
        //thành số 2000 ->yob ngon lành
        // nextInt convert trong buffer thành số, nhưng để lại enter
   
        
        if (yob < 1900 || yob > 2000){
            System.out.println("please input again");
        }
        
        //Double.parseDouble()
        //class TraiBao, bao primitive thành obj
        System.out.print("InPut address: ");
        address = sc.nextLine();
        
         
        System.out.println("Your profile");
        System.out.println("yob: " + yob + "; Addr: " + address + "; Name: " + name);
    }
    //một khi nhờ JVM cho mình cơ hội kiểm soát việc nhập cà chớn Exception(tình huống bất thường)
    //k dự liệu, phát sinh bất ngờ
    //khi cà chớn xảy ra bạn sẽ yc ng dùng nhập lại data nếu tiếp tục cà chớn tiếp tục
    //lại cho đến khi ổn thì thôi -->k ổn chửi tiếp --> vòng lập do while
    // thay vì chơi default như giải 
    public static void playWithTryCatch(){
        int yob;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Input a yob(1990...2000): ");
            try {
                yob = Integer.parseInt (sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("do you know to input an integer?");
            }
            
        } while(true); //1 == 1 // do (....) while (điều gì còn đúng thifvongf vào trong ... làm tiếp đi)
              System.out.println("yob: "+ yob + "Age: " + (2020 - yob));           
    }
    
    public static void killMySelf(){
        //JVM đừng giết em như ADP, QT, để em tự mổ bụng
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input yob: |1990..2K|: ");
//        yob = sc.nextInt(); // coi chừng bị giết
//        yob = Integer.parseInt(sc.nextLine()); // coi chừng bị giết
        

           //JVM ơi, giám sát bọn cà chớn giúp em, nếu có báo em 
        try {
            yob = sc.nextInt(); //để lại trôi lệnh và chón thì ks 
        } catch (Exception e) {
            //JVM gửi sứ giả e báo mình biết thông tin cà chớn xảy ra
            //tự new 1 obj cà chớn Exxception gửi qua tên tắt em
            //e. ra toàn bộ info cà chớn
            //thông tin đỏ đỏ nguy hiểu
            //jvm k giết app
            //e.printStackTrace();// in ra lỗi xem sao khi có lỗi 
            System.out.println("do u know to input an integer?");
            yob = 69;
        }
        System.out.println("Yob: " + yob);
    }
    public static void playWithADP(){
        int yob;
        String name, address;
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.print("InPut name: ");
        name = sc.nextLine();
         System.out.print("Input yob: |1990..2K|: ");
       
        yob = sc.nextInt(); // máy quét return con int nhập từ bàn phím, đẩy vào biến yob
        //lệnh nextInt() để lại ít nhất là enter và sau dấy cách (nếu có)ư
        //chơi lệnh huyền bí, tà chiêu, SDP
        
//        sc.nextLine(); //sqrt(4) hốt sạch buffer và enter, đếch dùng vào việc gì
        //cảm giác lệnh dư vì gọi hàm mà k xài value, đâu biết mình xóa buffer đấy
        
        //nextInt() khốn nạn, hốt con số trước enter, trước dấu cách, để lại rác
        
        System.out.print("InPut address: ");
        address = sc.nextLine();
        
        
        System.out.println("Your profile");
        System.out.println("yob: " + yob + "; Addr: " + address + "; Name: " + name);
        }
    
    
    
}
