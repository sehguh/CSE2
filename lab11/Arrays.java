//Ryan Hughes
//04/10/15
//CSE002
//Program that creates random arrays and outputs the min and max

import java.util.Scanner;//imports the scanner
import java.util.Random;//imports the random function
    public class Arrays {//declares the class
        public static void main(String [] args) {//declares the main method
            
            Random rand = new Random();//intitalizes the random
            Scanner scan = new Scanner(System.in);//initializes the scanner
            int array1[] = new int[50];//creates an array of length 50
            int array2[] = new int[50];//creates a second array of length 50
            
            for(int i = 0; i < 49; i++){//loop to assign random numbers to each index of the array
                array1[i] = rand.nextInt(100);
            }
            
            int min = 100;//creates integers for the min and max
            int max = 0;
            
            for(int j = 0; j < 49; j++){//loop to find the minimum of the first array
                if(array1[j] <= min){
                    min = array1[j];
                }
            }
            
            for (int k = 0; k < 49; k++) {//loop to find the maximum of the first array
                if(array1[k] > max){
                    max = array1[k];
                }
            }
            
            System.out.println("The maximum of array1 is: " + max);//prints the min and max of array1
            System.out.println("The minimum of array1 is: " + min);
            
            int a =0;//creates an integer
            array2[0] = rand.nextInt(100);//assigns a random number to the 0th index

            
            for(a = 1; a < 49; a++){//loop to assign an increasing number to each next index of the second array
                array2[a] = (array2[a - 1] + rand.nextInt(100));
                    }
            
            int min2 = 100;//creates two integers
            int max2 = 0;
            
            for(int b = 0; b < 49; b++){//finds the minimum of the second array
                if(array2[b] <= min2){
                    min2 = array1[b];
                }
            }
            
            for (int c = 0; c < 49; c++) {//finds the maximum of the second array
                if(array2[c] >= max2){
                    max2 = array2[c];
                }
            }
            
            System.out.println("The maximum of array2 is: " + max2);//prints the maximum
            System.out.println("The minimum of array2 is: " + min2);//prints the minimum
            
            System.out.println("Enter an int: ");//prompts the user to enter an integer
            
            int y = 0;//creates an integer
            
            if(scan.hasNextInt()){//checks to make sure it is an integer
                y = scan.nextInt();
            }else{
                System.out.println("You did not enter an int.");//if not an int is entered it tells the user and quits
                return;
            }
            
            if(y < 0){//checks if the user entered a negative number
                System.out.println("You did not enter an integer > 0");//if so tells the user and exits
                return;
            }
            
            
            int low = 0;//creates two integers for low and high
            int high = 49;
            
         
          
         while(high > low) {//performs it while low is lower than high
             int middle = (low + high) / 2;//creates the middle variable
             if(array2[middle] == y) {//if the middle value is equal to y then it outputs that it was successful
                 System.out.println(y +" was found in the list with");
                 return;//returns
             }
             if(array2[middle] < y) {//if it is less than y low is incremented by middle plus 1
                 low = middle + 1;
             }
             if(array2[middle] > y) {//if it is greater than y high is incremented by middle minus 1
                 high = middle - 1;
             }
             
             
        }
        
        System.out.println(y + " was not found in the list");//if the number wasnt found tells the user
        System.out.println("The number above the key was: " + array2[high]);//prints the index above and below
        System.out.println("The number below the key was: " + array2[low - 1]);
        
        
            
            
            
            
            
            
        }
    }