//Ryan Hughes
//02/09/15
//cse002
//Program that prints out the first four decimal places
import java.util.Scanner; //imports the scanner
    public class FourDigits {//declares the class
        public static void main(String [] args){//declares the main method to be used
        
        Scanner myScanner;//declares the scanner
        myScanner = new Scanner(System.in);
        System.out.println("Enter a double and I display the four digits to the right of the decimal point:");//asks the user to input the data
        double number = myScanner.nextDouble();//decalres a double fro the inputted data
        
        int integer = (int)number;//converts to an integer
        
        double decimals = number - integer;//gets the decimals by themselves
        decimals *= 10000;
        
        
        int first = 0 + ((int)decimals / 1000);//locates the first digit and saves it
        decimals = decimals - (first * 1000);
        
        int second = 0 + ((int)decimals / 100);//locates the second digit and saves it
        decimals = decimals - (second * 100);
        
        int third = 0 + ((int)decimals / 10);//locates the third digit and saves it
        decimals = decimals - (third * 10);
        
        int fourth = 0 + (int)decimals;//locates the fourth digit and saves it
        
        System.out.println("The four digits are: " + first + ", " + second + ", " + third + ", " + (fourth + 1));//outputs the four digits and accomodates for the rounding down of the fourth digit
      
        }
        
}
    