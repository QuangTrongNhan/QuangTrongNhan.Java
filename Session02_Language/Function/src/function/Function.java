/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author pc
 */
public class Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // printIntList ();
       int y = f(5);
       System.out.println("f(5): " + y);
       System.out.println("f(6)" + f(6)); 
         
    }
    public static int f(int x){
        int tmp = x * x;
        return tmp;
    }
    public static void printIntList (){
        //tui muốn in ds số nguyên từ 1..100
        //system.out.println("1 2 3 4 5 6...");
        System.out.println("the list of 100 first ");
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
    }
}
// BTVN: làm trên máy xong r ghi ra giấy nộp t3

//viết hàm tính n!
public static long computeFactorial (int n){

}
//viết hàm kiểm tra 1 số có là nguyên tố hay kh
public static int isPrime (int n){
//trả về 1: là số nguyên tố, trả về 0; k là nguyên tố
//xài căn bậc 2
//Math.sqrt(???) ~C sqrt(???)
}
public static boolean isPrimeV2(int n){
return true;
return false;
}
