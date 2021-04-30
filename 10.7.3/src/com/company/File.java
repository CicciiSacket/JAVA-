package com.company;

public class File extends Documento{
    String path;

    private void setPath(String path){
        this.path = path;
    }

    @Override
    public String toString(){
        return path+"\n"+ super.testo;
    }
}
