//Ryan Hughes
//02/23/15
//CSE002
//Program that converts decimals to hexadecimals

import java.util.Scanner; // imports the scanner
    public class ToHex {//declares the class
        public static void main(String [] args) {//declares the main method to be used
            
            Scanner myScanner = new Scanner(System.in);//declares and assigns the scanner
            
            int r, g, b;//declares multiple integers to be used
            String rh1 = "a";//declares the strings to be used foe the final output
            String rh2 = "b";
            String gh1 = "e";
            String gh2 = "f";
            String bh1 = "c";
            String bh2 = "d";
            
            
            System.out.println("Please enter three numbers representing RGB values: ");//asks the user to input values
            System.out.println("Enter the first one: ");//prompts for the first number
                if (myScanner.hasNextInt()) {//checks to see if its a valid integer
                 
                } else {
                 System.out.println("You must enter an integer.");//otherwise tells the user they are incorrect and ends the program
                 return;
                }
                r = myScanner.nextInt();//assigns the input to r
                
            System.out.println("Now the second: ");//asks for the second number
                if (myScanner.hasNextInt()) {//again checks if the number is valid
                 
                } else {
                 System.out.println("You must enter an integer.");
                 return;
                }
                g = myScanner.nextInt();
                
            System.out.println("Now the final one: ");//asks for the third number
                if (myScanner.hasNextInt()) {//once again checks if the number is valid
                 
                } else {
                 System.out.println("You must enter an integer.");
                 return;
                }
                b = myScanner.nextInt();
            
                
                if (r > 255 || g > 255 || b >255) {//if the numbers are greater than 255 it ends the program as that is an invalid input
                    System.out.println("Sorry, you must enter values between 0 and 255.");
                    return;
                }
                
            rh1 = Integer.toString(r/16);//divides by 16 to determine the first digit of the hexadecimal number
            rh2 = Integer.toString(r % 16);//finds the remainder for the second digit
            gh1 = Integer.toString(g / 16);//repeats with the second number
            gh2 = Integer.toString(g % 16);
            bh1 = Integer.toString(b / 16);//repeats with the third number
            bh2 = Integer.toString(b % 16);    
            
            switch (rh1) {//checks if the digits are between 10-15 and if so converts them to the correct hexadecimal character
                case "10":
                    rh1 = "A";
                    break;
                case "11":
                    rh1 = "B";
                    break;
                case "12":
                    rh1 = "C";
                    break;
                case "13":
                    rh1 = "D";
                    break;
                case "14":
                    rh1 = "E";
                    break;
                case "15":
                    rh1 = "F";
            }
            
            switch (rh2) {//repeats for the second digit of the first number
                case "10":
                    rh2 = "A";
                    break;
                case "11":
                    rh2 = "B";
                    break;
                case "12":
                    rh2 = "C";
                    break;
                case "13":
                    rh2 = "D";
                    break;
                case "14":
                    rh2 = "E";
                    break;
                case "15":
                    rh2 = "F";
            }
            
            switch (gh1) {//repeats for the first digit of the second number
                case "10":
                    gh1 = "A";
                    break;
                case "11":
                    gh1 = "B";
                    break;
                case "12":
                    gh1 = "C";
                    break;
                case "13":
                    gh1 = "D";
                    break;
                case "14":
                    gh1 = "E";
                    break;
                case "15":
                    gh1 = "F";
            }
            
            switch (gh2) { // repeats for the second digit of the second number
                case "10":
                    gh2 = "A";
                    break;
                case "11":
                    gh2 = "B";
                    break;
                case "12":
                    gh2 = "C";
                    break;
                case "13":
                    gh2 = "D";
                    break;
                case "14":
                    gh2 = "E";
                    break;
                case "15":
                    gh2 = "F";
            }
            
            switch (bh1) {//repeats for the first digit of the third number
                case "10":
                    bh1 = "A";
                    break;
                case "11":
                    bh1 = "B";
                    break;
                case "12":
                    bh1 = "C";
                    break;
                case "13":
                    bh1 = "D";
                    break;
                case "14":
                    bh1 = "E";
                    break;
                case "15":
                    bh1 = "F";
            }
            
            switch (bh2) {//repeats for the second digit of the third number
                case "10":
                    bh2 = "A";
                    break;
                case "11":
                    bh2 = "B";
                    break;
                case "12":
                    bh2 = "C";
                    break;
                case "13":
                    bh2 = "D";
                    break;
                case "14":
                    bh2 = "E";
                    break;
                case "15":
                    bh2 = "F";
            }
            
            
            String result = ("" + rh1 + rh2 + gh1 + gh2 + bh1 + bh2); //combines all the characters together to form one string
            
            System.out.println("The decimal numbers, R: " + r + " G: " + g + " B: " + b + ", are represented in hexadecimal as: " + result);//prints the result out
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
    }