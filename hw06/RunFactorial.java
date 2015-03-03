//Ryan Hughes
//3/2/15
//CSE002
//Program that prints the factorial of an integer that is inputted

import java.util.Scanner;//imports the scanner
    public class RunFactorial{//declares the class
        public static void main(String [] args){//declares the main method to be used
            Scanner myScanner = new Scanner(System.in);//declares the scanner
            
            System.out.println("PLease enter an integer between 9 and 16: ");//asks for an integer to be input
            
            int i = 0;//declares a set of integers to be used later
            int j = 9;
            int k = 0;
            int l = 0;
            int m = 0;
            
            
            
            while(m == 0){//while m is 0 this loop runs
                
                if(myScanner.hasNextInt()) {//if the input was an integer this loop skips to the bottom
                       l = j = k = myScanner.nextInt(); //after setting the three variables to equal the input
                    } else {//otherwise this runs
                        System.out.println("invalid input, enter again");//asks for a correct input
                        continue;//skips to the top
                        }
                if (l <= 16 && l>=9){//checks if the input is between 9 and 16
                        
                        }
                        else {
                            System.out.println("invalid input, enter again");//otherwise asks to try again
                        continue;//skips back to the top
                        }
                   m++; //adds one to m
            
            
            while((i + 1) < j) {//while i plus one is less than j this loop runs
                    
                j--;//decreases j by one
                k *= j;//multiplies k by j
                
            }
            System.out.println(l +"! = " + k);//prints the result of the calculation
            
            }
            
            
            
            
            
        }
    }