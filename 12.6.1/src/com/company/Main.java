package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        String nome = null;
        double peso;
        int età;

        Animale Aron = new Animale("Aron",7.4,03);
        Animale fuffi = new Animale("Fuffi",10,1);
        Animale bobby = new Animale("Bobby", 40,3);
        Animale Ally = new Animale("Ally", 2,01);

        ArrayList<Animale> Animalist = new ArrayList<Animale>();
        Animalist.add(Aron);
        Animalist.add(fuffi);
        Animalist.add(bobby);
        Animalist.add(Ally);
        System.out.println(Animalist.size());
        System.out.println(Animalist.);

    }
}