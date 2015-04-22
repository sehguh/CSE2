//Ryan Hughes 
//04/21/15
//CSE002
//Program that multiplies two multidimensional arrays

import java.util.Scanner;//imports the scanner
import java.util.Random;//imports the random function
    public class Multiply {//declares the class
        
        public static void main(String [] args){//declares the main method
            Scanner scan = new Scanner(System.in);//declares and initializes the scanner
            
            int x = 0;//declares variables to be used
            int y = 0;
            
            
            do{
            System.out.println("Please enter the width of the array: ");//asks for the width
            
            if(scan.hasNextInt()){//checks if it is an integer
                y = scan.nextInt();//sets y to the input
            }else{
                System.out.println("Error, please enter an integer");
                continue;//continues the loop
                
                
            }
            if(y < 0){//checks if it is positive
                System.out.println("Please enter an integer greater than 0");
                }
            } while(y < 0);//continues the loop while y is negative
           
            do{
            System.out.println("Please enter the height of the array: ");
            if(scan.hasNextInt()){//checks if it is an integer
                x = scan.nextInt();//sets x to the next input
            }else{
                System.out.println("Error, please enter an integer");
                continue;
                
            }
            if(x < 0){//checks if
                System.out.println("Please enter an integer greater than 0");
                }
            }
                while(x < 0);
            
            int[][] array1 = new int[x][y];
            int[][] array2 = new int[x][y];
            
            System.out.println("The first multidimensional array: ");
            array1 = randomMatrix(x,y);//calls the random matrix method
            System.out.println();
            System.out.println("The second multidimensional array: ");
            array2 = randomMatrix(x,y);//calls the random amtrix method
            System.out.println();
            
            int result[][] = new int[array1.length][array2[0].length];//declares a 2dimensional array
            
            result = matrixMultiply(array1,array2);//calls the multiply method
            
            System.out.println("The product of the two: ");
            
            for(int i = 0; i < x; i++){//uses for loops to print out the final array
             for(int j = 0; j < y; j++){
                 System.out.print(result[i][j] + " ");
                     
                 }
                 System.out.println();
         }
            
            
        }
        
        public static int[][] randomMatrix(int x, int y){//method to randomly create an array
         
         Random rand = new Random();//creates a random function
         int[][] random = new int[x][y]; //intitalizes the array
         
         for(int i = 0; i < x; i++){//assigns random numbers to the array
             for(int j = 0; j < y; j++){
                 random[i][j] = (rand.nextInt(20) - 10);
             }
         }
         
         for(int l = 0; l < x; l++){//uses for loops to print out the array
             for(int k = 0; k < y; k++){
                 System.out.print(random[l][k] + " ");
                     
                 }
                 System.out.println();
         }
         
         return random;//returns to the main method
         
         
            
        }
        
        public static int[][] matrixMultiply(int[][] array1,int[][] array2){//method to multiply the arrays
            
            int[][] result = new int[array1.length][array2[0].length];//declares and initializes the array
            
            for (int i = 0; i < array1.length; i++) { //for loops used to multiply the two arrays together
                for (int j = 0; j < array2[0].length; j++) { 
                    for (int k = 0; k < array1[0].length; k++) { 
                        result[i][j] += array1[i][k] * array2[k][j];//the array result is used to store the product
                        
                }
            }
        }
            return result;//returns to the main method
        }
        
       
        
        
        
        
        
        
        
        
        
    }