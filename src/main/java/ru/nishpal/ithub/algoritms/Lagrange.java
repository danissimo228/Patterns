package ru.nishpal.ithub.algoritms;

public class Lagrange {

    public static double InterpolateLagrangePolynomial(double x, double[] xValues, double[] yValues, int size) {
        double lagrangePol = 0;
        for (int i = 0; i < size; i++) {
            double basicsPol = 1;
            for (int j = 0; j < size; j++) {
                if (j != i) {
                    basicsPol *= (x - xValues[j]) / (xValues[i] - xValues[j]);
                }
            }
            lagrangePol += basicsPol * yValues[i];
        }
        return lagrangePol;
    }

    public static double TestF(double x){
        return x * x * x + 3 * x * x + 3 * x + 1;
    }
}

//        final int size = 10;
//        var xValues = new double[size];
//        var yValues = new double[size];
//
//        for (int i = 0; i < size; i++) {
//            xValues[i] = i;
//            yValues[i] = Lagrange.TestF(i);
//        }
//
//        System.out.println(Lagrange.InterpolateLagrangePolynomial(3.16, xValues, yValues, size));
//    }
