package com.company;

import java.util.ArrayList;

public class Tangent  {
   public static void getLimit() {
       //x^3 - 7*x - 6 - максимальний додатний розв'язок
       double y;
       double doubleDerivativeY;
       for(double x = -5; x <= 5; x += 0.5) {
           y = Math.pow(x,3) - 7*x - 6;
           doubleDerivativeY = 6*x;
           System.out.println("X = " + x + " Y =" + y);
           System.out.println("Second derivative = " + doubleDerivativeY);

       }
   }
   public static void Answer() {
       double y = Math.pow(3.5,3) - 7*(3.5) - 6;
       double DerY = 3*Math.pow(3.5,2) - 7;
       double a;
       System.out.println("HERE");
       System.out.println(y);
       System.out.println(DerY);
       ArrayList<Double> storeA = new ArrayList<>();
       ArrayList<Double> storeFunction = new ArrayList<>();
       ArrayList<Double> storeDerivative = new ArrayList<>();
       storeA.add(3.5);
       storeFunction.add(y);
       storeDerivative.add(DerY);
    Double d;
        for(int n =1; n <= 10; n++) {
            a = storeA.get(n-1) - storeFunction.get(n-1)/storeDerivative.get(n-1);
            //System.out.println(a + "A");
            y = Math.pow(a,3) - 7*(a) - 6;
           System.out.println(y + " f(y)");
            DerY= 3*Math.pow(a,2) - 7;
            System.out.println(DerY + " Derivative");

            storeFunction.add(y);
            storeDerivative.add(DerY);
            storeA.add(a);
            d = Math.abs(storeA.get(n-1) - storeA.get(n));
            System.out.println("Точність = " + d);
            System.out.println(a + " X(n+1)");
        }
   }
}
