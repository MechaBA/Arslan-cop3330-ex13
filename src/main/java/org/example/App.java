/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Berkay Arslan
 */

package org.example;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        int principal = input.nextInt();
        System.out.print("What is the rate? ");
        double rate = input.nextDouble();
        System.out.print("What is the number of years? ");
        int year = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int x = input.nextInt();
        double y = principal * Math.pow(1+((rate*0.01)/x),x*year);
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n", principal, rate, year, x, y);
        input.close();
    }
}

