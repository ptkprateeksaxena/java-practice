import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the number");
        int year = sr.nextInt();

        if (year%100!=0 && year%4==0) {
            System.out.println("it's a leap year");
        }else {
            System.out.println("Not leap year");
        }
    }
}
