package com.company;

import java.util.Scanner;

public class VotiERegistratore extends Elezioni{
    Scanner tastiera = new Scanner(System.in);


    public String Candidati() {
        setNomeCandidatoPresidente1("mario");
        setNomeCandidatoPresidente2("lucio");
        return "I candidati presidente sono\t" + getNomeCandidatoPresidente1() + "\te\t" + getNomeCandidatoPresidente2()+ "; mentre i candidati alla vicepresidenza sono\t" + nomeCandidatoVicePresidente1 + "\te\t" + nomeCandidatoVicePresidente2;
    }//torna i nomi di tutti i candidati



    public String votazione() {
        String voto = tastiera.nextLine();
        if (voto.equals(getNomeCandidatoPresidente1()))
            votiCandidatoPresidente1++;
        else if (voto.equals(getNomeCandidatoPresidente2())) {
            votiCandidatoPresidente2++;
        }
        return "";
    }//si prende la votazione

    public String count() {
        return votiCandidatoPresidente1 +"\tper candidato uno\t"+ votiCandidatoPresidente2+"\t per candidato due";
    }//counter
}
