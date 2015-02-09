//Ryan Hughes
//02/09/15
//CSE002
//Program to estimate the cube root of a given number
import java.util.Scanner;//imports the scanner
public class Root { //declares the class
    public static void main(String[] args) {//declares that the main method is used


        Scanner myScanner;//declares the scanner
        myScanner = new Scanner(System.in);
        System.out.print("Enter a double and I print its cube root: ");//asks the user to input the data
        double x = myScanner.nextDouble();//declares the variable that the user will define
        double guess = x / 3;//creates the initial guess by dividing by 3
        double guessFinal; //declares a double
        
        guess = (2*guess*guess*guess+x)/(3*guess*guess); //calculates the guess for the cube root
        
        guess = (2*guess*guess*guess+x)/(3*guess*guess);//repeats 4 more times
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        
        guessFinal = guess * guess * guess; //this is the actual answer that my value is the cube root of
        
        
        System.out.println("The cube root is " + guess + ": " + guess + " * " + guess + " * " + guess + " = " + guessFinal +"."); //outputs the end data to the user

    }
}