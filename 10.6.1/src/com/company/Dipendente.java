package com.company;

public class Dipendente extends Persona{
    public int matricola;
    public double stipendio;
    public String Dip;

//    public String getEtà() {
//        return super.getEtà();
//    }
//    public String getName(){
//        return super.getName();
//    }
//
//    public void setMatricola(int matricola) {
//        this.matricola = matricola;
//    }
//
//    public int getMatricola() {
//        return matricola;
//    }
//
//    public void setStipendio(double stipendio) {
//        this.stipendio = stipendio;
//    }
//
//    public double getStipendio() {
//        return stipendio;
//    }
    public void setDipe(String name, String età, int matricola, double stipendio){
       this.name = name;
       this.matricola = matricola;
       this.età = età;
       this.stipendio = stipendio;
       this.Dip = name + matricola+ età+ stipendio;
    }
    public String getDipe(){
        return Dip;
    }

}

