import java.util.Scanner;

/**
 * The HelloWorld program implements an application that
 * simply displays log number question to the standard output.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2022-10-23
 */

class LogNumber {
  public static void main(String[] args) {
    double logNumber = -1;
    int carWeight = 1100;
    int weightMetre = 20;
    double option1 = 0.25;
    double option2 = 0.5;
    int option3 = 1;
    String logLength = "";
    Scanner myObj = new Scanner(System.in);
    System.out.println("There are three types of log length, 0.25m, 0.5m"
                    + " and 1m.");
    System.out.print("Which type of length do you want to choose?(Enter "
                    + "number): ");
    logLength = myObj.next() + myObj.nextLine();

    if (logLength.equals("0.25")) {
      logNumber = carWeight / weightMetre / option1;
    } else if (logLength.equals("0.5")) {
      logNumber = carWeight / weightMetre / option2;
    } else if (logLength.equals("1")) {
      logNumber = carWeight / weightMetre / option3;
    } else {
      System.out.println("\nPlease choose a type!");
    }

    if (logLength.equals("0.25") || logLength.equals("0.5")
                    || logLength.equals("1")) {
      System.out.println("\n" + logNumber + " logs need to be placed on "
                      + "the truck.");
    } else {
      System.out.println("\nPlease choose a type in options!");
    }
    System.out.println("\nDone.");
  }
}
