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


        Scanner userInput = new Scanner(System.in);

        double[] dailyAverageTemp = new double[7];
        double[] dailyAverageTempCelsius = new double[7];
        int[] daysOfWeek = {1, 2, 3, 4, 5, 6, 7};


        //day 1
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 1");

        Temperature dayOne = new Temperature();
        dayOne.setTempFahrenheit(userInput.nextDouble());

        dailyAverageTemp[0] = dayOne.getTempFahrenheit();
        dailyAverageTempCelsius[0] = dayOne.convertToCelsius();

        //double avgTemp0 = userInput.nextDouble();
        //dailyAverageTemp[0] = avgTemp0;

        //double avgTempCelsius0 = ((dailyAverageTemp[0] - 32) / 1.8);
        // dailyAverageTempCelsius[0] = avgTempCelsius0;


        //day 2
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 2");

        Temperature dayTwo = new Temperature();
        dayTwo.setTempFahrenheit(userInput.nextDouble());

        dailyAverageTemp[1] = dayTwo.getTempFahrenheit();
        dailyAverageTempCelsius[1] = dayTwo.convertToCelsius();

        //double avgTemp1 = userInput.nextDouble();
        //dailyAverageTemp[1] = avgTemp1;

        //double avgTempCelsius1 = ((dailyAverageTemp[1] - 32) / 1.8);
        //dailyAverageTempCelsius[1] = avgTempCelsius1;


        //day 3
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 3");

        Temperature dayThree = new Temperature();
        dayThree.setTempFahrenheit(userInput.nextDouble());

        dailyAverageTemp[2] = dayThree.getTempFahrenheit();
        dailyAverageTempCelsius[2] = dayThree.convertToCelsius();

        //double avgTemp2 = userInput.nextDouble();
        //dailyAverageTemp[2] = avgTemp2;

        //double avgTempCelsius2 = ((dailyAverageTemp[2] - 32) / 1.8);
        //dailyAverageTempCelsius[2] = avgTempCelsius2;


        //day 4
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 4");

        Temperature dayFour = new Temperature();
        dayFour.setTempFahrenheit(userInput.nextDouble());

        dailyAverageTemp[3] = dayFour.getTempFahrenheit();
        dailyAverageTempCelsius[3] = dayFour.convertToCelsius();

        //double avgTemp3 = userInput.nextDouble();
        //dailyAverageTemp[3] = avgTemp3;

        //double avgTempCelsius3 = ((dailyAverageTemp[3] - 32) / 1.8);
        //dailyAverageTempCelsius[3] = avgTempCelsius3;


        //day 5
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 5");

        Temperature dayFive = new Temperature();
        dayFive.setTempFahrenheit(userInput.nextDouble());

        dailyAverageTemp[4] = dayFive.getTempFahrenheit();
        dailyAverageTempCelsius[4] = dayFive.convertToCelsius();

        //double avgTemp4 = userInput.nextDouble();
        //dailyAverageTemp[4] = avgTemp4;

        //double avgTempCelsius4 = ((dailyAverageTemp[4] - 32) / 1.8);
        //dailyAverageTempCelsius[4] = avgTempCelsius4;


        //day 6
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 6");

        Temperature daySix = new Temperature();
        daySix.setTempFahrenheit(userInput.nextDouble());

        dailyAverageTemp[5] = daySix.getTempFahrenheit();
        dailyAverageTempCelsius[5] = daySix.convertToCelsius();

        //double avgTemp5 = userInput.nextDouble();
        //dailyAverageTemp[5] = avgTemp5;

        //double avgTempCelsius5 = ((dailyAverageTemp[5] - 32) / 1.8);
        //dailyAverageTempCelsius[5] = avgTempCelsius5;


        //day 7
        System.out.println("Enter an average temperature in degrees Fahrenheit for day 7");

        Temperature daySeven = new Temperature();
        daySeven.setTempFahrenheit(userInput.nextDouble());

        dailyAverageTemp[6] = daySeven.getTempFahrenheit();
        dailyAverageTempCelsius[6] = daySeven.convertToCelsius();

        //double avgTemp6 = userInput.nextDouble();
        //dailyAverageTemp[6] = avgTemp6;

        //double avgTempCelsius6 = ((dailyAverageTemp[6] - 32) / 1.8);
        //dailyAverageTempCelsius[6] = avgTempCelsius6;

        boolean repeat;
        while (repeat = true) {

            System.out.println("Display results in 1-Fahrenheit or 2-Celsius?");
            int results = userInput.nextInt();

            double sum = (dayOne.getTempFahrenheit() + dayTwo.getTempFahrenheit() + dayThree.getTempFahrenheit() + dayFour.getTempFahrenheit() + dayFive.getTempFahrenheit() + daySix.getTempFahrenheit() + daySeven.getTempFahrenheit());
            double sumCelsius = (dayOne.convertToCelsius() + dayTwo.convertToCelsius() + dayThree.convertToCelsius() + dayFour.convertToCelsius() + dayFive.convertToCelsius() + daySix.convertToCelsius() + daySeven.convertToCelsius());


            if (results == 1) {
                for (int i : daysOfWeek) {
                    int x = i - 1;
                    System.out.println("Day " + i + " Average temperature is " + dailyAverageTemp[x] + " degrees Fahrenheit!");
                }
                System.out.println("The weekly average of the temperatures you entered is " + sum / dailyAverageTemp.length + " degrees Fahrenheit!");
                break;

            } else if (results == 2) {
                for (int i : daysOfWeek) {
                    int x = i - 1;
                    System.out.println("Day " + i + " Average temperature is " + dailyAverageTempCelsius[x] + " degrees Celsius!");
                }
                System.out.println("The weekly average of the temperatures you entered is " + sumCelsius / dailyAverageTempCelsius.length + " degrees Celsius!");
                break;

            } else {
                System.out.println("Please enter either 1 or 2");
                repeat = true;
            }
        }
    }
}

