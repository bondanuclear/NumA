package com.company;

import java.util.ArrayList;

public class ModifiedNewton extends  Tangent{

    public static void getLimit() {
        //x^3 - 4*x^2 + x + 6 - максимальний додатний розв'язок
        double y;
        double doubleDerivativeY;
        for(double x = -5; x <= 5; x += 0.3) {
            y = Math.pow(x,3) - 4*Math.pow(x,2) + x + 6;
            doubleDerivativeY = 6*x - 8;
            System.out.println("X = " + x + " Y =" + y);
            System.out.println("Second derivative = " + doubleDerivativeY);

        }
    }

    public static void Answer() {
        double y =   Math.pow(-1.1,3) - 4*Math.pow(-1.1,2) + -1.1 + 6;
        double DerY = 3*Math.pow(-1.1,2) - 8*(-1.1) + 1;
        double a;

        System.out.println("DERIVATIVE");

        System.out.println(DerY);
        ArrayList<Double> storeA = new ArrayList<>();
        ArrayList<Double> storeFunction = new ArrayList<>();

        storeA.add(-1.1);
        storeFunction.add(y);

        Double d;
        for(int n =1; n <= 15; n++) {
            a = storeA.get(n-1) - storeFunction.get(n-1)/DerY;
            //System.out.println(a + "A");
            y = Math.pow(a,3) - 4*Math.pow(a,2) + a + 6;
            // System.out.println(y + "Y");

            //System.out.println(DerY + "DER");

            storeFunction.add(y);

            storeA.add(a);
            d = Math.abs(storeA.get(n-1) - storeA.get(n));
            System.out.println("Точність = " + d);
            System.out.println(a + " X(n+1)");
        }
    }
}
