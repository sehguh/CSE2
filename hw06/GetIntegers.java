//Ryan Hughes
//3/2/15
//CSE002
//Program that accepts integers and prints out the sum

import java.util.Scanner;
    public class GetIntegers {
        public static void main(String [] args){
            
            Scanner myScanner = new Scanner (System.in);
            
            System.out.println("Please enter 5 non-negative integers: ");
            
            int j = 0;
            int k = 0;
            
            for(int i = 0; i < 5; i++) {
                if(myScanner.hasNextInt()) {
                    j = myScanner.nextInt();
                }
                else {
                    System.out.println("Invalid input, enter again");
                    i--;
                    break;
                }
                k += j;
                
                
            }
            System.out.println("The sum is: " + k);
        
        
        
    }
    }