package com.company;

public class Main {

    public static void main(String[] args) {
	EsempioRunnable e = new EsempioRunnable();
	Thread t = new Thread(e);
	t.start();
    }
}
