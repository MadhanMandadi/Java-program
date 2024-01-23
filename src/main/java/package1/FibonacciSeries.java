package package1;

public class FibonacciSeries {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;

        for(int n=0; n<10; n++) {
            System.out.print(i+" ");
            int o=i+j;
            i=j;
            j=o;
        }
    }
}
