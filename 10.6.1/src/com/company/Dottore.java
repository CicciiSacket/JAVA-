package com.company;

public class Dottore extends Persona {
    public double stipendio;


    public String getEtà() {
        return super.getEtà();
    }
    public String getName(){
        return super.getName();
    }
    public void setStipendio(double stipendio){
        this.stipendio = stipendio;
    }
    public double getStipendio(){
        return stipendio;
    }
}
