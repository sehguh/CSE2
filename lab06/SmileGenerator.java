//Ryan Hughes
//26/2/15
//CSE002
//Program that outputs smile faces

public class SmileGenerator {//declares the class
    public static void main(String[]args) {//declares the main method to be used
        
        for (int y = 0; y < 5; y++) {//prints out a smiley while the integer y is less than 5
            System.out.print(":)");
        }
        
        System.out.println(" ");//jumps to a new line
        
        int x = 0;//declares the int x
        while (x < 5) {//while x is less than 5 it will keep printing smileys
            System.out.print(":)");
            x++;//adds one to x
        }
        
        System.out.println(" ");//jumps to a new line
        
        int z = 0;//declares the int z
        
        do {
            System.out.print(":)");//prints out smileys
            z++;//adds one to z
        }
        while(z < 5);//performs this loop while z is less than 5
        
        System.out.println(" ");//jumps to a new line
        
        int a = (int) (Math.random() * 100);//creates a random number between 1 - 100
        int b = 0;//declares the int b
        
        
        while (b < a){//while b is less than a the loop will keep running
            
            System.out.print(":)");//prints out a smiley
            b++;//adds one to b
            while  (b == 30 || b == 60 || b == 90) {//when the line gets to a multiple of 30 the program will start a new line
                System.out.println(" ");//this is the new line starting
                b++;//adds one to b
            }
           
        }
        int c = 1;//declares int c
        int d = 0;//declares int d
        while (c < 10) {//while c is less than 10 the loop runs
            while (d < c) {//a new loop runs when d is less than c
            System.out.print(":)");//prints out a smiley
            d++;//adds one to d
        } 
        System.out.println(" ");//jumps to a new line
        c++;//adds one to c
        d = 0;//sets d equal to 0
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}