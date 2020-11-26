package com.javaChapter5;

public class ModifiedCompoundInterestProgram {
    double finalAmount;

    public double getFinalAmount() {
        return finalAmount;
    }

    public void compoundInterest(double principal, double period) {
        int counter;
        double interest = 0.05;
        for (counter = 0; counter < 6; counter++) {
            interest += 0.01;
            finalAmount = (principal * (Math.pow(1 + (interest / period), period)));
            finalAmount = (Math.round(finalAmount * 10.0)/10.0);
        }
    }
}


