/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import watch.watchStore;
import shoes.shoesStore;

/**
 *
 * @author pc
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        watchStore dongHoXin = new watchStore ("Atlantic", "Đồng hồ nam", "dây da", "sapphire", "thép không gỉ", "quartz", "5 ATM", "42 mm", "10 năm", "Thụy Sỹ", "Trực tiếp khi nhận hàng", "AT-68750.41.25R", "20.862.000 vnđ");
        shoesStore giayXin = new shoesStore ("SP 01056", "1 cm", "Xanh lá-Đen-Nâu");
        dongHoXin.saleWatch();
        giayXin.showShoes();
    }
}
