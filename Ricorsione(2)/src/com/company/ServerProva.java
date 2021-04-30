package com.company;
import java.util.Scanner;
import java.io.*;
import java.net.*;

public class ServerProva {  //socket server

    public static void main(String[] args) {
        String s;
        Scanner inputStream = null;
        PrintWriter outuputStream = null;
        ServerSocket serverSocket = null;
        try {
            //attende connesione sulla porta 6789
            System.out.println("Attendo rete");
            serverSocket = new ServerSocket(6789);
            Socket socket = serverSocket.accept();
            //connessione stabilita, imposta gli stream
            inputStream = new Scanner(new InputStreamReader(socket.getInputStream()));
            outuputStream = new PrintWriter(new DataOutputStream(socket.getOutputStream()));

            //legge una riga dal client
            s = inputStream.nextLine();

            //visualizza il testo sul client
            outuputStream.println("bene partiamo dalle basi");
            outuputStream.println(s);
            outuputStream.flush();
            System.out.println("connection lost");
            inputStream.close();
            outuputStream.close();
        } catch (Exception e) {
            //se si verifica visualizza
            System.out.println("Error" + e);
        }
    }
}
