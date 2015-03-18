//Ryan Hughes
//03/12/15
//CSE002
//program that prints a wave of digits with the size depending on an input

import java.util.Scanner; //imports the scanner
    public class waves {//declares the class
        public static void main(String [] args){//declares the main method to be used
            
            Scanner myScanner = new Scanner(System.in);//declares and initialises the scanner
            int x = 0;//declares and initialises the variables that are to be used
            int y = 0;
            int m = 1;
            int t = 0;
            int n = 0;
            int b = 0;
            int c = 0;
            
            System.out.println("Enter an integer between 1 and 30: ");//asks the user for an input
            
            if(myScanner.hasNextInt()){//checks to make sure an integer is input
                x = myScanner.nextInt();//sets the input equal to x
            }
            else {
                System.out.println("Incorrect input");//if an incorrect input was added then the program quits
                return;
            }
            
            if (x < 1 || x > 30){//checks if the input was between 1 and 30
                System.out.println("Incorrect input");//if an incorrect input was added then the program quits
                return;
            }
            
            
            System.out.println("FOR LOOP: ");
            
            for (int i = 1; i <= x; i++){//when i is less than x this loop runs
                
                if((i % 2) == 1) {//checks if i is odd
                    
                    for(y = 0; y < i; y++) {//this runs while y is less than i
                        for(m = y; m < i; m++){//this runs while m is less than i
                            System.out.print(i);//prints out the value if i
                        }
                        if(y != (i - 1)){//this was added because an extra blank line kept getting added at the end of each run through this part of the loop, this solves the issue
                            System.out.println("");
                        }
                    }
                }
                
                else{//if i was even this part runs
                    for(y = i; y >= 0; y--) {//this runs while y is greater than or equal to 0 and decrements y
                        for(m = y; m < i; m++){//this runs while m is less than i and increments m
                            System.out.print(i);//prints out i
                        }
                        System.out.println("");//goes to the next line
                    
                }
            }
        }
            
            System.out.println("");//goes to the next line
            System.out.println("WHILE LOOP: ");
            int g = 1;//declares g equal to 1
            
            while(g <= x){//while g is less than or equal to x
                
                if((g % 2) == 1) {//checks if g is odd then runs this part of the code
                    t = 0;//sets t to 0
                    
                    while(t<g){//runs while t is less than g
                        n = t;//sets n equal to t
                        while(n < g){//while n is less than g this runs
                            System.out.print(g);//prints out the value of g
                            n++;//increments n
                        }
                        if(t != (g)){//this solves the problem of an extra blank line being printed
                            System.out.println("");
                        }
                            t++;//increments t
                    
                }
            }
            
            else {
                t = g;//sets t equal to g
                while(t > 0){//runs while t is greater than 0
                    t--;//decrements t
                    n = t;//sets n equal to t
                    while(n < g){//runs while n is less than g
                        System.out.print(g);//prints the value of g
                        n++;//increments n
                    }
                    
                    
                    System.out.println("");//goes to the next line
                }
                
            }
            g++;//increments g
            }
            
            System.out.println("");
            System.out.println("DO-WHILE LOOP:");
            
            int a = 1;//initialises the integer a and sets equal to 1
            
            do{
                
                if((a % 2) == 1) {//if a is odd this runs
                    b = 0;//sets b to 0
                    
                    do{
                        c = b;//sets c equal to b
                        do{
                            System.out.print(a);//prints out the value of a
                            c++;//increments c
                        } while(c < a);//runs the code while c is less than a
                        if(b != (a)){//solves the problem of an extra line being printed
                            System.out.println("");
                        }
                            b++;//increments b
                    
                } while(b<a);//runs the previous loop while b is less than a
            }
            
            else {//if a is even this part runs
                b = a;//sets b equal to a
                do{
                    b--;//decrements b
                    c = b;//sets c equal to b
                    do{
                        System.out.print(a);//prints out the value of a
                        c++;//increments a
                    } while(c < a);//runs the loop while c is less than a
                    
                    
                    System.out.println("");//goes to the next line
                } while(b > 0);//runs the loop while b is gretater than 0
                
            }
            a++;//incrments a
            }
             while(a <= x);//runs the entire loop while a is less than or equal to x
            
            
         }
    }
    