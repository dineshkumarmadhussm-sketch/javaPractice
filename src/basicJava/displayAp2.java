package basicJava;

import java.util.Scanner;

public class displayAp2 {
   public static void main(String[] args) {
       System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
       int  a=99,b=-4;
       for(int i=1;i<=n;i++){
           System.out.println(a+" ");
           a=a+b;
       }
    }
}
