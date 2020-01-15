/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch;

/**
 *
 * @author pc
 */
public class watchStore {
    private  String HangSanXuat;
    private  String LoaiDongHo;
    private  String ChatLieuDay;
    private  String ChatLieuMat;
    private  String ChatLieuVo;
    private  String NangLuongSuDung;
    private  String DoChiuNuoc;
    private  String DuongKinh;
    private  String BaoHanh;
    private  String ThuongHieu;
    private  String ThanhToan;
    private  String MaSanPham;
    private  String gia;
    
    public watchStore(String iHangSanXuat,String iLoaiDongHo,String iChatLieuDay, String iChatLieuMat,String iChatLieuVo, String iNangLuongSuDung, String iDoChiuNuoc, String iDuongKinh, String iBaoHanh, String iThuongHieu, String iThanhToan, String iMaSanPham, String igia){
            HangSanXuat = iHangSanXuat;
            LoaiDongHo = iLoaiDongHo;
            ChatLieuDay = iChatLieuDay;
            ChatLieuMat = iChatLieuMat;
            ChatLieuVo  = iChatLieuVo;
            NangLuongSuDung = iNangLuongSuDung;
            DoChiuNuoc = iDoChiuNuoc;
            DuongKinh = iDuongKinh;
            BaoHanh = iBaoHanh;
            ThuongHieu = iThuongHieu;
            ThanhToan = iThanhToan;
            MaSanPham = iMaSanPham;
            gia = igia;
    }
    public void saleWatch (){
        System.out.println("Hãng sản xuất: " + HangSanXuat);
        System.out.println("Loại đồng hồ: " + LoaiDongHo);
        System.out.println("Chất liệu dây: " + ChatLieuDay);
        System.out.println("Chất liệu mặt: " + ChatLieuMat);
        System.out.println("Chất liệu vỏ: " + ChatLieuVo);
        System.out.println("Năng lượng sử dụng: " + NangLuongSuDung);
        System.out.println("Độ chịu nước: " + DoChiuNuoc);
        System.out.println("Đường kính: " + DuongKinh);
        System.out.println("Bảo hành: " + BaoHanh);
        System.out.println("Thương hiệu: " + ThuongHieu);
        System.out.println("Thanh toán: " + ThanhToan);
        System.out.println("Mã sản phẩm: " + MaSanPham);
        System.out.println("Gía:  " + gia);
    }
}
