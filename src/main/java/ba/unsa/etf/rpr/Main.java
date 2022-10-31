package ba.unsa.etf.rpr;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        if(args[0].equals("sinus")){
            System.out.println(Matematika.sinus(Double.parseDouble(args[1])));
        }
        else if(args[0].equals("faktorijel")){
            System.out.println(Matematika.faktorijel(Double.parseDouble(args[1])));
        }
    }

}