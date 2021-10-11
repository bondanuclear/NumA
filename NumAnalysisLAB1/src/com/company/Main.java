package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	 //x^3 - 2*x^2 - x + 2 = 0 методом релаксації знайти найменший від'ємний розвязок
        Relaxation.getLimits();
        // -1.5 -0.5 - межі
        double a = Relaxation.getDerLims(-1.5);
        double b = Relaxation.getDerLims(-0.5);
        double tau = Relaxation.getTau(a,b);
        System.out.println(tau);
        double answer;
        for(int i = 1; i <= Relaxation.getNumOfIterations(a,b); i++) {
            System.out.println(i + " step");

            answer = i - tau * (Math.pow(i, 3) - 2 * (Math.pow(i, 2)) - i + 2);

            System.out.println("Result = "  + answer);



        }

       // System.out.println("1 завдання методом релаксації - відповідь " + -0.444 + " знайдено за 4 кроки");
            /////////////////////////////////////////////////
        /// 3 завдання - метод січних
        Tangent.getLimit();
        // [2.5 3.5]  - а = 3.5
        Tangent.Answer();
        // Відпоівідь - 3.000000000007415 при точності в 0,001
        // 2 завдання - Модифікований метод Ньютона
       ModifiedNewton.getLimit();
         ModifiedNewton.Answer();
        //

    }

}
