import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the number ");

        int num = sr.nextInt(); //123
        int firstNumber = num%10; //3
        int rem = num/10;

        int secondNumber = rem%10;
        int r = rem/10;

        int thirdNumber = r;

        int sum = firstNumber+secondNumber+thirdNumber;
        System.out.println(sum);

        }
    }

