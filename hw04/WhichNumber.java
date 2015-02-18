//Ryan Hughes
//02/17/15
//CSE002
//Program that guesses the users number based on questions asked to the user

import java.util.Scanner; //imports the scanner
    public class WhichNumber { //declares the class
        public static void main(String [] args) {//declares the main method to be used
            
            
            System.out.println("Please think of an integer between 1 and 10");//asks the user to think of a number
            
            Scanner myScanner;//declares the scanner
            myScanner = new Scanner(System.in);
            
            
            char even;//declares the chars to be used throughout the program
            char div3;
            char div4;
            char div4great1;
            char div5;
            char div3n;
            char div3great1;
            char great6;
            char less3;
            
            String yes = "y";//decalres the strings to be used as answers
            String no = "n";
            
            System.out.println("Is your number even?");//asks the user if their number is even
            even = myScanner.next().charAt(0);//declares the variable equal to their answer
            
            
            if (even == 'Y' || even == 'y') {//depending on the users answer the program goes either to here or to line 81
                System.out.println("Is it divisible by 3?");//asks is their number is divisible by 3
                div3 = myScanner.next().charAt(0);//sets the variable equal to their answer
            
                    if (div3 == 'Y' || div3 == 'y') {//if they answered yes then it prints that their number was 6 and returns 
                        System.out.println("Your number is 6");
                        return;
                    }
                else
                if (div3 == 'N' || div3 == 'n') {//if their answer was no the program continues
                    System.out.println("Is it divisible by 4?");//asks the user if its divisible by 4
                    div4 = myScanner.next().charAt(0);//sets the variable equal to their answer
                    
                    if (div4 == 'Y' || div4 == 'y') {//if they answered yes the program continus from here
                        System.out.println("When divided by 4 is it greater than 1?");//asks if their number is greater than 1 when divided by 4
                        div4great1 = myScanner.next().charAt(0);//sets the variable equal to their answer
                        
                            if (div4great1 == 'Y' || div4great1 == 'y') {//if they answered yes the program continues from here
                                System.out.println("Your number is 8");//prints the users number
                                return;//ends the program
                            }
                            
                        else
                            if (div4great1 == 'N' || div4great1 == 'n') {//if they answered no the program continues from here
                            System.out.println("Your number is 4");//and prints that their number was 4
                            return;//ends the program
                            }
                            
                        else
                            if (div4 == 'N' || div4 == 'n') {//if line 47 was no the program continues from here
                                System.out.println("Is it divisible by 5?");//asks if their number is divisible by 5
                                div5 = myScanner.next().charAt(0);//sets the variable equal to their answer
                                
                                if (div5 == 'Y' || div5 == 'y') {//if they answered yes the program continues here and prints their number
                                    System.out.println("Your number is 10");
                                    return;//the program ends
                                }
                            else
                                if (div5 == 'N' || div5 == 'n') {//if they answered no the program continues here
                                    System.out.println("Your number is 2");//prints the users number
                                    return;//ends the program
                                }
                            }
                    }
                }
            }
            
            else
                if (even == 'N' || even == 'n') {//if the first questions answer was no the program continues from here
                    System.out.println("Is it divisible by 3?");//asks the user if it is divisible by 3
                    div3n = myScanner.next().charAt(0);//sets the variable equal to their answer
                    
                        if (div3n == 'Y' || div3n == 'y') {//if yes the program continues here
                            System.out.println("When divided by 3 is the result greater than 1?");//asks the user if the result is greater than 1 when divided by 3
                            div3great1 = myScanner.next().charAt(0);//sets the variable equal to their answer
                            
                                if (div3great1 == 'Y' || div3great1 == 'y') {//if yes the program continues from here
                                    System.out.println("Your number is 9");//prints out the users number
                                    return;//ends the program
                                }
                            else
                                if (div3great1 == 'N' || div3great1 == 'n') {//if no the program continues from here
                                    System.out.println("Your number is 3");//prints the users number
                                    return;//ends the program
                                }
                        }
                    else
                        if (div3n == 'N' || div3n == 'n') {//if line 86 answer was no then the program continues from here
                            System.out.println("Is it greater than 6?");//asks the user if it is greater than 6
                            great6 = myScanner.next().charAt(0);//sets the variable equal to their answer
                            
                                if (great6 == 'Y' || great6 == 'y') {//if yes the program continues from here
                                    System.out.println("Your number is 7");//prints the users number
                                    return;//ends the program
                                }
                            else
                                if (great6 == 'N' || great6 == 'n') {//if no the program continues from here
                                    System.out.println("Is it less than 3?");//asks the user if it is less than 3
                                    less3 = myScanner.next().charAt(0);//sets the variable equal to their answer
                                    
                                    if (less3 == 'Y' || less3 == 'y') {//if the users number is less than 3 the program continues here
                                        System.out.println("Your number is 1");//prints the users number
                                        return;//ends the program
                                    }
                                else
                                    if (less3 == 'N' || less3 == 'n') {//if no then the program continues here
                                        System.out.println("Your number is 5");//prints the users number
                                        return;//ends the program
                                    }
                                }
                        }
                    }
                }
        }
    
                                
                        
                
                                
                        
                        
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                     