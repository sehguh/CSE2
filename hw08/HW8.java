//Ryan Hughes
//03//22/15
//CSE002
//Program that allows the user to play a game
import java.util.Scanner;
import java.util.Random;
    public class HW8 {
        public static void main(String[] args) {
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
        
        public static String getInput(Scanner scan, String string) {
            String input = scan.next();
            
            if(!input.equals("C") && !input.equals("c")) {
                System.out.println("Yeah Right Loser!");
                System.exit(0);
            }
            return input;
        }    
        
        public static String getInput(Scanner scan, String string, int trial) {
            
           int g = 0;
           int t = 0;
           String input = "r";
           Random rand = new Random();
           
           
           while(t < 10){
                if(g != 0) {
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                }
                    input = scan.next();
                if(!input.equals("A") && !input.equals("a") && !input.equals("E") && !input.equals("e")) {
                    System.out.println("Executed by the GIANT! GAME OVER!");
                    System.exit(0);
                    }
                    
                    if(input.equals("a") || input.equals("A")) {
                        int x = rand.nextInt(2);
                            if(x == 0){
                                System.out.println("Critical hit!");
                                t++;
                                g++;
                            } else {
                                System.out.println("How can you miss!?");
                                g++;
                                continue;
                                
                            }
                        } else {
                            int y = rand.nextInt(11);
                            if(y == 10){
                                System.out.println("You have escaped successfully!");
                                System.exit(0);
                            } else {
                                System.out.println("You failed to escape");
                                continue;
                            }
                        }   
                
           }
           System.out.println("YOU HAVE SLAIN THE GIANT!");
           
           return input;
        }
        
        public static String getInput(Scanner scan) {
            String input = "r";
            String z = scan.next();
            switch(z) {
                case "1": 
                    System.out.println("You have been given a never ending supply of AA batteries");
                    break;
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
            return input;
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
