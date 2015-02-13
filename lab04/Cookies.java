//Ryan Hughes
//02/13/15
//CSE02
//Program that determines whether the user has enough cookies

import java.util.Scanner; //imports the scanner

    public class Cookies { //declares the class to be used
        
        public static void main (String [] args) {//declares the main method
            
            Scanner myScanner;//declares the scanner
            myScanner = new Scanner(System.in);//states how data will be input with the scanner
            
            
            System.out.println("Enter the number of people: ");//asks the user to input data
            
                if(myScanner.hasNextInt()){//checks to make sure an integer was inputted
                    
                }else {
                    
                    System.out.println("Please enter a valid integer."); //if no integer was inputted it end the program
                    return;
                    
                }
                
                int people = myScanner.nextInt();//sets the number input to a variable
            
                if(people <= 1){//checks to make sure the number input is greater than 0
                System.out.println("Please enter a positive integer.");//if it isn't then it asks the user to correct their mistake
                }
                
            
            System.out.println("Please enter the number of cookies you are planning to buy:");//asks the user to specify the number of cookies
            
                if(myScanner.hasNextInt()){//checks to make sure an integer has been input
                }else {
                    System.out.println("Please enter a valid integer."); //asks the user to enter a valid number
                    return;
                }
                
                int cookies = myScanner.nextInt();//sets the number of cookies equal to the number that was input
            
                if(cookies <= 1){//checks to make sure the number is greater than 0
                System.out.println("Please enter a positive integer.");//asks the user to correct their input
                }
                
            
            System.out.println("How many cookies do you want each person to get?");//asks the user how many cookies each person is to get
            
                if(myScanner.hasNextInt()){//checks to see if the input is an integer
                }else {
                    System.out.println("Please enter a valid integer.");//asks the user to correct their data
                    return;
                }
                
                int cookiePerPpl = myScanner.nextInt();//sets the number input to the variable cookiePerPpl
            
                if(cookiePerPpl <= 1){//checks to make sure the number input is greater than 0
                System.out.println("Please enter a positive integer.");//asks the user to correct the data
                }
                
            
            if((cookiePerPpl * people) <= cookies){
                System.out.println("You have enough cookies!");//if the number of cookies is enough it prints that there is enough
                
                }else {
                    int cookiesNeeded = (cookies - (cookiePerPpl * people));//otherwise it tells the user that they dont have enough cookies
                    System.out.println("You don't have enough cookies.");
                }
                
                if ((cookiePerPpl * people) % cookies == 0) {
                    System.out.println("The cookies will divide evenly among the people.");//calculates whether the cookies will divide evenly among the people
                }
                    else { 
                        System.out.println("You need " + ((cookiePerPpl * people) % cookies) + " more cookies");//calculates how many cookies the user needs
            
            
            
            
        }
}
    }