package com.company;

import java.util.Scanner;

public class NumeriSottoLaMedia {
    int[] temperatura = new int[10];
    int temperature;

    public NumeriSottoLaMedia(){
        int temperatura = this.temperatura[10];
        temperature = this.temperature;
    }

    public int getTemperatura() {
        Scanner tastiera = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            int temperature = tastiera.nextInt();
        }
        return temperatura[temperature];
    }
}