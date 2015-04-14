//Ryan Hughes
//04/10/15
//CSE002
//Program that creates random arrays and outputs the min and max

import java.util.Scanner;
import java.util.Random;
    public class Arrays {
        public static void main(String [] args) {
            
            Random rand = new Random();
            Scanner scan = new Scanner(System.in);
            int array1[] = new int[50];
            int array2[] = new int[50];
            
            for(int i = 0; i < 49; i++){
                array1[i] = rand.nextInt(100);
            }
            
            int min = 100;
            int max = 0;
            
            for(int j = 0; j < 49; j++){
                if(array1[j] <= min){
                    min = array1[j];
                }
            }
            
            for (int k = 0; k < 49; k++) {
                if(array1[k] > max){
                    max = array1[k];
                }
            }
            
            System.out.println("The maximum of array1 is: " + max);
            System.out.println("The minimum of array1 is: " + min);
            
            int a =0;
            array2[0] = rand.nextInt(100);

            
            for(a = 1; a < 49; a++){
                array2[a] = (array2[a - 1] + rand.nextInt(100));
                    }
            
            int min2 = 100;
            int max2 = 0;
            
            for(int b = 0; b < 49; b++){
                if(array2[b] <= min2){
                    min2 = array1[b];
                }
            }
            
            for (int c = 0; c < 49; c++) {
                if(array2[c] >= max2){
                    max2 = array2[c];
                }
            }
            
            System.out.println("The maximum of array2 is: " + max2);
            System.out.println("The minimum of array2 is: " + min2);
            
            System.out.println("Enter an int: ");
            
            int y = 0;
            
            if(scan.hasNextInt()){
                y = scan.nextInt();
            }else{
                System.out.println("You did not enter an int.");
                return;
            }
            
            if(y < 0){
                System.out.println("You did not enter an integer > 0");
                return;
            }
            
            int r = 49;
            int s = 25;
            int t = 0;
            
            
            while(true){
                if(array2[s] == y){
                    System.out.println(y +" was found in the list");
                    break;
                } else {
                    if(y > s){
                        s = (int) ((r+s)/2);
                    } else {
                        s = (int) ((s+t)/2);
                    }
                }
                
                
            }
            
            
            
            
            
            
        }
    }