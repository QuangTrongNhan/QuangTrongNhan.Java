/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoes;

/**
 *
 * @author pc
 */
public class shoesStore {
    private String MaSanPham;
    private String DoCao;
    private String MauSac;

    public shoesStore (String iMaSanPham, String iDoCao, String iMauSac){
        MaSanPham = iMaSanPham;
        DoCao = iDoCao;
        MauSac = iMauSac;
    }
    
    public void showShoes (){
        System.out.println("Mã sản phẩm: " + MaSanPham);
        System.out.println("Độ cao: " + DoCao);
        System.out.println("Màu sắc : " + MauSac);
    } 
}
