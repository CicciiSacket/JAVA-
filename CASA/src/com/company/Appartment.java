package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Appartment {

    public String IOprice(){
        String nomeFile = "out.txt";
        Scanner tastiera = new Scanner(System.in);
        SocietàImmobiliare casaUno = new SocietàImmobiliare();
        System.out.println(casaUno.getPrice());
        System.out.println("Vuoi memorizzare su un file di testo il prezzo?");
        String risposta = tastiera.nextLine();
        if (risposta.equals("si")) {
            PrintWriter outputStream = null;
            try {
                outputStream = new PrintWriter("out.txt");
            } catch (FileNotFoundException e) {
                System.out.println("file non trovato");
                System.exit(0);
            }
            outputStream.print(casaUno.getPrice());
            outputStream.close();
            System.out.println("testo inserito in file");
        } else System.exit(0);
        System.out.println("Vuoi leggere il file?");
        String risposta2 = tastiera.nextLine();
        if (risposta2.equals("si")) {
            Scanner inputstream = null;
            try {
                inputstream = new Scanner(new File("out.txt"));
            } catch (FileNotFoundException e) {
                System.out.println("file non trovato");
                System.exit(104);
            }
            System.out.println(casaUno.getPrice());
            inputstream.close();
        } else System.exit(0);
        return "Arrivederci!";
    }
}
