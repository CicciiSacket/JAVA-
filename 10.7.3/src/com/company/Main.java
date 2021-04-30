package com.company;


public class Main {

    public static void main(String[] args) {
        Email provamail = new Email();
        provamail.setTesto("Questo è il testo della mail che dovrebbe essere inviata");
        provamail.setMittente("mario");
        provamail.setDestinatario("pippo");
        provamail.setTitle("title");
        System.out.println(provamail.toString());
    }
}
