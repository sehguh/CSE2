//Ryan Hughes
//3/6/15
//CSE002
//Program that outputs a loop of zigzags

import java.util.Scanner;//imports the scanner
    public class zigzag {//declares the class
        public static void main(String [] args) {//declares the main method to be used
            
            Scanner myScanner = new Scanner(System.in);//declares and initialises the scanner
            
            int nStars = 10;//declares the variables to be used later on
            int nStarts = 10;//also initialises them
            int i = 0;
            int j = 1;
            int k = 0;
            int l = 0;
            char g = 'g';//declares a char to be used at the end
            
            
            
            
            
            
            while (true){//the outermost while loop to keep the code running infinitely if needed
            System.out.println("Enter an int between 3 and 33: ");//asks the user for input
            if (myScanner.hasNextInt()){//checks to make sure it is an integer
                nStars = nStarts = myScanner.nextInt();//sets the input equal to the first two variables
            }
            else{
                System.out.println("Invalid input");//if the input was not valid then this statement pops up and asks the user to try again
                continue;//goes to the top of the loop
            }
            
            if(nStars < 3 || nStars > 33) {//checks to see if the input is between 3 and 33 inclusively
                
                System.out.println("The number is out of range");//if it is not then this output appears
                continue;//goes to the top of the loop
            }
            
            
            while (i < nStars) {//while i is less than nStars this loop runs
                System.out.print("*");//prints out a star
                i++;//increments i
            }
            
            System.out.println("");//goes to a new line
            
            while((j + 1) < nStars){//while j plus 1 is less than nStars this loop runs
                while(k < j) {//while k is less than j this loop runs
                    System.out.print(" ");//prints out j number of spaces
                    k++;//increments k
                    }
                System.out.println("*");//prints out a star
                j++;//increments j
                k = 0;//sets k back to 0
            
            }
            
            while (l < nStarts) {//while l is less than nStarts this loop runs
                System.out.print("*");//prints out a star
                l++;//increments l
            }
            
            System.out.println("Enter y or Y to go again: ");//asks the user if they want to continue the loop
            g = myScanner.next().charAt(0);//sets g equal to their input
            if (g == 'y' || g == 'Y') {//if their input is y or Y then the code continues here
                continue;//goes to the top of the loop again
            }
            else{ //otherwise this runs
                return;//ends the program
            }
            
            
            
        }
    }
    }