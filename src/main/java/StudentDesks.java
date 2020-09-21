import java.util.Scanner;

class StudentDesks {
  public static void main(String[] args) {

    // Creates a new scanner for user input
    Scanner scanner = new Scanner(System.in);

    // Reads ints from user
    int class1 = scanner.nextInt();
    int class2 = scanner.nextInt();
    int class3 = scanner.nextInt();
    int desk1;
    int desk2;
    int desk3;
    /*
     * your code goes here
     */
    if (class1 % 2 == 0) {
      desk1 = class1 / 2;
    } else {
      desk1 = (class1 / 2) + 1;
    }

    if (class2 % 2 == 0) {
      desk2 = class2 / 2;
    } else {
      desk2 = (class2 / 2) + 1;
    }

    if (class3 % 2 == 0) {
      desk3 = class3 / 2;
    } else {
      desk3 = (class3 / 2) + 1;
    }

    System.out.print(desk1 + desk2 + desk3);
    // closing the scanner object
    scanner.close();
  }
}
