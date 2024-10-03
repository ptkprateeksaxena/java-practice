public class ifelse2 {
    public static void main(String[] args) {

//        Find largest of three number

        int numb1 = 75;
        int numb2 = 95;
        int numb3 = 45;

        if (numb1>numb2 && numb1>numb3){
            System.out.println("the largest Number "+numb1);
        }else if (numb3>numb1 && numb3>numb1){
            System.out.println("the largest number " +numb3);
        }else {
            System.out.println("the largest number is " +numb2);
        }

    }
}
