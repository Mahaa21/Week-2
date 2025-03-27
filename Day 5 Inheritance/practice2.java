//fibonacci series
public class practice2 {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int count = 0;
        while (count < 10) {
            System.out.println(a + " ");
            a = b;
            b = a + b;
            count += 1;
        }
    }
}
