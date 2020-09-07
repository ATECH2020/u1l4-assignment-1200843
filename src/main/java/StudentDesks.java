import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt(); 
        /*
         *  your code goes here
         */
          int desk1 = (class1 / 2) + class1 % 2;
          int desk2 = (class2 / 2) + class2 % 2;
          int desk3 = (class3 / 2) + class3 % 2;
          int totalDesk = desk1 + desk2 + desk3; 

          System.out.println ("In total, " + totalDesk + " desks are needed");

        // closing the scanner object
        scanner.close();
    }
}
