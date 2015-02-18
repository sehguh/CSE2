//Ryan Hughes
//02/17/15
//CSE002
//Program that allows the user to make banking transactions

import java.util.Scanner; //imports the scanner
import java.util.Random;//imports the random generator
    public class Banking {//declares the class
        public static void main(String [] args) {//declares the main method to be used
            
            Scanner myScanner;//declares the scanner
            myScanner = new Scanner(System.in);
            
            int withdrawAmount; //declares the variables to be used
            int depositAmount;
            
            Random rand = new Random();//generates a random number between 1000 and 5000
            int balance = rand.nextInt(4001) + 1000;
            
            System.out.println("You have " + balance + " dollars in your account."); //tells the user how much money they have
            System.out.println("Would you like to withdraw (1), deposit (2), or view (3)?");//asks the user what they would like to do
            int action = myScanner.nextInt();//sets the integer equal to their response
            
            
            
            switch (action) {//starts the switch statement
                case 1:
                    System.out.println("How much would you like to withdraw?");//asks the user how much they would like to withdraw
                    withdrawAmount = myScanner.nextInt();//sets the amount equal to the previously declared integer
                    if (withdrawAmount < balance && withdrawAmount > 0) {//if it is a valid amount the program continues
                        
                        balance = balance - withdrawAmount;//calculates the new balance
                        System.out.println("Okay, your new balance is " + balance + " dollars");//tells the user of this new balance
                    }
                    else {
                        System.out.println("You did not enter a valid amount");//tells the user if they entered an invalid number
                        return;//ends the program
                    }
                        break;//ends the switch statement
                        
                case 2:
                    System.out.println("How much would you like to deposit?");//asks how much they would like to deposit
                    depositAmount = myScanner.nextInt();//sets that equal to the deposit amount
                    if (depositAmount > 0) {//checks to see if the user entered a positive number
                        balance = balance + depositAmount;//calculates the new balance
                        System.out.println("Your new balance is " + balance + " dollars");//tells the user of their new balance
                    }
                    else {
                        System.out.println("You did not enter a valid amount to deposit");//tells the user if they gave an invalid input
                        return;//ends the program
                        
                    }
                    break;//ends the switch
                
                case 3:
                    System.out.println("Your current balance is " + balance + " dollars");//prints the users balance
                    break;//ends the switch
            }
            
            
            
            
            
            
            
            
        }
    }