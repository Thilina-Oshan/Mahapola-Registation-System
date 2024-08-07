/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Oshan Demel
 */
public class ActiveStatus {

    public static boolean isActive(String status) {
        if (status == null) {
            return false;
        }
        status = status.trim().toLowerCase();
        return status.equals("true") || status.equals("yes") || status.equals("1");
    }

    public static boolean isInactive(String status) {
        if (status == null) {
            return false;
        }
        status = status.trim().toLowerCase();
        return status.equals("false") || status.equals("no") || status.equals("0");
    }

}
