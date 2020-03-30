
package petcarev4;

import data.Dog;
public class PetCareV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dog chiHu = new Dog("CHI HU HU", 2020, 0.5 , " white ");
       Dog ngaoDa = new Dog("NGAO DA", 2019, 50.0, "red");
       Dog vangOi = new Dog("VÀNG ƠI", 1995, 10.0, " vàng ");
        System.out.println("");
        ngaoDa.showSoaiCa();
        System.out.println("toString() xài thử " + ngaoDa.toString());
        String msg = chiHu.toString();
        System.out.println("toString() of CHH" + msg);
        
        // điều vi diệu tiếp theo: GỌI THẦM TÊN EM
        System.out.println(" gọi thầm tên em: " + chiHu);
        // mặc định sout() biến object, hàm toString()  sẽ được gọi
        System.out.println("gọi thầm tên em: " + chiHu.toString());
        
        // chỉ áp dụng toString(), các hành động khác phải chấm gọi em
        // điều gì xảy ra nếu Khuôn không thèm làm toString()
        // Java mặc định sẽ băm/hash/MD5/SHA: Van An: 1 + 15 + 32 + 15
        // Java băm object thành một con số 
    }
    
}

