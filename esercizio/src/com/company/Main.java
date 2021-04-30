package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("converti la temperatura da celsius a fahreneit e vicevera!");
        System.out.println("celsius:");
        int celsius = tastiera.nextInt();
        System.out.println("fahreneit:");
        int farheneit = tastiera.nextInt();

        int gradiC = (5*(farheneit-32)/9);
        int gradiF = ((9*(celsius)/5)+32);
        System.out.println(gradiC + "fareneit--> celsius");
        System.out.println(gradiF + "celsius--> fareneminchia");
    }
}