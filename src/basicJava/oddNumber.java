package basicJava;

import java.util.Scanner;

public class oddNumber {
    static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);

        }
    }
}
