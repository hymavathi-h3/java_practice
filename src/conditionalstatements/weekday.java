package conditionalstatements;

import java.util.Scanner;

public class weekday {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a day  name: ");
    String day = scanner.next();

    if(day.equals("monday") || day.equals("tuesday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday")) {
      System.out.println("Weekday");
    } else if (day.equals("saturday") || day.equals("sunday")) {
      System.out.println("Weekend");
    } else {
      System.out.println("Invalid input. Enter a number between 1 and 7.");
    }

    scanner.close();
  }
}