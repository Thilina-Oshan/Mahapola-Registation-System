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

    private int reg_id;
    private int mc_num;
    private String stu_num;
    private String stu_name;
    private String stu_phoneNum;
    private String stu_address;
    private String batch_name;
    private String course_name;
    private String status;
    private Date reg_date;

    public AddRegistationClass(int reg_id, int mc_num, String stu_num, String stu_name, String stu_phoneNum, String stu_address, String batch_name, String course_name, String status, Date reg_date) {
        this.reg_id = reg_id;
        this.mc_num = mc_num;
        this.stu_num = stu_num;
        this.stu_name = stu_name;
        this.stu_phoneNum = stu_phoneNum;
        this.stu_address = stu_address;
        this.batch_name = batch_name;
        this.course_name = course_name;
        this.status = status;
        this.reg_date = reg_date;
    }

    /**
     * @return the reg_id
     */
    public int getReg_id() {
        return reg_id;
    }

    /**
     * @param reg_id the reg_id to set
     */
    public void setReg_id(int reg_id) {
        this.reg_id = reg_id;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the reg_date
     */
    public Date getReg_date() {
        return reg_date;
    }

    /**
     * @param reg_date the reg_date to set
     */
    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

  

   
}
   