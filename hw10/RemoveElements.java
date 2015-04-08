//Ryan Hughes
//04/07/15
//CSE002
//Program that eliminates certain parts of an array

import java.util.Scanner;//imports the scanner
import java.util.Random;//imports the random function
    public class RemoveElements{//declares the class
        public static void main(String [] arg){//declares the main method
	       Scanner scan=new Scanner(System.in);//declares and initializes the scanner
            
            int num[]=new int[10];//decalres the arrays and variables to be used
            int newArray1[];
            int newArray2[];
            int index,target;
        	
        	String answer="";//declares the string for the answer
        	
        	do{
          	System.out.print("Random input 10 ints [0-9]");//prints what ints are being given
          	num = randomInput();//accesses the randominput method
          	String out = "The original array is:";
          	out += listArray(num);
          	System.out.println(out);
         
          	System.out.print("Enter the index ");//prints info to the user
          	index = scan.nextInt();
          	while(index < 0 || index > 9){//while the user input is invalid it will continue to ask the user for input
          	    System.out.println("The index is not valid");
          	    index = scan.nextInt();
          	}
          	newArray1 = delete(num,index);
          	String out1="The output array is ";
          	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out1);
         
              System.out.print("Enter the target value ");
          	target = scan.nextInt();
          	newArray2 = remove(num,target);
          	String out2="The output array is ";
          	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out2);
          	 
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");//asks the user if they want to continue
          	answer=scan.next();
        	}while(answer.equals("Y") || answer.equals("y"));
          }
         
          public static String listArray(int num[]){//this method prints out the array for the user to see
        	String out="{";
        	for(int j=0;j<num.length;j++){//while j is less than the array length it will continue adding the numbers on to the string
          	    if(j>0){
            	    out+=", ";
          	    }
          	    out+=num[j];
        	    }
        	    out+="} ";
        	return out;//returns back to the main method
          }
       
       public static int[] randomInput(){//method generates random numbers for the array
           Random rand = new Random();
           int num[] = new int[10];
           for(int i = 0; i < 10; i++) {//goes through each position of the array and adds a random number to it
               num[i] = rand.nextInt(10);
               }
            return num;//returns to the main method
           
       }
       
       public static int[] delete (int list[], int pos) {//method to delete a certain position from the array
           int x = pos;
           int newArray3[];
           
           newArray3 = new int [(list.length) - 1];//initializes a new array
           for(int i = 0; i < x; i++){
               newArray3[i] = list[i];
           }
           for(int j = x; j < 9; j++){
               newArray3[j] = list[j + 1];
           }
       
           return newArray3;//returns to the main method
       }
       
       public static int[] remove(int list[], int target) {//method to remove certain elements of the array
           
           int j = 0;//declares and initializes variables to be used
           int z = 0;
           int x = target;
           int newArray4[];
           for (int i = 0; i < 10; i++){
               if(list[i] == x){
                   j++;
               }
           }
           newArray4 = new int [10 - j];//declares another array
            for(int k = 0; k < 10; k++){
                if(list[k] == x){
                    continue;//if the position is equalt to the target number then it skips back to the top of the loop
                }
                newArray4[z] = list[k];
                z++;//increments z
                
            }
            System.out.println("Element " + x + " has been removed");//prints to the user that the element has been removed
            return newArray4;//returns to the main method
           
           
       }
       
       
       
       
       
       
    }