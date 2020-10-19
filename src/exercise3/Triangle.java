package exercise3;

import java.util.Scanner;

public class Triangle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("a: ");
    double a = input.nextInt();
    System.out.print("b: ");
    double b = input.nextInt();
    System.out.print("c: ");
    double c = input.nextInt();
    while (a > 0 && b > 0 && c > 0) {

      double s = (a + b + c) / 2.0;
      double x = (s * (s - a) * (s - b) * (s - c));
      double area = Math.sqrt(x);
      System.out.println("Area: " + area);
      if (a > 0 && b > 0 && c > 0 && (a + b) > c && (a + c) > b && (b + c) > a) {
        if (a == b && b == c) {
          System.out.println("Triangle: equilateral");
        } else if (a == b || b == c || a == c) {
          System.out.println("Triangle: isosceles");
        } else {
          System.out.println("Triangle: scalene");
        }
      } else
        System.out.println("Values are not correct!");
        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();
        System.out.print("c: ");
        c = input.nextInt();
    }
  }
}