
import data.Student;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class BasicArray {
    public static void main(String[] args) {
    //  playWithPrimitiveArray();
    //  playWithPrimitiveArrayV2();
    //sortPrimitiveArray();
    //playWithObjectArray();
    //playWithPoiter();
    //sortStudentList();
    //sortStudentListV2();
    inputStudentList();
    }
    public static void inputStudentList(){
        //tui mún nhập ds sv từ bàn phím, tui sort theo điểm luôn
        //đã học nhaappj một obj từ bàn phím, chưa hay rồi, RỒI BÀI CON MÈO
        Student ds[] = new Student[5];
        //for để nhập từng bạn, new từng bạn với inf đc nhập, làm 50 lần
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob;
        double gpa;
        
        for (int i = 0; i < ds.length; i++) {
            System.out.println("Input student no #"
                                    +(i + 1) + "/" + ds.length);
            //mời nhập sinh viên thứ 1/5, 2/5 , 3/5, lừa đảo thứ tự, mảng đếm 0, ta đếm 1
        System.out.println("Input id: ");
        id = sc.nextLine().toUpperCase();
        
        System.out.println("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        System.out.println("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.println("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        ds[i] = new Student(id, name, yob, gpa);
        }
        System.out.print("The student list");
        for (Student x : ds) {
            x.showProfile();  //x = ds[i] x trỏ đến hết cả đám, mỗi lúc 1 đứa
        }       
    }
    public static void sortStudentListV2(){
        Student ds[] = new Student[5];
        ds[0] = new Student("SE1", "Một", 2001, 10.0);
        ds[1] = new Student("SE5", "Năm", 1995, 5.0);
        ds[2] = new Student("SE9", "Chín", 1999, 9.0);
        ds[3] = new Student("SE3", "Ba Ba", 2003, 3.3);
        ds[4] = new Student("SE8", "Tám", 1998, 8.0);
        System.out.println("Before sorting");
        for (Student x : ds) {
            x.showProfile();
        }
        for (int i = 0; i < ds.length - 1; i++) {
            for (int j = i + 1; j < ds.length; j++) {
                if(ds[i].getGpa() > ds[j].getGpa()){
                    Student t; //điểm lớn hơn thì dời chỗ luôn, mày k đc ngồi chỗ đầu
                    t = ds[i]; //swap điểm là ăn đòn chỉ cho pri mới đc
                    ds[i] = ds[j];//đây là đổi chỗ trỏ, đầu mảng, trỏ vào đứa điểm thấp đi
                    ds[j] = t;//ngay và luôn
                }
            }
        }
        System.out.println("After sorting");
        for (Student x : ds) {
            x.showProfile();
        }
    }
    //tiếp tục về sort ds sinh viên. Khó à nha
    public static void sortStudentList(){
        //sắp xếp: so sánh(k đúng vị trí) rồi đổi chỗ/value
        //int a = 10, b = 3//ưu tiên nói a trước, b sau in màn hình: a b 10 3
        //nếu cần tăng dần thì a và b phải đổi value cho nhau
        //int t = a; a = b; b = t;   lúc này in màn hình a b: 3 ,10
        int a[] = {10, 3};
        if(a[0] > a[1]){
            int t = a[0];
            a[0] = a[1];
            a[1] = t;
        }
        System.out.println("After sorting");
        for (int x : a) {
            System.out.print(x + "\t");
        }
        System.out.println("\n");
        Student mot, hai;
        mot = new Student("SE01", "Một", 2000, 10);
        hai = new Student("SE02", "Hai", 2002, 2.0);
        // lấy mot làm mốc, in ra một và hai, sure, điểm đang giảm dần
//        mot.showProfile();
//        hai.showProfile();
//        //hoán đổi con trỏ
//        Student tmp = mot; //tmp đang trỏ đến điểm 10 đấy
//        mot = hai; //một trỏ vào điểm 2 đấy
//        hai = tmp; //hai đang trỏ vào tmp đang trỏ,10 đấy
//        System.out.println("After sorting");
//        mot.showProfile();
//        hai.showProfile();
        //mảng Student
        Student ds[] = new Student[2];
        ds[0] = mot; //đang 10đ, hai chàng 1 nàng
        ds[1] = hai; //đang 2đ, hai chàng 1 nàng
        System.out.println("Before sorting");
        for (Student x : ds) {
            x.showProfile();
        }
        if(ds[0].getGpa() > ds[1].getGpa()){
            Student t;
            t = ds[0];//t trỏ vào ds0, ds0 trỏ 10 nè, t trỏ 10
            ds[0] = ds[1];//ds0 này trỏ qua mới, trỏ cùng 1 đang trỏ, điểm 2
            ds[1] = t;//ds1 nay trỏ vào cùng t,t đang 10, ds1 điểm10      
        }
        System.out.println("after sorting");
        for (Student x : ds) {
            x.showProfile();
        }
    }
    public static void playWithPoiter(){
        Student mot = new Student("SE123456", "Một Nguyễn", 2000, 9.0);
        Student hai; //khai báo biến r gán value 
        hai = new Student("SE123111", "Hai Nguyễn", 2001, 8.0);
        mot.showProfile();
        hai.showProfile();
        Student xxx; //mới có vùng con trỏ, chưa đc on/off để chứa địa chỉ 
                      //cần lắm luôn địa chỉ của một tọa độ vùng new nào đó là ok
        //xxx= new Student(?, ?, ?, ?)
        xxx = mot; //mới à nhen, nhưng k lạ
                    //7M tọa độ vùng new MOtLe
                    //2 chàng cùng trỏ 1 mảng, dùng 2 ống nhòm nhòm 1 căn nhà 
        //chứng minh
        mot.setName("CHÙA MỘT CỘT");
        System.out.println("Hỏi xem xxx thế nào khi Chùa một cột");
        xxx.showProfile();
        //một obj cí quyền có nhiều  tên tắt: sep = new caSi (ST,1993,TB,LAC TROI)
                                                //sky = sep;
        //vi diệu 1: chán một cột r
        xxx = hai;
        System.out.println("Chán một cột XXX về đội hai");
        xxx.showProfile();
        //thích vùng new Student() nào, chỉ cần địa chỉ của nó thoi, trỏ đc liền
        xxx.setName("Phê Cần");
        
        mot.showProfile();
        hai.showProfile();
        
        //vi diệu tập 2: con Dog bị đứt xích chạy ra ngoài đường bị con Ex nó vớt
        //Nếu k còn sợi xích con trỏ nào
        Student tmp = mot; //một ơi cứ đi chơi đi tớ giữ đc địa chỉ cũ
        mot = hai; //một về đội của hai
        System.out.println("một về hai");
        mot.showProfile();
        
        System.out.println("Nhà cũ CHÙA MỘT CỘT");
        tmp.showProfile();
        int a = 10;//4 byte trong ram, đặt tên là a, ônoff 4 byte để ra đc số 10
        int b = a;//4 byte trong ram, tên b, copy onoff của a sang y chang
                   //lấy value của a, on-off của a đem sang b
                   //gan giá trị của a sang b
                   
                   //vùng nhớ new Mot... k còn con trỏ nào cả
                   //vẫn tọa độ, vẫn nằm đó, chỉ có điều k có biên nào trỏ đến nó,lưu toạn độ
                   //của nó, do đó gọi là vùng nhớ mô côi, k biến con trỏ nào quản lí
                   //y chang ca sĩ Lệ Rơi trôi nổi đâu đó
                   //JVM máy ảo Java(quản lí các app J khi chạy) phát hiện vùng mô côi trong HEAP
                   //giết vùng này, coi như vùng này giải tỏa, sẵn sàng cho ai đó new và xài
                   //tương đương con Dog chạy ngoài đường bị cty MTDT dọn dẹp
                   //trong JVM, có một obj đặc biệt, đoạn code đặc biệt, CPU luôn dùng đoạn code này
                   //để kiểm soát các vùng mồ côi, obj đc gọi là GARBAGE COLLECTOR
                   //ĐỊNH KỲ NÓ SẼ QUÉT VÙNG RAM (PHÚT)
                   //đôi khi ta mún gọi luôn cty dọn rác sạch ngay và luôn
                   System.gc(); //dọn ngay
                   //TRƯỚC KHI BỊ MẤT HẾT CON TRỎ, MÚN LẤY LẠI
                   //PHẢI GIỮ LẠI TỌA ĐỘ
    
    //TUYỆT CHIÊU CUỐI
    Student y =     new Student("SE10", "kUNGfU", 2000, 5.0);
    //Y LƯU TỌA độ      ta-ọ ra vùng ram, đồ value, giữ lại, trả về tọa độ vùng new
                        //7M là byte bắt đầu vùng new
    
    //y chấm tức là vùng 7M chấ, bản thân chữ new... cũng là 7M riiuf
    //hệ quả: éo cần biết y nữa\
    //new Student("SE10", "kUNGfU", 2000, 5.0).showProfile(); 
    //tao đang đứng tại new, tức òa tại ngay địa chỉ nhà m rời. mời vào./ chấm đi
    //~Con Dog sinh ra, khóc 1 tiếng, liệm đi, chết luôn. CT MTDT giết
    //ngôi sao vụt tắt
    
    }
    //tui muốn lưu trữ hồ sơ của 40 bạn SV đang nghe giảng
    //tui phát hiện 40 bạn cùng 1 cái khuôn(id,name,yob,gpa,addr,cha,mẹ,anh,chị)
    //ta cần 1 khuôn Student rồi tính sau
    public static void playWithObjectArray(){
    Student huynhTuanBang = new Student("SE140052", "Bằng Huỳnh Tuấn", 2000, 8.5);
    huynhTuanBang.showProfile();
    Student phuoc; //biến con trỏ
    phuoc = new Student("SE140022", "Phước", 2000, 8.0);
    //cho biến con trỏ, sau này mới chấm đc, đơn giản do con ng có nhiều value
    //gọi chung mà là phước, mún biết gì thì hỏi đi bằng cách .(chấm)  
    //tui mún lưu 40 bạn của lớp
    //ta caafb 40 con trỏ/tên tắt
    Student an, binh, cuong, dung, em, giang, huong, kien, sv1, sv2, sv3;
    //sau đó là thêm 40 nhát new Student(??? đổ info cho từng cháu)
    Student ds[] = new Student[5];
    //thực ra là ta có 40 biến Student, chính là
    //ds[0] ~ an; 
    
    //an = new Student("SE123456", "An Nguyễn", 2000, 9.0);  
    ds[0] = new Student("SE123456", "Binh Nguyễn", 2000, 9.0);
    ds[1] = new Student("SE123111", "Hoa Nguyễn", 2001, 8.0);
    ds[2] = new Student("SE123222", "Truc Nguyễn", 2002, 7.0);
    ds[3] = new Student("SE123333", "Cuong Nguyễn", 2003, 6.0);
    ds[4] = new Student("SE123444", "Thái Nguyễn", 2004, 5.0);
    
    //hỏi:
    //ds chấm hỏi sổ ra gì??? length
    System.out.println("Số sv đang có: " + ds.length); //phongf chỗ ngồi
                                                       //thực sự có 4 bạn
    System.out.println("The list of student");
        for (int i = 0; i < 5; i++) {
            ds[i].showProfile();
        }//2 TẦNG CHẤM HEN EM,... TAANGF LÀ LENGTH, TAANGF ĐI VÀO VÙNG NEW
        //cực kì nguy hiểm khi chơi mảng obj
        //biến nào trong mảng mà chưa gán vùng new mặc định
        //biến đó lưu con số 0, số 0 hiểu là trỏ vào dáy của ram, byte thứ0
        //byte thứ 0 k có code, gọi là byte NULL vì nó toàn là OFF OFF OFF
        //phần còn lại của mảng là con trỏ trỏ vào NULL, NULL POINTER, TAO TRỎ ĐẾN NULL
        //CON TRỎ NULL, CHẤM SHOWP() LÀM GÌ CÓ CODE,OFF K HÀ, APP BỊ GIẾT
        //khác primitive, cx toàn 0, sout(0) thì là value in bth
        //CHỐT HẠ KHI CHƠI VỚI MẢNG
        //LUÔN LUÔN CẦN THÊM 1 BIẾN PHỤ COUT GHI NHẬN ĐÃ GÁN ĐẾN ĐÂU R, ĐẺ FOR ĐẾN ĐÓ
        //MỖI LẦN GÁN THÊM VALUE VÀO PHẦN TỬ, COUNT++
        //TRỪ PHI MẢNG FULL RỒI, THÌ MỚI .LENGTH, FOR EACH, K THÌ RÁC, DEFAULT, NULL POITER
        System.out.println("The student list by(for each");
        for (Student x : ds) {
            x.showProfile();
        }//với mọi Student x là 1 con trỏ, vậy thì nó có thể bằng x = ds[0], x = ds[1]
        //vậy dsi[]. chấm gì thì x. chấm nấy
        //x trỏ vào cùng chỡ những ds[i] đang trỏ
        //xoay như chong chóng, lúc = đứa này, lúc bằng đứa mới đi hết cả mảng
        //for each với mỗi
        
        
        //Student x = ds[i]; nghĩa là gì
        //cấm vắng mặt vào thứ 7 này
        //hoàn chỉnh: nhập ds sv, in, có menu
    //mảng phải gán giá trị cho từng biến qua dấu = pri gán lun, obj new
    
    
    
    
    //1 biến pri tốn 1 vùng ram onoff value
    //obj tốn 2 vùng ram: 1 vùng con trỏ lưu địa chỉ bắt đầu của vùng new chà bá lửa object
    
    //mảng obj cần lắm luôn vì có quá nhiều sv,5000 lận
    }
    public static void sortPrimitiveArray(){
        int a[] = {2000, -500, 1, 1000, 10, 1, -200, 2000,30}; //new ngầm int [???], a là biến tú ông, a. ra số lượng các cháu
                      //a[0] chấm thì đi gặp phụ huynh
        //new int[10] và gán a[0] =2K; a[1] = -500
        System.out.println("The array before sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("");
        for (int x : a) {
            System.out.print(x + "\t");
        }
        System.out.println("\n The array after sorting ascending");
        //SELECT * FROM STUDENT ORDER BY GPA ASC DESC MỘT TRONG 2
        //CÂU LỆNH SORT TABLE SV, DS SV TRONG MÔN DB
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] < a[j]){ //a[i] đứng trước a[j] mà lại lớn hơn về value, ta đang cần tăng dần
                                 //sai chỗ r đổi value th
                    int t = a[i]; //ta a[i] lớn hơn phần còn lại, ta sai value, đổi th
                    a[i] = a[j];    //ta bé nhất r i++ qua cháu kế lặp lại
                    a[j] = t;
                }
            }
        }//ra ngoài này đã sort xong, in th
        for (int x : a) {
            System.out.print(x + "\t");
        }
    }
    public static void playWithPrimitiveArrayV2(){
    //có nhiều cách khai báo mảng trong J, nhưng k đc quyền [con số ở đây] khi khai báo
    //khai báo và gán value đã học ở dưới
    //khai báo và chưa gán value cho mảng, phải gán từ từ sau
    //ta xài toán tử new
    //tui mún lưu lượng mưa của năm sau
        double d[] = new double[365]; // d1,d2,d3,d4,d5.... kiêu lẻ
                                  //mỗi đứa cụ thể là d[0], d[1].. chứa value
                                  //giống cách dưới, khác là cách dưới có sẵn value cho từng biến
                                  //cách dưới tui gọi là new ngầm DOUBLE[5], IMPLICIT
                                  
                                  
//    double e[];
//    e = new double[365]; //lệnh khai báo d ở trên gộp so với cặp này, kq như nhau, 365 biến
                         //double
    
      d[0] = 1;
      d[364] = 2000;                     
      //d[364]. xổ cái đầu m,
      //d. trỏ đến vùng new quản lí 1 đám các cháu primitive, biến má mì nhen
    System.out.println("The rain volume");
    for (double x : d) {
        System.out.println(x +"\t");
    }// MẶC ĐỊNH MẢNG PRIMITIVE SỐ, CÁC GIÁ TRỊ ĐC ĐIỀN 0
     //BIẾN LẺ, THÌ PHẢI GÁN 1 GIÁ TRỊ NÀO ĐÓ MỚI ĐC XÀI NẾU K VỠ MẶT
}

