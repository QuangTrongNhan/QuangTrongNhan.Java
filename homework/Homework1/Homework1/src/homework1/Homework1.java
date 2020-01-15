
package homework1;

/**
 *
 * @author pc
 */
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long y = computeFactorial(7);
        System.out.println(" giai thua = " + y); // tinh giai thua
        int n = 5;
        if (isPrimeV2(n)){
            System.out.println(n + " la so nguyen to");      // tim so nguyen to return true or false
        
        }else{
            System.out.println(n + " khong phai la so nguyen to");
        }
        int m = 9;
        if (isPrime(m) == 1){
            System.out.println(m + " la so nguyen to"); // tim so nguyen to return 1 or 0
        }else{
            System.out.println(m + " khong phai la so nguyen to");
        }
    }
    public static long computeFactorial (int n){ 
    long factorial = 1;
    for (int i = 1; i <= n; i++){ 
       factorial *= i;
    }
    return factorial;
 }
     public static boolean isPrimeV2(int n) {
       if (n <= 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
   }
    public static int isPrime(int m){
         if (m <= 1) {
             //System.out.println(m + "khong phai la so nguyen to");
           return 0;
       }
       for (int i = 2; i <= Math.sqrt(m); i++) {
           if (m % i == 0) {
             //System.out.println(m + "khong phai la so nguyen to");
           return 0;
           }
       }
       return 1;
   }
}
