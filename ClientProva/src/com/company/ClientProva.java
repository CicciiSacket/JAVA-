package com.company;
import java.util.Scanner;
import java.io.*;
import java.net.*;

public class ClientProva { //socket client

    public static void main(String[] args) {
        String s;
        Scanner inputStream = null;
        PrintWriter outuputStream = null;
        try{
            //connessione al sever sulla stessa macchina nella pota 6789
            Socket clientSocket = new Socket("localhost",6789);
            //imposta gli stream per inviare o ricevere dati
            inputStream = new Scanner( new InputStreamReader(clientSocket.getInputStream()));
            outuputStream = new PrintWriter(new DataOutputStream(clientSocket.getOutputStream()));

            //invia stringa al server
            outuputStream.println("porcoddio");
            outuputStream.flush();//invia i dati allo stream

            //legge ciò che proviene dallo stream e lo stampa a schermo
            while(inputStream.hasNextLine()){
                s = inputStream.nextLine();
                System.out.println(s);
            }
            inputStream.close();
            outuputStream.close();
        }catch (Exception e) {
            //se si verifica visualizza
            System.out.println("Error" + e);
        }


    }
}
