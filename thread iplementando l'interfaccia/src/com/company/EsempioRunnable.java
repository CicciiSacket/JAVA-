package com.company;

public class EsempioRunnable implements Runnable{

    public void run(){
        for (int i=1; i <= 10; i++)
        System.out.println(i + "" + i*i);
    }
}

