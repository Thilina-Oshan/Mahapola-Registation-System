/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AddPaymentClass {
    
    private int payment_id;
    private int mc_num;
    private String course_name;
    private String batch_name;
    private float amount;
    private float coustomer_payment;
    private float alanse;

    public AddPaymentClass(int payment_id, int mc_num, String course_name, String batch_name, float amount, float coustomer_payment, float alanse) {
        this.payment_id = payment_id;
        this.mc_num = mc_num;
        this.course_name = course_name;
        this.batch_name = batch_name;
        this.amount = amount;
        this.coustomer_payment = coustomer_payment;
        this.alanse = alanse;
    }

    /**
     * @return the payment_id
     */
    public int getPayment_id() {
        return payment_id;
    }

    /**
     * @param payment_id the payment_id to set
     */
    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    /**
     * @return the mc_num
     */
    public int getMc_num() {
        return mc_num;
    }

    
    public void setMc_num(int mc_num) {
        this.mc_num = mc_num;
    }

    /**
     * @return the course_name
     */
    public String getCourse_name() {
        return course_name;
    }

    /**
     * @param course_name the course_name to set
     */
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    /**
     * @return the batch_name
     */
    public String getBatch_name() {
        return batch_name;
    }

    /**
     * @param batch_name the batch_name to set
     */
    public void setBatch_name(String batch_name) {
        this.batch_name = batch_name;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the coustomer_payment
     */
    public float getCoustomer_payment() {
        return coustomer_payment;
    }

    /**
     * @param coustomer_payment the coustomer_payment to set
     */
    public void setCoustomer_payment(float coustomer_payment) {
        this.coustomer_payment = coustomer_payment;
    }

    /**
     * @return the alanse
     */
    public float getAlanse() {
        return alanse;
    }

    /**
     * @param alanse the alanse to set
     */
    public void setAlanse(float alanse) {
        this.alanse = alanse;
    }
    
    
    
}
