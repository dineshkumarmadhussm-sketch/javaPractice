package breakAndContinue;

import java.util.Scanner;

public class squarePattern {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of number  for square  pattern");
     int row = sc.nextInt();
       for (int i = 1; i <= row; i++) {
           for (int j = 1; j <= row; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
