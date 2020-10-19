package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Number: ");
    int n = input.nextInt();
    
    int countP = 0;
    int countN = 0;
    double average;
    double sum = 0;
    while (n != 0)
      {
       if (n > 0)
        {
        countP++;
        }
        else
        {
        countN++;  
        }
        sum = n + sum;
        System.out.print("Number: ");
        n = input.nextInt();  
      }
      average = sum / (countP + countN);
      
      System.out.println("Positive numbers: " + countP);
      System.out.println("Negative numbers: " + countN);
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average); 
    }

}