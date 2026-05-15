package Array;

import java.util.Scanner;

public class printNegativeArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter  integers:");
        for(int i = 0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }

        for(int i = 0;i< arr.length;i++){
            if(arr[i]<0){
                System.out.println("your negative Element ..."+arr[i]);
            }
        }
    }
}
