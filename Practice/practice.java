
public class practice {
    public static void main (String [] args) {
        char b = 'b';
        for (int i = 1; i < 4; i++){
            for (int j = i+1; j>0; j--){
                for(int k = i+1; k>0; k--){
                    System.out.print(b);
                }
                System.out.println();
            }
        }
    }
}