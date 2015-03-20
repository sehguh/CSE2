//Ryan Hughes
//3/20/15
//CSE002
//Program that outputs the super factorial of a selected number

import java.util.Scanner; //imports the scanner
    public class Factorials {//declares the class
        public static void main(String [] args) {//declares this method to be the main one
            
            int x = 0;//declares variables to be used and initializes them
            int total = 0;
            
            Scanner myScanner = new Scanner(System.in);//declares and initializes the scanner
            
            System.out.println("Please enter an integer: ");//asks for an input
            
            if(myScanner.hasNextInt()){//checks to see if an integer was input
                x = myScanner.nextInt();//sets x to the input
            }
            else{
                System.out.println("Incorrect Input");//if an incorrect input is added the program ends
                return;
                
            }
            
            
            for (int i = 1; i <= x; i++){//this loop calculates the sum of all the factorials used
                total += factorial(i);//calls the factorial method to calculate the factorials
            }
            output(total);//returns the total number calculated
            
        }
        
        public static int factorial (int y){//this method calculates the individual factorials that are being used
            int z = 1;//declares and initializes z
            for (int g = 1; g <= y; g++){//this loop calculates the factorial
                z *= g;
                
            }
                System.out.println(z);//prints out each factorial as it is calculated
                return z;
            
        }
        
        
        public static void output (int end) {//this method is for the output
            System.out.println("The super factorial is: " + end);//prints the total super factorial
            
        }
    }
    
    
    
    