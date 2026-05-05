package basicJava;

import java.util.Scanner;

public class alternative {
    static void main(String[] args) {
        System.out.println("Enter the number of nth terms");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1,j=n ; i <=j ; i++ ,j--) {
        if(i==j){
            System.out.println(i+" ");
        }
        else{
            System.out.println(i+" "+j+" ");
        }
        }
    }
}
