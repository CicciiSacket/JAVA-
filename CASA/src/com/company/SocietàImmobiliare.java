package com.company;
import java.util.Scanner;

public class SocietàImmobiliare {
    Scanner tastiera = new Scanner(System.in);
    private double superficieAppartamento;
    private double distanzaDalMare;

    public SocietàImmobiliare() {
        superficieAppartamento = tastiera.nextDouble();
        distanzaDalMare = tastiera.nextDouble();
    }

    public String getPrice() {
        if (distanzaDalMare < 0 | superficieAppartamento < 1) {
            System.exit(104);
        } else if (distanzaDalMare < 200) {
            return "Il prezzo dell'appartamento è\t" + superficieAppartamento * 2000;
        } else if (distanzaDalMare <= 1000) {
            return "Il prezzo dell'appartamento è\t" + superficieAppartamento * 1500;
        }
        return "Il prezzo dell'appartamento è\t" + superficieAppartamento * 1000;
    }
}

