package exercise3;

import java.util.Scanner;

public class NamePrinter{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Name: ");
  String name = input.nextLine();
  int i = 0;
  char type;
    for (; i < name.length(); i++)
    {
      type = name.charAt(i);
      System.out.println("* " + type + " *");
    }
  }
}