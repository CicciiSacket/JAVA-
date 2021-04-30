package com.company;

public class Cont {
    public String name;
    public String surname;
    public String phoneNumber;
    public enum Type {work,love,friends};
    public String contact;

    public void setcontact(String name, String surname,String phoneNumber, Type Type) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.contact = name+"\t"+surname+"\t"+phoneNumber+"\t"+Type;
    }

    public String getContact(){
        return contact;
    }
}

