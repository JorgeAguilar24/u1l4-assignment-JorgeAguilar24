import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourHand = scanner.nextInt();
        int hours;
        int degreesPast;
        int minutesPast;
        int minuteHandDegrees;
        /*
         *  your code goes here
         */
            hours = hourHand / 30;
            degreesPast = hours * 30;
            minutesPast = hourHand - degreesPast;
            minuteHandDegrees = (30 - minutesPast) * 6;
            System.out.print(minuteHandDegrees);
        // closing the scanner object
        scanner.close();
    }
}
