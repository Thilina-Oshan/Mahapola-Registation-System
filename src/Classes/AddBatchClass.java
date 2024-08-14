/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author vikum
 */
public class AddBatchClass {
    
    private int batch_id;
    private String batch_name;
    private Date startdate;
    private Date enddate;

    public AddBatchClass(int batch_id, String batch_name, Date startdate, Date enddate) {
        this.batch_id = batch_id;
        this.batch_name = batch_name;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    /**
     * @return the batch_id
     */
    public int getBatch_id() {
        return batch_id;
    }

    /**
     * @param batch_id the batch_id to set
     */
    public void setBatch_id(int batch_id) {
        this.batch_id = batch_id;
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
     * @return the startdate
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * @param startdate the startdate to set
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * @return the enddate
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * @param enddate the enddate to set
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    
    
}