public static void playWithPrimitiveArray(){
    //co 2 kieu dữ liệu: primitive, lấy xài luôn, không chấm
    //int a = 10
    //system.out.println(a)
    //a. a là 10, vì đơn trị mà, 10 xài luôn chấm gì?
    //primitive tồn 1 vùng ram lưu value ngay trong vùng đc cấp, xài luôn, khỏi chấm

    //Dog chiHu = new Dog(???);
    //chiHu chưa xài đc, vì là biến object, vì trỏ vùng new có nhiều thứ lắm luôn
//xài gì phải chấm chiHu. xài gì đây
//obj ta cần 2 thứ: biển trỏ vào vùng new
//obj tồn 2 vùng ram: vùng con trỏ, vùng new, xài chấm

//môn J có 10 cột điểm giá trị từ 1..10
//gs 1 bạn có như sau" 0 1 1 2 3 5 8 10 10 0
//ta đặt tên cho value(biến) c1 c2
//chính là vùng ram chứa value (đơn/phức phải tđi tiếp vùng new mới đủ)
double c1 = 0,c2 = 1, c3 = 2, c4 = 5, c5 = 3, c6, c7,c8, pe = 10, fn;
// có thể vừa khai báo vừa gán value, hoặc có thể khai báo mà chưa gán value
//gán sau khi khai báo vẫn đc
fn = 0;
System.out.println("fn " + fn); // get value nè
System.out.println("cột 1 " + c1 + "; cột 2: " + c2);

//tui cần lưu lượng mưa mỗi ngày của năm nay, xa hơn 1 thế kỉ
//double v1, v2, v3, v4,...,c1;
//100 nwma thì  x 100 = 36500 gõ s nổi khi chơi lẻ
//đó là mảng xuất hiện
//MẢNG CHỈ LÀ CÁCH KHAI BÁO NHIỀU BIẾN CÙNG LÚC CÙNG KIỂU "CÙNG TÊN", chơi lẻ thua 
//C khác java heng, có giống 1 phần []
//double d[265]: // oki C, J cấm [cấm con số khi khai báo]
//C J đoạn này giống nhau: vừa khai báo mảng vừa gán value thì ok
double              d[] = {1.0, 10.0, 10, 50,0, 100.0};


//cho tập số nguyên Z = {- vô cực, ... -3, -2, -1,0 ,1, 2, 3,...+vô cực};
//cho tập số tn     N = (0,1,2,3,4,...+vô cực);
//với mọi x thuộc N, vậy thì x là mang giá trị mấy
                        // x = 0, x = 1
                        
////thì ta dịch llaf: x là 1 biến int có thể mang 1 trong những giá trị của N
//tức là int x = 0, hoặc = 1
//khi xài với mọi tức là hàm ý xài 1 biến x mà có thể địa diện cho bất kì value
//nào trong tập hợp
//nếu ta xài với mọi ta in/sout(x) ra, thì tương đương in ra tất cả value của tập hợp


// mảng giống như tập hợp dãy số (nếu chỉ nhìn value)
//nhìn sâu hơn mỗi value cho 1 tên-biến, mảng là 1 dãy biến, dãy value

//vừa khai báo biến, ram có 5 biến này là d[0], d[1],d[2]
//tên cùng là d nhưng kèm con số phụ để biết thứ tự biến
//an[cao], an[thấp]
//cách này kích thước mảng, chính là số biến, số phần tử mảng, element đc tính =
//số value đang có, đếm số value biết có bao nhiêu biến
//in mảng thế nào
//in lượng mưa
System.out.println("The volume of rain");
    for (int i = 0; i < d.length; i++) {
        System.out.print(d[i] + "\t"); //printf("&.22f\t",d[i];    
    }
    //tên mảng chấm length sờ vào kích thước của mảng
    //mảng có 1 biến đặc điểm ngầm - instance variable là public int length
    //cho phép lấy trực tiếp kích thước mảng  
    
    System.out.println("\nThe array is printed using for each - với mọi");
    for (double x : d) {  //với mọi x thuộc tập hợp mảng d, thuộc các value của d
                          //double x = d[0]
                          //x = [1], cũng cóp thể x = d[2]ư
                          //vậy in d[i] cũng giống in x
        System.out.println(x + "\t");
        
    }
         //fore viết tắt của for each - với mọi, với mỗi, quét qua tất cả tập hợp
}
}