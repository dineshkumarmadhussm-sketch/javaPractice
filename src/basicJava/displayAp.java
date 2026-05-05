package basicJava;

import java.util.Scanner;

public class displayAp {
    static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int   a=2,d=3;
        for (int i = 1; i<=n; i+=3) {
            System.out.println(a+" ");
            a+=d;
        }
    }
}
