package com.company;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        String start = "Inserire superficie appartamento e distanza dal mare:";
        System.out.println(start);
        Appartment uno = new Appartment();
        System.out.println(uno.IOprice());
    }
}
