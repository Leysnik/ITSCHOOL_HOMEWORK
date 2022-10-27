package com.Fraction;

import java.util.Scanner;

public class Main {
     public static void  main(String[] strings) {
        Fraction fraction1 = new Fraction(4,50);
        Fraction fraction2 = new Fraction(4,50);
        fraction2.multyKoeff(5);
        System.out.println(fraction2);
        Fraction fraction3;
        fraction3 = fraction1.multyFraction(fraction2);

        System.out.println(fraction3);
        Fraction fraction4;
        fraction4 = fraction3.demultyFraction(fraction1);
         System.out.println(fraction4);

         Fraction fraction5 = fraction1.minusFraction(fraction4);
         System.out.println(fraction5);
         Fraction fraction6 = fraction1.plusFraction(fraction4);
         System.out.println(fraction6);
     }

}