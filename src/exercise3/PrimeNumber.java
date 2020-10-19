package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Number: ");
    int n = input.nextInt(); 
    boolean prime = true;
    if (n > 2) 
    {
      for (int d = 2; d !=(n - 1); ++d) 
      {
        if (n % d == 0)
        {
        prime = false;
        break;  
        }
      }
      System.out.print("Prime number: " + prime);
    }
    else 
    {
    System.out.print("Invalid number!");
    }
    }

}