 package Java_arrays;

import java.util.Scanner;

public class arrays03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int arr[] = new int[5];

        // Loop for taking input //
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt(); 
        }

        //loop for output//
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]); 
        }
    }
}