package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Angle: ");
        int a = input.nextInt();
        char l = input.next().charAt(0); 
        float g;
        float r;
          while (a > 0) 
          {
            if (l == 'g')
            {
              System.out.println("Angle: " + (a * Math.PI) /180 + " " + 'r');
            }
            else
            {
              System.out.println("Angle: " + (a * 180) / Math.PI + " " + 'g');
            }
            System.out.print("Angle: ");
            a = input.nextInt();  
          }
    }

}