import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //initializing the constants
        int n=100, t1=0,t2=1;
        System.out.print("upto "+ n +": ");
        //while loop to calculate fibonacci series up to n numbers
        while(t1 <= n){
            System.out.print(t1 +" + ");
            int sum = t1+t2;
            t1 = t2;
            t2 = sum;
        }

    }
}