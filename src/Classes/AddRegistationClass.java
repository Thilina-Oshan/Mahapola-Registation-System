/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author Oshan Demel
 */
public class AddRegistationClass {

    private int mc_num;
    private String stu_num;
    private String stu_name;
    private String stu_phoneNum;
    private String stu_address;
    private String batch_name;
    private String course_name;
    private Date registation_date;

    public AddRegistationClass(int mc_num, String stu_num, String stu_name, String stu_phoneNum, String stu_address, String batch_name, String course_name, Date registation_date) {
        this.mc_num = mc_num;
        this.stu_num = stu_num;
        this.stu_name = stu_name;
        this.stu_phoneNum = stu_phoneNum;
        this.stu_address = stu_address;
        this.batch_name = batch_name;
        this.course_name = course_name;
        this.registation_date = registation_date;
    }

    /**
     * @return the mc_num
     */
    public int getMc_num() {
        return mc_num;
    }

    /**
     * @param mc_num the mc_num to set
     */
    public void setMc_num(int mc_num) {
        this.mc_num = mc_num;
    }

    /**
     * @return the stu_num
     */
    public String getStu_num() {
        return stu_num;
    }

    /**
     * @param stu_num the stu_num to set
     */
    public void setStu_num(String stu_num) {
        this.stu_num = stu_num;
    }

    /**
     * @return the stu_name
     */
    public String getStu_name() {
        return stu_name;
    }

    /**
     * @param stu_name the stu_name to set
     */
    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    /**
     * @return the stu_phoneNum
     */
    public String getStu_phoneNum() {
        return stu_phoneNum;
    }

    /**
     * @param stu_phoneNum the stu_phoneNum to set
     */
    public void setStu_phoneNum(String stu_phoneNum) {
        this.stu_phoneNum = stu_phoneNum;
    }

    /**
     * @return the stu_address
     */
    public String getStu_address() {
        return stu_address;
    }

    /**
     * @param stu_address the stu_address to set
     */
    public void setStu_address(String stu_address) {
        this.stu_address = stu_address;
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
     * @return the registation_date
     */
    public Date getRegistation_date() {
        return registation_date;
    }

    /**
     * @param registation_date the registation_date to set
     */
    public void setRegistation_date(Date registation_date) {
        this.registation_date = registation_date;
    }

}
