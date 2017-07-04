// Deitel Chapter 3, Exercise 3.17
// This program asks the user for miles drive and gallons used
// It calculates and displays the miles per gallon for each trip
// It prints the combined miles per gallon for trips up to this point

import java.util.Scanner;

public class GasMileage3_17
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);

    // initialization phase
    int totalMiles = 0;
    int totalGallons = 0;

    // processing phase
    System.out.print("Enter trip mileage or -1 to quit\n");
    int miles = input.nextInt();

    while(miles != -1)
    {
      System.out.print("Enter gallons used on this trip\n");
      int gallons = input.nextInt();

      totalMiles += miles;
      totalGallons += gallons;

      double milesPerGallon = (double) miles / gallons;
      System.out.printf("Your gas mileage for this trip is %.2f%n", milesPerGallon);

      double totalMilesPerGallon = (double) totalMiles / totalGallons;
      System.out.printf("Your overall gas mileage is %.2f%n", totalMilesPerGallon);

      System.out.print("Enter trip mileage or -1 to quit\n");
      miles = input.nextInt();
  }
  }
}
