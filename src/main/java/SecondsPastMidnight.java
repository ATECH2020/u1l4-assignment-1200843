import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int numSec = scanner.nextInt();

        //Your code goes here
        int mins;
        int hours;
        mins = numSec/60;
        hours = mins/60;
        System.out.print(hours + " " + mins + " past midnight");
 

        // closing the scanner object
        scanner.close();
    }
}