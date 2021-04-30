package com.company;

import java.util.ArrayList;

public class Setting extends Cont {

    public ArrayList<String> Setting(){

        ArrayList<String> rubrica = new ArrayList<>();
    Cont uno = new Cont();
    uno.setcontact("marzi","mia","3270341306", Cont.Type.love);
    rubrica.add(uno.getContact());
    Cont due = new Cont();
    due.setcontact("marzi","mia","3270341306", Cont.Type.love);
    rubrica.add(due.getContact());
    Cont tre = new Cont();
    tre.setcontact("marzi","mia","3270341306", Cont.Type.love);
    rubrica.add(tre.getContact());
    Cont quattro = new Cont();
    quattro.setcontact("marzi","mia","3270341306", Cont.Type.love);
    rubrica.add(quattro.getContact());
    Cont cinque = new Cont();
    cinque.setcontact("marzi","mia","3270341306", Cont.Type.love);
    rubrica.add(cinque.getContact());
    return rubrica;
    }
}
