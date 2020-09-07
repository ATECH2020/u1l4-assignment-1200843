import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourHand = scanner.nextInt();

        /*
         *  your code goes here
         */
         int hours = hourHand / 30; 
         int degGB = hours * 30;
         int minGB = hourHand - degGB;
         int minHandGB = (30 - minGB) * 6;
         System.out.print(minHandGB);
        // closing the scanner object
        scanner.close();
    }
}
