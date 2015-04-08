//Ryan Hughes
//04/03/15
//CSE002
//Program that prints an array

import java.util.Scanner;
    public class ArrayInputs {
        public static void main(String [] args){
            
            Scanner scan = new Scanner(System.in);
            
            
            System.out.println("Please enter an integer for the size of an array:");
            
            
            
            int y = 0;
            
            do {
                System.out.println("Please enter a positive integer: ");
                if(scan.hasNextInt()){
                y = scan.nextInt();
                } else {
                    System.out.println("Sorry you didn't enter a positive integer");
                    continue;
                }
                
                if (y <= 0) {
                    System.out.println("You didn't enter a positive number");
                }
            } while (y <= 0);
            
            int [] num = new int [y];
            
            int i = 0;
            int x = 0;
            System.out.println("Please enter 10 positive integers");
            
            for(i = 0; i < y; i++){
                    
                
                num[i] = ;
            }
            
            
            
            
            
        }
    }