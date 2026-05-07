package methods;

import java.util.Scanner;

public class maximumNumber {
    static void max(int a, int b, int c) {
        if(a>=b && a>=c){
            System.out.println("Maximum number is "+a);
        }
        else if(b>=a && b>=c){
            System.out.println("Maximum number is "+b);
        }
        else{
            System.out.println("Maximum number is "+c);
        }

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max(a,b,c);
    }
}
