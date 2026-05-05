package basicJava;

import java.util.Scanner;

public class displayGp {
    public static void main( String[] args){
        System.out.println("Enter the number of nth term");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= 1,r=2;
        for (int i = 1; i <+n ; i++) {
            System.out.println(a+" ");
            a*=r;
        }
    }
}
