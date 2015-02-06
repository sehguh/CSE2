//Ryan Hughes
//02/05/15
//CSE02
//Program to take input from the user on how many big macs and at what price, then calculate the cost including tax
import java.util.Scanner; //import the scanner to be used
    public class BigMac { //states the class to be used
        public static void main(String [] args) { //declares the use of the main method
            Scanner myScanner;  //declares a scanner called myScanner
            myScanner = new Scanner(System.in); //declares what my Scanner will be
            System.out.print("Enter the number of Big Macs(an integer > 0): "); //asks the user to enter the data
            int nBigMacs = myScanner.nextInt(); //assigns that value to an integer
            System.out.print("Enter the cost per Big Mac as a double"); //asks the user to enter the data
            double bigMac$ = myScanner.nextDouble(); //assigns it to a double
	        System.out.print("Enter the percent tax as a whole number: "); //asks the user to enter the data
            double taxRate = myScanner.nextDouble(); //assigns it to a double
                taxRate/=100; //converts the value to a usable number for calculations
                
                double cost$; 
                int dollars, dimes, pennies; //declares variables to be used
                cost$ = nBigMacs*bigMac$*(1+taxRate); //calculates the cost
                dollars=(int)cost$; //converts to an integer

                dimes=(int)(cost$*10)%10; //calculates number of dimes
                pennies=(int)(cost$*100)%10; //calculates the number of pennies
                System.out.println("The total cost of " + nBigMacs +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
                " sales tax of "+ (int)(taxRate*100) + "%, is $" + dollars + "." + dimes + pennies); //prints out the total cost of the order
        }
    }
