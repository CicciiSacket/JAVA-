package com.company; // uno per vedere i candidati, 2 per effettuare una votazione, 3 per vedere il conto dei voti, 4 per azzerrare il count e inserire nuovi dati, 5 exit;//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        MenùSwitch uno = new MenùSwitch();
        System.out.println(uno.views());
        System.out.println(uno.Ritorno());

    }
}
