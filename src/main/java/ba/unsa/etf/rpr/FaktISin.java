package ba.unsa.etf.rpr;

import java.lang.Math;

public class FaktISin {
    public static double Sinus(double x){
        x = x * Math.PI/180;
        return Math.sin(x);
    }
    public static int Faktorijel(int x){
        int fakt = 1;
        for(int i=1; i<=x; i++)
            fakt *= i;
        return fakt;
    }
}