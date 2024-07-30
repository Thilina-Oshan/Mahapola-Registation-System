/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Oshan Demel
 */
public class AddAplicantClass {

    private int stu_id;
    private String stu_nic;
    private String stu_name;
    private int phone_num;
    private String address;

    public AddAplicantClass(int stu_id, String stu_nic, String stu_name, int phone_num, String address) {
        this.stu_id = stu_id;
        this.stu_nic = stu_nic;
        this.stu_name = stu_name;
        this.phone_num = phone_num;
        this.address = address;
    }

    /**
     * @return the stu_id
     */
    public int getStu_id() {
        return stu_id;
    }

    /**
     * @param stu_id the stu_id to set
     */
    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    /**
     * @return the stu_nic
     */
    public String getStu_nic() {
        return stu_nic;
    }

    /**
     * @param stu_nic the stu_nic to set
     */
    public void setStu_nic(String stu_nic) {
        this.stu_nic = stu_nic;
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
     * @return the phone_num
     */
    public int getPhone_num() {
        return phone_num;
    }

    /**
     * @param phone_num the phone_num to set
     */
    public void setPhone_num(int phone_num) {
        this.phone_num = phone_num;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
