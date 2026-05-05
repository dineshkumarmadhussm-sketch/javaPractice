package patternPrinting;

import java.util.Scanner;

public class rectangularPattern {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int row=sc.nextInt();
       System.out.println("Enter the number of rows for rectangular pattern");
       int col=sc.nextInt();
       System.out.println("Enter the number of columns for rectangular pattern");
       for(int i=0;i<row;i++){   //kitani lines hogi
           for(int j=0;j<col;j++){  //kitne star honge
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
