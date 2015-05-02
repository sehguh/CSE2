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
            int look = 1;
                int z = 0;

            for(i = 0; i < y; i++){
                System.out.println("Please enter " + y + " positive integers");
                
                
            
                while(look == 0 && scan.hasNextInt()){
                
                if(scan.hasNextInt()){
                z = scan.nextInt();
                }else{
                System.out.println("That is not an integer");
                look = 0;
                }
                }
                while(look == 0);{
            
                
                if(z < 0){
                    System.out.println("The integer must be positive");
                    look = 0;
                }
                }
            
                num[i] = z;
            
            
            
            
            
        }
        System.out.println("The array is: ");
        
        for(int j = 0; j < num.length; j++){
            System.out.println(num[j]);
        }
        
        
       
        
    }
    }