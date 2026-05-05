//count digit of a number
package basicJava;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number" );
        int n=input.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
