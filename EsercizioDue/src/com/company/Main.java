package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("inserire primo numero");
        System.out.println("inserire secondo numero");
        Scanner tastiera = new Scanner(System.in);
        double uno = tastiera.nextDouble();
        double due = tastiera.nextDouble();

        Driver one = new Driver( uno, due);
        if(uno>due){
            System.out.println(one.GetOne());
        }
        else {
            System.out.println(one.GetTwo());
        }
    }
}
