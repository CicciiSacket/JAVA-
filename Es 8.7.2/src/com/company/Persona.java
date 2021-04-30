package com.company;
import java.util.Scanner;
public class Persona {
    Scanner tastiera = new Scanner(System.in);
    String name;
    int età;

    public Persona(String name, int età){
        this.name=name;
        this.età=età;
    }
    public String setName(){
        return name;
    }
    public int setEtà(){
        return età;
    }




}
