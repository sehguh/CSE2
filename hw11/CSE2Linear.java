//Ryan Hughes 
//04/13/15
//CSE002
//Program that allows the user to search for grades in an array

import java.util.Scanner;//imports the scanner
import java.util.Random;//imports the random method
public class CSE2Linear{//declares the class
    public static void main(String [] args){//declares the main method
        
        Random rand = new Random();//creates the rand 
        Scanner scan = new Scanner(System.in);//declares the scanner
        int grades[] = new int[15];//creates an array
        
        for(int i = 0; i < 15; i++){//loop to enter 15 grades into an array
            System.out.println("Please enter 15 ints for final grades: ");//asks user for input
            
            if(scan.hasNextInt()){//checks if it is an integer
                grades[i] = scan.nextInt();
            }else{
                System.out.println("Error, please enter an integer");
                i--;//decrements i
                
            }
            if(grades[i] <= 0 || grades[i] >= 100){//checks if it is between 0 and 100
                System.out.println("Please enter an integer between 0 and 100");
                i--;
                
            }
            
            
            if(i > 0){//checks to make sure the number is greater than the previous number
            if(grades[i] < grades[i - 1]){
                System.out.println("Please enter a number greater than the previous number");
                i--;
                continue;
            }
            } 
        }
        
        for(int j = 0; j < 15; j++){//for loop to print out the grades that were entered
            System.out.print(grades[j] + " ");
        }
        
        int y = 0;//declares an integer y
        
        System.out.println("Please enter a grade to search for: ");//asks the user for input
        y = scan.nextInt();
        
        boolean result = binary(y,grades);//goes to the binary method
        
        if(!result) {//if no result was found this runs
            System.out.println(y +" was not found in the list");
        }
        
        grades = randomize(grades);//goes to the randomize method
        System.out.println("Scrambled: ");

        for(int l = 0; l < 15; l++){
            System.out.print(grades[l] + " ");//prints the grades form the array
        }
        
        System.out.println("Enter a new grade to search for");
        int a = scan.nextInt();//asks for a new grade and assigns it to a
        int c = 1;
        
        for(int b = 0; b < 15; b++){//performs a linear search and checks for the inputted number
            if(grades[b] == a){
                System.out.println(a + " was found in the list with " + c + " iterations");
            }
            c++;
        }
        
        
    }
    
    public static int[] randomize(int[] grades){//method to scramble the array
        
        
        
        for(int i = 0; i < 8; i++){
            int place = grades[i];//places the number in a temporary position
            grades[i] = grades[14 - i];//places a new number in that original position
            grades[14 - i] = place;//puts the number in the new position
        }
        return grades;//returns the array
        
    }

        

       public static boolean binary(int y, int grades[]) {//method to perform a binary search
        
         int low = 0;
         int high = 14;
         int k = 1;
         
          
         while(high >= low) {//performs it while low is lower than high
             int middle = (low + high) / 2;//creates the middle variable
             if(grades[middle] == y) {//if the middle value is equal to y then it outputs that it was successful
                 System.out.println(y +" was found in the list with " + k +" iterations");
                 return true;//returns true
             }
             if(grades[middle] < y) {//if it is less than y low is incremented by middle plus 1
                 low = middle + 1;
             }
             if(grades[middle] > y) {//if it is greater than y high is incremented by middle minus 1
                 high = middle - 1;
             }
             k++;//increments k
        }
        return false;//returns false
   }
        
    

    
    
}    
    
