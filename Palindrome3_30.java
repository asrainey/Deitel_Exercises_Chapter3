// Exercise 3.30 - Palindrome3_30.java
// This program asks the user for a 5 digit integer
// and determines if the number is a palindrome.
// The user gets an error message if the number isn't 5 digits.

import java.util.Scanner;

public class Palindrome3_30
  {
    public static void main(String [] args)
    {
      Scanner input = new Scanner(System.in);

      int number;
      int digit1, digit2, digit3, digit4, digit5;

      System.out.println("Please enter a number consisting of five digits: ");
      number = input.nextInt();

      while(number / 100000 > 0 || number / 10000 == 0)
      {
        if(number / 100000 > 0)
        {
          System.out.println("This number is too long");
          System.out.println("Please enter a number consisting of five digits: ");
          number = input.nextInt();
        }

        if (number / 10000 == 0)
        {
          System.out.println("This number is too small");
          System.out.println("Please enter a number consisting of five digits: ");
          number = input.nextInt();
        }
      }

      int displayNumber = number;

      // Do the math to isolate each digit.
      digit1 = number / 10000;
      number = number - (digit1 * 10000);
      digit2 = number / 1000;
      number = number - (digit2 * 1000);
      digit3 = number / 100;
      number = number - (digit3 * 100);
      digit4 = number / 10;
      digit5 = number % 10;

      if(digit1 == digit5 && digit2 == digit4)
      {
        System.out.printf("%d is a palindrome\n", displayNumber);
      }
      else
      {
        System.out.printf("%d is not a palindrome\n", displayNumber);
      }
    }
  }
