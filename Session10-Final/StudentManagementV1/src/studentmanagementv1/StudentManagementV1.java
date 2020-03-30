/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementv1;

import data.Cabinet;

/**
 *
 * @author pc
 */
public class StudentManagementV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //rãnh làm menu
       Cabinet tuSE = new Cabinet("SE Major");
       tuSE.addNewStudent();
       tuSE.addNewStudent();
       tuSE.addNewStudent();
       
       tuSE.showAll();
    }
    
}
