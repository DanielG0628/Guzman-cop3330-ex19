package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        double height, weight, BMI;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("Enter your height:");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("Enter a numerical value for height:");
        }
        height = sc.nextDouble();
        System.out.println("Enter your weight:");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("Enter a numerical value for weight:");
        }
        weight = sc.nextFloat();

        //calculations
        BMI = Math.round((weight / (height * height)) * 703)*100.0/100.0;
        System.out.println("Your BMI is " + BMI + ".");

        //output depending on BMI
        if(BMI < 18.5)
            System.out.println("You are underweight. You should see a doctor.");
        else if(BMI > 25)
            System.out.println("You are overweight. You should see a doctor.");
        else
            System.out.println("You are within the ideal weight range.");

        //close scanner
        sc.close();
    }
}
