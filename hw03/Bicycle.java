//Ryan Hughes
//02/09/15
//CSE002
//Program that calculates the ditance travelled and the average MPH on a bike

import java.util.Scanner; // imports the scanner
    public class Bicycle { //declares the class
        public static void main (String [] args) { //declares the main method
            
            double PI = 3.14159; //declares the doubles that are to be used
            double diameter = 27.0;
            double miles;
            double minutes;
            double milesPerHour;
            
            Scanner myScanner; //declares scanner
            myScanner = new Scanner(System.in);
            System.out.print("Enter the number of seconds: ");//asks user to input data
            int seconds = myScanner.nextInt();
            System.out.print("Enter the number of counts: ");//asks user to input data
            int counts = myScanner.nextInt();
            
            miles = counts * diameter * PI / 5280 / 12;//calculates miles travelled
            minutes = seconds / 60; //converts to minutes
            milesPerHour = miles / (minutes/60);//calculates mph
            
            miles *= 100;
            miles = (int)miles;
            miles /= 100;//converts to two decimal places
            
            milesPerHour *= 100;
            milesPerHour = (int) milesPerHour;
            milesPerHour /= 100;//converts to two decimal places
            
            System.out.println("The distance was " + miles + " miles and took " + minutes + " minutes.");//outputs the data
            System.out.println("The average mph was " + milesPerHour +".");
            
        }
    }