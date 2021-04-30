package com.company;

public class Driver{
    double uno;
    double due;

    public Driver (double uno, double due) {
        this.due = due;
        this.uno = uno;
    }

    public double GetOne(){
            return (uno - due);
    }
        public double GetTwo (){
            return (due - uno);
    }
}