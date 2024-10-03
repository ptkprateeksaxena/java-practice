import java.util.Scanner;

public class ifelse3 {
    public static void main(String[] args) {

        System.out.println("Enter the marks ");
        Scanner obj = new Scanner(System.in);

        int marks = obj.nextInt();

        char grade;
        if (marks>=90){
            grade = 'A';
//            System.out.println("grade "+ grade);
        } else if (marks>=80) {
            grade = 'B';
//            System.out.println("grade "+ grade);
        } else if (marks>=70) {
            grade = 'C';
//            System.out.println("grade "+ grade);
        }else if (marks>=60){
            grade = 'D';
//            System.out.println("grade "+ grade);
        }else if (marks>=50){
            grade = 'E';
//            System.out.println("grade "+ grade);
        }else {
            grade = 'F';
//            System.out.println("Fail "+ grade);
        }System.out.println("Grade "+grade);
    }
    }

