package com.company;
import java.lang.Math;

public class Grid {
    String[][] grid = new String[10][10];
    public String tofill() {
        int max = 8;
        int min = 0;
        int range = max - min + 2;
        int rand = 0;
        for (int i = 0; i < 9; i++) {
            rand = (int) (Math.random() * range);
            if (rand == 9)
                return "💣";
        }
        return rand + "";
    }

    public String emptyGrid(){
        String result = "";
        for (int i = 0; i < this.grid.length; i++) {
            result += "[";
            for (int j = this.grid[i].length - 1; j >= 0; j--) {
                result += "[" + "*" + "]";
            }
            result += "]\n";
        }
        return result;
    }


    public String toString() {
        String result = "";
        String mezzo;
        emptyGrid();
        for (int x = 0; x < this.grid.length; x++) {
            result += "[";
            for (int y = this.grid[x].length - 1; y >= 0; y--) {
                result += "[" + tofill() + "]";
            }
            result += "]\n";
        }
        return result;
    }
}

