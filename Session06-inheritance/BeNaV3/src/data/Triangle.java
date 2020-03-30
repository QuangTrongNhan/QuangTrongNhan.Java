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
public class Triangle{
    private int A;
    private int B;
    private int C;
  
//    public Triangle(String owner, String color){
//        super(owner, color);
    public Triangle(int A, int B, int C){
        this.A = A;
        this.B = B;
        this.C = C;
       
    }

//    }
    public int getPerimeter() {
        return A + B + C;
    }
    public double getAreaTriangle(){
       double p = (A + B + C)/2;
       double S = Math.sqrt(p*(p - A)*(p - B)*(p - C));
        return S;
    }
//    @Override
//    public double getArea() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public void paint() {
        System.out.printf("|TRIANGLE   %d|%d|%d|%4.1f|%4.1f\n", A, B, C, getAreaTriangle());
    }
}
