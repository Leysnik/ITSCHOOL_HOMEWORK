package com.Fraction;

import java.util.Scanner;

public class Main {
     public static void  main(String[] strings) {
         Employee e = new Employee("11",2,"3");

         System.out.println(e);
         Vector2D v = new Vector2D(5,7);
         v.scale(1.5);
         v.normalized();
         v.print();
         System.out.println(v.length());
         System.out.println();
     }

}