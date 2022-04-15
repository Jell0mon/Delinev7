package com.example.delinev7;

public class Asstitems {
    private String asstname;
    private String datetext;
    public Asstitems(String asstname, String datetext){

        this.asstname=asstname;
        this.datetext=datetext;
    }
    public Asstitems(){

    }
    public String getAsstname() {
        return asstname;
    }
    public String getAsstdate() {
        return datetext;
    }

    public void setAsstname(String asstname) {
        this.asstname = asstname;

    }
    public void setAsstdate(String datetext) {
        this.datetext = datetext;

    }
}
