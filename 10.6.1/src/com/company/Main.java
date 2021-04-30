package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		Dipendente uno = new Dipendente();
		uno.setDipe("philip","32",12322,3242423.23);
		Dottore one = new Dottore();
		one.setName("pippo");
		one.setEtà("48");
		one.setStipendio(1640.99);
		System.out.println(one.getName());

		ArrayList<String> lavoratori = new ArrayList<>(10);
		lavoratori.add (uno.getDipe());
		System.out.println(lavoratori);
	}
}
