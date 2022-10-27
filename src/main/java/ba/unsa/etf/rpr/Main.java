package ba.unsa.etf.rpr;

import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args[0].equalsIgnoreCase("Sinus")){
            double sin = FaktISin.Sinus(Double.parseDouble(args[1]));
            System.out.println("Sinus: " + sin);
        }
        else if(args[0].equalsIgnoreCase("Faktorijel")){
            int fakt = FaktISin.Faktorijel(Integer.parseInt(args[1]));
            System.out.println("Faktorijel: " + fakt);
        }
    }
}
