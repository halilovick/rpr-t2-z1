package ba.unsa.etf.rpr;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite broj: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        double sin = FaktISin.Sinus(n);
        int fakt = FaktISin.Faktorijel(n);
        System.out.println("Sinus: " + sin + "\nFaktorijel: " + fakt);
    }
}