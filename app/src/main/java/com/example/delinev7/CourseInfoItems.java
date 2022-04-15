package com.example.delinev7;

public class CourseInfoItems {
    private String coursename;
    private String idtext;
    private String coursedesc;


    public CourseInfoItems(String coursename, String idtext, String coursedesc){

        this.coursename=coursename;
        this.idtext=idtext;
        this.coursedesc=coursedesc;
    }
    public CourseInfoItems(){

    }
    public String getCoursename() {
        return coursename;
    }
    public String getCourseID() {
        return idtext;
    }
    public String getCoursedesc() {
        return coursedesc;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;

    }
    public void setCourseID(String idtext) {
        this.idtext =idtext;
    }
    public void setCoursedesc(String coursedesc) {
        this.coursedesc = coursedesc;
    }
}
