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
            
                for (int v=0; v<first.length; v++){
            for (int u=0; u<first[v].length- 1; u++){
                int currentMin=first[v][u];
                int currentMinIndex1=v;
                int currentMinIndex2=u;
                for (int j=1+u; j<first[v].length; j++){
                    if (currentMin>first[v][j]){
                        currentMin=first[v][j];
                        currentMinIndex1=v;
                        currentMinIndex2=j;
                    }
                }
                if (currentMinIndex1!= v || currentMinIndex2!=u){
                    first[currentMinIndex1][currentMinIndex2]=first[v][u];
                    first[v][u]=currentMin;
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
            
            
            System.out.println("The array after sorting and copying");
            
            int x = 0;
            
            int[][]second = new int[5][17];
            
            for(x = 0; x < 5; x++){
                for(int y = 0; y < 17; y++){
                    if(y < (x*3 + 5)){
                        second[x][y] = first[x][y];
                    }else{
                        second[x][y] = 0;
                    }
                }
            }
            
            
            for(int z = 0; z < 5; z++){
                for(int w = 0; w < 17; w++){
                    System.out.print(second[z][w] + " ");
                }
                System.out.println();
            }
        }
    }