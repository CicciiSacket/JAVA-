package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        try {
            System.out.println("inserire il numero di ciabelle");
            int conteggioCiambelle = tastiera.nextInt();

            System.out.println("numero di bicchieri di latte");
            int bicchieriLatte = tastiera.nextInt();

            if (bicchieriLatte < 1)
                throw new Exception("niente latte mi dispiace");

            double Ciambelleperbicchiere = conteggioCiambelle / bicchieriLatte;
            System.out.println(conteggioCiambelle + "ciambelle");
            System.out.println(bicchieriLatte + "latte");


        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("va catta u latt");
        }
    }
}
