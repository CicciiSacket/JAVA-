package com.company;

public class Email extends Documento {
    String mittente;
    String destinatario;
    String title;

    public void setMittente(String mittente) {
        this.mittente=mittente;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return mittente + "\n" + destinatario + "\n" + title + "\n" + super.testo;
    }
}
