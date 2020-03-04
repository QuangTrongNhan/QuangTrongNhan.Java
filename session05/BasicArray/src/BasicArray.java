
import data.Student;

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
    // sortPrimitiveArray();
    playWithObjectArray();
    }
    //tui muốn lưu trữ hồ sơ của 40 bạn SV đang nghe giảng
    //tui phát hiện 40 bạn cùng 1 cái khuôn(id,name,yob,gpa,addr,cha,mẹ,anh,chị)
    //ta cần 1 khuôn Student rồi tính sau
    public static void playWithObjectArray(){
    Student huynhTuanBang = new Student("SE140052", "Bằng Huỳnh Tuấn", 2000, 8.5);
    huynhTuanBang.showProfile();
    Student phuoc = new Student("SE140022", "Phước", 2000, 8.0);
    phuoc.showProfile();
    
    
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