package com.company;

public class Relaxation {
    public static void getLimits() {
        double y;


        for(double x = -5; x <= 0; x += 0.5) {

            y = Math.pow(x,3) - 2 * (Math.pow(x,2)) - x + 2;
            System.out.println("x=" + x + " y=" + y);
            if (x*y < 0) {
                System.out.println("X = " + x + " Y = " + y);

            }
        }

    }
    public static double getDerLims(double a) {
        double derLim =  (3*(Math.pow(a,2)) - 4 * (a) - 1);
        System.out.println(derLim);

        return derLim;
    }
    public static double getTau(double a, double b) {
        double tau = 2/(a + b);
        return tau;
    }
    public static int getNumOfIterations(double a, double b) {
        int result;
        double q = (Math.abs(a-b)/ (a + b));
        System.out.println(q);
        double numeral = (Math.log((1/Math.pow(10,-4))));
        double denominator = (Math.log(1/q));
        //System.out.println(numeral);
        // System.out.println(denominator);
        result = (int) ((numeral/denominator) + 1);
        return result;
    }

}
