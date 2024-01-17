package package1;

public class ReverseExample {
    public static void main(String[] args) {
        int i = 12345;
        int divisor = 10;
        int quotient = 1;
        int remainder = 0;
        int output = 0;
        while(quotient!=0) {
            quotient = i/10;
            remainder = i%10;
            output = output*10 + remainder;
            i=quotient;
        }
        System.out.println(output);
    }
}
