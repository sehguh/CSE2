//Ryan Hughes
//3/2/15
//CSE002
//Program that accepts integers and prints out the sum

import java.util.Scanner;//imports the scanner
    public class GetIntegers {//declares the class
        public static void main(String [] args){//declares the main method to be used
            
            Scanner myScanner = new Scanner (System.in);//declares the scanner
            
            System.out.println("Please enter 5 non-negative integers: ");//asks for 5 integers to be entered
            
            int j = 0;//declares to integer variables to be used
            int k = 0;
            
            for(int i = 0; i < 5; i++) {//while i is less than 5 this loop runs
                if(myScanner.hasNextInt()) {//if the input was an integer this runs
                    j = myScanner.nextInt();//sets j equal to the input
                }
                else {//otherwise this runs
                    System.out.println("Invalid input, enter again");//asks the user to try again
                    i--;//decreases i by one
                    break;//ends the loop
                }
                k += j;//k now equals k plus j
                
                
            }
            System.out.println("The sum is: " + k);//prints the sum
        
        
        
    }
    }