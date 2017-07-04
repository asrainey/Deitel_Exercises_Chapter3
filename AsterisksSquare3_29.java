// Exercise 3.29 - AsterisksSquare3_29.java
// Write a program that prompts the user to enter the side of a square (1-20)
// The program displays a hollow square of that size made of asterisks

import java.util.Scanner;

public class AsterisksSquare3_29
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int side;
    int counter = 1;

    System.out.print("Please enter a value between 1 and 20 for the side of a square: ");
      side = input.nextInt();

    if(side > 20 || side < 1)
      System.out.print("That is not between 1 and 20. Please enter a new number: ");

    // display the top of the square in *
    for(counter = 1; counter < side; counter++)
    {
      System.out.print("* ");
    }
    System.out.println("*");

    // display the two sides of the square
    counter = 1;
    while (counter <= (side - 2))
    {
      System.out.print("*");

      for(int k = 1; k <= ((side * 2)-3); k++)
      {
        System.out.print(" ");
      }
      System.out.println("*");
      counter++;
    }

    // display the bottom of the square in *
    for(counter = 1; counter < side; counter++)
    {
      System.out.print("* ");
    }
    System.out.println("*");

  }
}
