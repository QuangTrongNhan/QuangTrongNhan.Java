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
public class Square extends Rectangle{
    //cố tình cho thêm một cái khác, chả sao, biến dị mà
    //y chang như Con Disk có thêm bán kính so với Cha Shape
    //y chang con Rectangle có thêm 2 cạnh, TG có thêm 3 cạnh so với Cha Shape
    private String smile;

    public Square(String smile, String color, double edge) {
        super(color, edge, edge); //1st position
        this.smile = smile;
    }//HV chính là HCN 2 cạnh kề nhau = nhau
    
    //

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }
    
    
    @Override//trùng tên giống Cha
    public void paint() {
         System.out.printf("|Square      |%-10s|%4.1f|%4.1f|%6.2f|%6.2f|\n", color, width ,length, getArea(), getPerimeter());
    }
    //tính S() tính P() k cần làm, ăn theo Cha
    //hàm paint() k cần làm nhưng mình làm để in chữ SQUARE, Override Cha
    
    //Con đc quyền làm riêng mà, ai cấm
    //Khuôn có toàn quyền thêm hàm, riêng Con thì Cha có thấy k, cái gì của Cha luôn của Con
    public void drawTextTile(){
        //vẽ thêm nét tô màu kiểu dệt vài caro
        System.out.println("Smile: " + smile);
        System.out.println("-|=|-|=|-|=|-|=|-");
    }
}
