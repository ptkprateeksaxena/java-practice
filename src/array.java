public class array {
    public static void main(String[] args) {

        String[] Name = new String[5];
        Name[0] = "Prateek";
        Name[1] = "Raghav";
        Name[2] = "Ram";
        Name[3] = "Ajay";
        Name[4] = "Aman";

        System.out.println(Name[2]);

        int[] Age = {25, 54, 75, 85, 98};

        System.out.println(Age[2]);
        Age[2] = 22;
        System.out.println(Age[2]);

        for (int i = 0; i < Name.length; i++) {
            System.out.print(Name[i]+" ");
//            System.out.println();
            System.out.print(Age[i]+" ");
        }
    }
}
