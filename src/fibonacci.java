import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of terms");
        int number = sc.nextInt();
        int first = 0;
        int second = 1;
        int next;
        System.out.println("Fibonacci series is ");
        for ( int i = 0; i<=number; i++)
        {
            System.out.println(first + "");
            next = second+first;
            first = second;
            second = next;
        }
    }
}
