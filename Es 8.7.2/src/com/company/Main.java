package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire informazioni per oggetto uno");
        String name;
        int età;

        Persona uno = new Persona("albert", 65);
        System.out.println(uno.setName());
        System.out.println(uno.setEtà());

        Persona due = new Persona("albert",65);
        System.out.println(due.setName());
        System.out.println(due.setEtà());

        if (uno.equals(due)){
            System.out.println("sono uguali");
        }
        else
            System.out.println("diversi");
        if (uno.setName().equals(due.setName())){
            System.out.println("hanno lo stesso nome");
        }
        else
            System.out.println("si chiamano in maniera diversa");
        if (uno.setEtà() < due.setEtà()){
            System.out.println("uno è più piccolo di due");
        }
        else
            System.out.println("uno è piu grande di due");
    }
}
