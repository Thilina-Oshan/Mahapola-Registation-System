/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

enum Level {
    Pass,
    Repeate

}

public class AddExamClass {

    private int ExamId;
    private String NicExam;
    private int Mc_num;
    private Date ExameDate;
    private String CourseNameE;
    private String BatchNameE;
    private String ExameResult;

    public AddExamClass(int ExamId, String NicExam, int Mc_num, Date ExameDate, String CourseNameE, String BatchNameE, String ExameResult) {
        this.ExamId = ExamId;
        this.NicExam = NicExam;
        this.Mc_num = Mc_num;
        this.ExameDate = ExameDate;
        this.CourseNameE = CourseNameE;
        this.BatchNameE = BatchNameE;
        this.ExameResult = ExameResult;
    }

    /**
     * @return the ExamId
     */
    public int getExamId() {
        return ExamId;
    }

    /**
     * @param ExamId the ExamId to set
     */
    public void setExamId(int ExamId) {
        this.ExamId = ExamId;
    }

    /**
     * @return the NicExam
     */
    public String getNicExam() {
        return NicExam;
    }

    /**
     * @param NicExam the NicExam to set
     */
    public void setNicExam(String NicExam) {
        this.NicExam = NicExam;
    }

    /**
     * @return the Mc_num
     */
    public int getMc_num() {
        return Mc_num;
    }

    /**
     * @param Mc_num the Mc_num to set
     */
    public void setMc_num(int Mc_num) {
        this.Mc_num = Mc_num;
    }

    /**
     * @return the ExameDate
     */
    public Date getExameDate() {
        return ExameDate;
    }

    /**
     * @param ExameDate the ExameDate to set
     */
    public void setExameDate(Date ExameDate) {
        this.ExameDate = ExameDate;
    }

    /**
     * @return the CourseNameE
     */
    public String getCourseNameE() {
        return CourseNameE;
    }

    /**
     * @param CourseNameE the CourseNameE to set
     */
    public void setCourseNameE(String CourseNameE) {
        this.CourseNameE = CourseNameE;
    }

    /**
     * @return the BatchNameE
     */
    public String getBatchNameE() {
        return BatchNameE;
    }

    /**
     * @param BatchNameE the BatchNameE to set
     */
    public void setBatchNameE(String BatchNameE) {
        this.BatchNameE = BatchNameE;
    }

    /**
     * @return the ExameResult
     */
    public String getExameResult() {
        return ExameResult;
    }

    /**
     * @param ExameResult the ExameResult to set
     */
    public void setExameResult(String ExameResult) {
        this.ExameResult = ExameResult;
    }

   
 
}
