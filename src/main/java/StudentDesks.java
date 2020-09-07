import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int students1 = scanner.nextInt();
        int students2 = scanner.nextInt();
        int students3 = scanner.nextInt();

        /*
         *  your code goes here
         */
          int totalStu;
          int totalDesks;
          totalDesks = ((students1 / 2) + (students1 % 2)) + ((students2 / 2) + (students2 % 2)) + ((students3 / 2) + (students3 % 2));
          System.out.print(totalDesks);

        // closing the scanner object
        scanner.close();
    }
}
