//Ryan Hughes
//3/3/15
//CSE002
//Program that outputs symbols based on a randomly generated number

public class MakeSymbols {//declares the class
    public static void main(String [] args) {//declares the main method to be used
        int x = (int) (Math.random()*100);//generates a random number between 0 and 100
        int y = 0;//declares the integer y to be 0
        
        System.out.println("Random number generated: " + x);//prints the number generated
           
           if((x % 2) == 0) { //if x is even then this loop is run
            do {
                System.out.print("*");//prints out the character
                y++;//adds one to y
            }
            while(y < x);//performs the loop while y is less than x
           }
        
            else{ //otherwise this loop is run
                
            do {
                System.out.print("&");//prints out the character
                y++;//adds one to y
            }
            while(y < x);//performs this loop while y is less than x
           }
        
        
        
    }
}