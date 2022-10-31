package ba.unsa.etf.rpr;
import java.lang.Math;
public class Matematika {
    private double x;

    /**public static double faktorijel(double x){
        int i,fact=1;
        for(i=1;i< x+1;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static double sinus(double x)
    {

      int i = 0;
        double suma = 0;

         for (i = 0; i<10; i++){
            suma = suma + Math.pow(-1,i)*Math.pow(x, 2*i+1)/faktorijel(2*i+1);
        }
        return suma*180/Math.PI;

    }**/
    public static double sinus(double n) {
        double suma = 0;
        int fac;
        n = n * Math.PI / 180;
        for (int i = 0; i < 10; i++) {
            fac = 1;
            for (int j = 2; j <= 2 * i + 1; j++) {
                fac *= j;
            }
            suma = suma + Math.pow(-1.0, i) * Math.pow(n, 2 * i + 1) / fac;
        }
        return suma;
    }

    public static double faktorijel(double n) {
        int rez = 1;
        for (int i = 1; i < n + 1; i++) {
            rez = rez * i;
        }
        return rez;
    }
}
