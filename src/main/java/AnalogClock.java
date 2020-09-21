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
          int finalDeg = minGB * 2;
          finalDeg = finalDeg * 6;
          System.out.print(finalDeg);

        // closing the scanner object
        scanner.close();
    }
}
