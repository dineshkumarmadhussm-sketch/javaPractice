//print sum of digit of anumber
package basicJava;

import java.util.Scanner;

public class sumOfDigit {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       System.out.println("enter a number");
       int n = input.nextInt();
       if(n<0)n=-n;
       int sum =0;

       while(n!=0){
           sum+=n%10;
         n/=10;

       }
       System.out.println(sum );
    }
}
