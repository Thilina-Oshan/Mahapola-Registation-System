/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Oshan Demel
 */
public class AddCourseClass {

    private int course_id;
    private String course_name;
    private String course_duration;

    public AddCourseClass(int course_id, String course_name, String course_duration) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_duration = course_duration;
    }

    /**
     * @return the course_id
     */
    public int getCourse_id() {
        return course_id;
    }

    /**
     * @param course_id the course_id to set
     */
    public void setCourse_id(int course_id) {
        this.course_id = course_id;
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
     * @return the course_duration
     */
    public String getCourse_duration() {
        return course_duration;
    }

    /**
     * @param course_duration the course_duration to set
     */
    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

}
