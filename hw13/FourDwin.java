//Ryan Hughes
//5/1/15
//CSE002
//A program that manipulates a four dimensional array

//                  UNABLE TO FINISH DUE TO PRIORITIZING FINAL EXAM STUDYING

import java.util.Scanner;
import java.util.Random;
    public class FourDwin{
        public static void main(String [] args){
            
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            
            System.out.println("Please enter an X and Y value where Y is greater than X: ");
            
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            while(x >= y || x < 0 || y < 0){
                System.out.println("That is an invalid input, try again: ");
                x = scan.nextInt();
                y = scan.nextInt();
            }
            
            double[][][][] list = new double[3][][][];
            
            
            
            for(int i = 0; i < 3; i++){
                list[i] = new double[rand.nextInt(y - x) + x][][];
                for(int j = 0; j < list[i].length; j++){
                    list[i][j] = new double[rand.nextInt(y - x) + x][];
                    for(int k = 0; k < list[i][j].length; k++){
                        list[i][j][k] = new double[rand.nextInt(y - x) + x];
                    }
                }
            }
            
            list = fill(list);
            
            print(list);
            
        }
    
    
    
    
    
    
    
    
        public static double[][][][] fill(double[][][][] list){
            
            Random rand = new Random();
            int i = 0;
            int j = 0;
            int k = 0;
            int l = 0;
            
            for(i = 0; i < 3; i++){
                list[i][j][k][l] = (rand.nextDouble() * 30.0);
                for(j = 0; j < list[i].length; j++){
                    list[i][j][k][l] = rand.nextDouble() * 30.0;
                    for(k = 0; k < list[i][j].length; k++){
                        list[i][j][k][l] = rand.nextDouble() * 30.0;
                        for(l = 0; l < list[i][j][k].length; l++){
                            list[i][j][k][l] = rand.nextDouble() * 30.0;
                        }
                    }
                }
            }
            
            return list;
            
        }
        
        
        public static void print(double[][][][] list){
            
            int i = 0;
            int j = 0;
            int k = 0;
            int l = 0;
            
            for(i = 0; i < 3; i++){
                
                for(j = 0; j < list[i].length; j++){
                    
                    for(k = 0; k < list[i][j].length; k++){
                        
                        for(l = 0; l < list[i][j][k].length; l++){
                            System.out.print("{" + list[i][j][k][l] + "} ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            
            
        }
        
        
        
        
    }