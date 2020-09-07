import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        


        /*
         *  your code goes here
         */
        int deltaH;
        int deltaM;
        int deltaS;
        int secsDeltaH;
        int secsDeltaM;
        int totalSecs; 

        deltaH = hours2 - hours1;
        deltaM = minutes2 - minutes1;
        deltaS = seconds2 - seconds1;
        secsDeltaH = deltaH * 3600;
        secsDeltaM = deltaM * 60;
        totalSecs = secsDeltaH + secsDeltaM + deltaS;
        System.out.print(totalSecs);

        // closing the scanner object
        scanner.close();
    }
}
