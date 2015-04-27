//Ryan Hughes
//04/24/15
//CSE002
//Program that creates a multidimensional array then maipulates and sorts it

import java.util.Random;
    public class sorting{
        public static void main(String [] args){
            Random rand = new Random();
            int[][] first = new int[5][];
            
            for(int a = 0; a < 5; a++){
                first[a] = new int[a*3 + 5];
            }
            
            for(int i = 1; i <= 5; i++){
                for(int j = 0; j < ((i-1)*3 + 5); j++){
                    first[i - 1][j] = rand.nextInt(39);
                }
            }
            
            System.out.println("The array before sorting: ");
            
            for(int k = 0; k < 5; k++){
                for(int l = 0; l < k*3 + 5; l++){
                    System.out.print(first[k][l] + " ");
                }
                System.out.println();
            }
            
            int temp = 0;
            int min = 50;
            
            for(int b = 0; b < 5; b++){
                for(int d = 0; d < b*3 + 5; d++){
                    for(int c = 0; c < b*3 + 5; c++){
                        if(first[b][c] < min){
                            temp = first[b][c];
                            first[b][c] = first[b][d];
                            first[b][d] = temp;
                        
                    }
                }
            }
            }
            
            System.out.println("The array after sorting: ");
            
            for(int e = 0; e < 5; e++){
                for(int f = 0; f < e*3 + 5; f++){
                    System.out.print(first[e][f] + " ");
                }
                System.out.println();
            }
            
            
            
        }
    }