//factoorial
public class practice {
    public static void main(String[] args){
        int fact = 1;
        int n = 4;
        while(n>1) {
            fact *= n;
            n -= 1;
        }
    System.out.println(fact);
    }
}
