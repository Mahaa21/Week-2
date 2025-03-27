public class pattern1 {
    public static void main(String[] args){
        int rows = 5;
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");  // Fixed here
            }
            System.out.println();      // Moves to next line after each row
        }
    }
}
