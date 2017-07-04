// Exercise 3.21: LargestNumber3_21.java
// Find the Largest Number
// Input a series of 10 integers
// Determine and print the largest integer
import java.util.Scanner;

public class LargestNumber3_21
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int counter = 0;
    int number = 0;
    int largestNumber;

    System.out.print("Please enter a number: ");
      largestNumber = input.nextInt();

    while(counter < 10)
    {
      if(number > largestNumber)
        {
          largestNumber = number;
        }

      counter++;

      System.out.print("Please enter a number: ");
        number = input.nextInt();
    }

    System.out.printf("The largest number is %d\n", largestNumber);
  }
}
