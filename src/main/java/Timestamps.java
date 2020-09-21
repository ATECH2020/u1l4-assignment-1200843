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
        int varHours;
        int varMins;
        int varSecs;
        int numSecInHours;
        int numSecInMins; 
        int secInSecs;
        /*
         *  your code goes here
         */
 

        varHours = hours2 - hours1;
        varMins = minutes2 - minutes1;
        varSecs = seconds2 - seconds1;

        numSecInHours = varHours * 60 * 60;
        numSecInMins = varMins * 60;
        secInSecs = varSecs;

        System.out.print(numSecInHours + numSecInMins + secInSecs);
        // closing the scanner object
        scanner.close();
    }
}