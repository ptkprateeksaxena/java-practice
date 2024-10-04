public class count {
    public static void main(String[] args) {

        int n =678779;
        //Here we gonna count occurance of 7
        int count =0;
        while(n>0) {
            int rem= n%10;//9,7,7,8,7,6
            if(rem==7) {
                count++;//0,1,2,3
            }
            n=n/10;//67877,6787,678,67,6,0
        }
        System.out.println(count);

    }
}
