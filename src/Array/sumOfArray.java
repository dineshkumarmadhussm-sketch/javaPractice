package Array;

import java.util.Scanner;

public class sumOfArray {
    static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter  integers:");
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {

            sum += j;
        }
        System.out.println(sum);
    }
}
