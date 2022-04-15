package com.example.delinev7;

public class Courseitems {
    private String coursename;
    private String idtext;



    public Courseitems(String coursename, String idtext){

        this.coursename=coursename;
        this.idtext=idtext;
        //this.coursedesc=coursedesc;
    }
    public Courseitems(){

    }
    public String getCoursename() {
        return coursename;
    }
    public String getCourseID() {
        return idtext;
    }
    /*public String getCoursedesc() {
        return coursedesc;
    }*/

    public void setCoursename(String coursename) {
        this.coursename = coursename;

    }
    public void setCourseID(String idtext) {
        this.idtext =idtext;
    }
    /*public void setCoursedesc(String coursedesc) {
        this.coursedesc = coursedesc;
    }*/
}
