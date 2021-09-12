package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class CompoundInterest
{
    public static void main( String[] args )
    {
        // Program to calculate compound interest based on user input
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double principal = input.nextDouble();

        System.out.print("What is the rate? ");
        double rate = input.nextDouble() / 100.0;

        System.out.print("What is the number of years? ");
        int years = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int num_per_year = input.nextInt();

        double compoundInterest = CompoundInterestMaker.createCompoundInterest(principal, rate, years, num_per_year);
        String str = "%";

        System.out.printf("$%.2f invested at %.1f%s for %d years compounded %d times per year is $%.2f.", principal, rate * 100, str, years, num_per_year, compoundInterest);
    }
}

class CompoundInterestMaker
{
    // Calculation of compound interest
    public static double createCompoundInterest(double p, double r, int t, int n)
    {
        double one = 1 + (r / n);
        double two = Math.pow(one, (n * t));
        return p * two;
    }
}
