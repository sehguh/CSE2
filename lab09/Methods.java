//Ryan Hughes
//03/27/15
//CSE002
//Program that prints out a random gramatically correct sentence

import java.util.Scanner;//import the scanner
import java.util.Random;//import the random function
    
    public class Methods {//declare class
        
        public static void main(String [] args){//main method
            Scanner scan = new Scanner(System.in);//declare and initialize the scanner
            
            int x = 1;//declare integer to use
            
            while(true){//loop to keep printing sentences if so requested
                System.out.println("The " + adjective() + " " + noun() + " " + verb() + " the " + adjective() + " " + noun2() + ".");//calls the other methods to form a sentence
                
                System.out.println("Press 1 to get another sentence, press 2 to quit: ");//asks the user for another sentence if they want it
                x = scan.nextInt();
                if(x == 1){//ends the program of they press not 2
                    
                    continue;
                }else{
                    return;
                }
                
            }
            
            
            
        
            
        }
    
        public static String adjective(){//method for adjective
            Random rand = new Random();//declares random generator
            int x = rand.nextInt(10);//creates random number
            String y = "a";
            
            switch (x){//switch statement determines the adjective that is selected
                case 0:
                    y = "quick";
                    break;
                case 1:
                    y = "slow";
                    break;
                case 2:
                    y = "giant";
                    break;
                case 3:
                    y = "cunning";
                    break;
                case 4:
                    y = "majestic";
                    break;
                case 5:
                    y = "miniscule";
                    break;
                case 6:
                    y = "rapid";
                    break;
                case 7:
                    y = "mysterious";
                    break;
                case 8:
                    y = "depressed";
                    break;
                case 9:
                    y = "happy";
                    break;
            }
            return y;//returns the word
        }
        
        public static String noun(){//method for noun
            Random rand = new Random();
            int x = rand.nextInt(10);//generates random number
            String y = "a";
            
            switch (x){//switch to statement to determine the noun
                case 0:
                    y = "fox";
                    break;
                case 1:
                    y = "cheetah";
                    break;
                case 2:
                    y = "tiger";
                    break;
                case 3:
                    y = "kangaroo";
                    break;
                case 4:
                    y = "wolf";
                    break;
                case 5:
                    y = "gazelle";
                    break;
                case 6:
                    y = "person";
                    break;
                case 7:
                    y = "alien";
                    break;
                case 8:
                    y = "robot";
                    break;
                case 9:
                    y = "velociraptor";
                    break;
            }
            return y;//returns the noun
        }
        
        public static String verb(){//verb method
            Random rand = new Random();
            int x = rand.nextInt(10);//generates random number
            String y = "a";
            
            switch (x){//switch statement to determine the verb
                case 0:
                    y = "jumped over";
                    break;
                case 1:
                    y = "ate";
                    break;
                case 2:
                    y = "fought";
                    break;
                case 3:
                    y = "kicked";
                    break;
                case 4:
                    y = "stared at";
                    break;
                case 5:
                    y = "befriended";
                    break;
                case 6:
                    y = "inspired";
                    break;
                case 7:
                    y = "confused";
                    break;
                case 8:
                    y = "distracted";
                    break;
                case 9:
                    y = "scared";
                    break;
            }
            return y;//returns the verb
        }
        public static String noun2(){//method for the second noun
            Random rand = new Random();
            int x = rand.nextInt(10);//generates random number
            String y = "a";
            
            switch (x){//switch statement to determine the second noun
                case 0:
                    y = "tree";
                    break;
                case 1:
                    y = "cat";
                    break;
                case 2:
                    y = "donkey";
                    break;
                case 3:
                    y = "mouse";
                    break;
                case 4:
                    y = "statue";
                    break;
                case 5:
                    y = "martian";
                    break;
                case 6:
                    y = "platypus";
                    break;
                case 7:
                    y = "fish";
                    break;
                case 8:
                    y = "witch";
                    break;
                case 9:
                    y = "samurai";
                    break;
            }
            return y;//returns the noun
        }
    }