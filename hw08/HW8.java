//Ryan Hughes
//03//22/15
//CSE002
//Program that allows the user to play a game
import java.util.Scanner;//imports the scanner
import java.util.Random;//imports the random function
    public class HW8 {//declares the class
        public static void main(String[] args) {//declares this as the main method
            char option;
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            String input = getInput(scan, "Cc");
            System.out.println("You are in a dead valley.");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You walked and walked and walked and you saw a cave!");
            cave();
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You entered a cave!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("Unfortunately, you ran into a GIANT!");
            giant();
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
            input = getInput(scan, "AaEe", 10);
            System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
            System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
            box();
            input = getInput(scan);
            System.out.println("Hero! Have a good day!");
        }
        
        public static String getInput(Scanner scan, String string) {//this method determines whether the user wants to continue
            String input = scan.next();//declares and initializes a scanner
            
            if(!input.equals("C") && !input.equals("c")) {//if the user has given incorrect input the the program exits
                System.out.println("Yeah Right Loser!");
                System.exit(0);//the program exits
            }
            return input;//returns to the main method
        }    
        
        public static String getInput(Scanner scan, String string, int trial) {//this method simulates the battle with the giant
            
           int g = 0;//declares and initializes integers to be used later
           int t = 0;
           String input = "r";
           Random rand = new Random();//declares a random variable
           
           
           while(t < 10){//while loop to keep track of the number of crits on the giant
                if(g != 0) {//this allows the user to have the question repeated to them and doesnt say it twice the forst time the method is called
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");//asks the user for input
                }
                    input = scan.next();//the next input will be equal to the input
                if(!input.equals("A") && !input.equals("a") && !input.equals("E") && !input.equals("e")) {//checks to make sure Aa Ee was input
                    System.out.println("Executed by the GIANT! GAME OVER!");//if not the game ends
                    System.exit(0);//the program quits
                    }
                    
                    if(input.equals("a") || input.equals("A")) {//this is the code for the attack move
                        int x = rand.nextInt(2);//generates a random number between 0 and 1
                            if(x == 0){//if x is 0 this runs
                                System.out.println("Critical hit!");
                                t++;//increments t
                                g++;//increments g
                            } else {
                                System.out.println("How can you miss!?");//if  the other number is print then a miss is had
                                g++;//increments g
                                continue;//continues to the top of the loop
                                
                            }
                        } else {
                            int y = rand.nextInt(11);//generates a random number between 1 and 10
                            if(y == 10){
                                System.out.println("You have escaped successfully!");//only if it is 10 can you escae successfully
                                System.exit(0);//the program ends
                            } else {
                                System.out.println("You failed to escape");
                                continue;//otherwise the loop starts again at the top
                            }
                        }   
                
           }
           System.out.println("YOU HAVE SLAIN THE GIANT!");
           
           return input;//returns to the main method
        }
        
        public static String getInput(Scanner scan) {//this method determines the final prize
            String input = "r";//declares a string
            String z = scan.next();
            switch(z) {//starts a switch statement
                case "1": 
                    System.out.println("You have been given a never ending supply of AA batteries");//if z is 1 this is printed
                    break;//ends the switch statement
                case "2": 
                    System.out.println("You have received a flashlight that only works in the presence of sunlight");
                    break;
                case "3":
                    System.out.println("You have received a scroll containing the meaning of life... on it you vaguely can see two numbers,,, a 4 and a 2");
                    break;
                default:
                    System.out.println("You chose a wrong number, you get nothing, now go and start again :p");
                    break;
            }
            return input;//returns to the main method
        }
        
         
         
         public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\ |                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
         
         public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
        public static void box(){
        System.out.println("                     *********************     *********************    *********************               "); 
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
         
         
}
