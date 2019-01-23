package com.company;

public class Temperature {

    private double fahrenTemp;

    public void setTempFahrenheit(double fahrenheit) {
       fahrenTemp = fahrenheit;
    }
    public double getTempFahrenheit() {
        return fahrenTemp;
    }

    public double convertToCelsius() {
        double celsius = (fahrenTemp - 32) / 1.8;
        return celsius;
    }

}
