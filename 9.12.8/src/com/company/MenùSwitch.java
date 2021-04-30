package com.company;

import java.util.Scanner;

public class MenùSwitch extends VotiERegistratore {
    Scanner tastiera = new Scanner(System.in);

    public String Ritorno() {
        int menù = tastiera.nextInt();
            switch (menù) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println(Candidati());
                    System.out.println(views());
                    Reload();
                    break;
                case 2:
                    System.out.println("Nome del candidato scelto");
                    votazione();
                    System.out.println(views());
                    Reload();
                    break;
                case 3:
                    System.out.println(count());
                    System.out.println(views());
                    Reload();
                    break;
            }
        return "";
    }

    public String views(){
        return "\n\t--UPLOAD--\t \n 1 per visualizzare i candidati; \n 2 per effettuare una votazione; \n 3 per visualizzare i voti di seggio; \n 0 per uscire";
    }
    public String Reload(){
        return Ritorno();
    }

}

