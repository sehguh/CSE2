//Ryan Hughes
//02/09/15
//cse002
//Program that prints out the first four decimal places
import java.util.Scanner;
    public class FourDigits {
        public static void main(String [] args){
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.println("Enter a double and I display the four digits to the right of the decimal point:");
        double number = myScanner.nextDouble();
        
        int integer = (int)number;
        
        double decimals = number - integer;
        decimals *= 10000;
        decimals = (int)decimals;
        
        int first = (0) + (decimals /= 1000);
        decimals = decimals - (first * 1000);
        
        int second = 0 + (decimals /= 100);
        decimals = decimals - (second * 100);
        
        int third = 0 + (decimals /= 10);
        decimals = decimals - (third * 10);
        
        int fourth = 0 + decimals;
        
        System.out.println("The four digits are: " + first + ", " + second + ", " + third + ", " + fourth);
      
        }
        
}
    