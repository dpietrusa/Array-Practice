package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Declare an array named dailyAverageTemp
        //
        //• Instruct the user to input daily average temperatures (in
        //degrees Fahrenheit) for 7 days
        //
        //• Each time the user inputs a value, add it to your
        //dailyAverageTemp array


    Scanner userInput = new Scanner(System.in)  ;

    double[] dailyAverageTemp = new double[7];



        //day 1
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 1");
        double avgTemp0 = userInput.nextDouble();

        dailyAverageTemp[0] = avgTemp0;


        //day 2
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 2");
        double avgTemp1 = userInput.nextDouble();

        dailyAverageTemp[1] = avgTemp1;


        //day 3
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 3");
        double avgTemp2 = userInput.nextDouble();

        dailyAverageTemp[2] = avgTemp2;


        //day 4
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 4");
        double avgTemp3 = userInput.nextDouble();

        dailyAverageTemp[3] = avgTemp3;


        //day 5
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 5");
        double avgTemp4 = userInput.nextDouble();

        dailyAverageTemp[4] = avgTemp4;


        //day 6
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 6");
        double avgTemp5 = userInput.nextDouble();

        dailyAverageTemp[5] = avgTemp5;


        //day 7
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 7");
        double avgTemp6 = userInput.nextDouble();

        dailyAverageTemp[6] = avgTemp6;


        for(int i=0; i<dailyAverageTemp.length; i++) {
            System.out.println(dailyAverageTemp[i]);
        }

        double sum = (avgTemp0 + avgTemp1 + avgTemp2 + avgTemp3 + avgTemp4 + avgTemp5 + avgTemp6);
        System.out.println("The weekly average of the temperatures you entered is " + sum / dailyAverageTemp.length);





















    }
}
