package Java_arrays;

import java.util.Scanner;

public class arrays06 {
    public static void main(String[] args) {
        int age [] = new int[5];
        Scanner sc = new Scanner(System.in);

        //Taking input using loop

        System.out.println("Enter the age");
        for(int i =0; i<age.length; i++){
            age[i] = sc.nextInt();
        }

        //Printing using another loop

        System.out.println("Printing age");
        for(int i =0; i<=age.length; i++){
            System.out.println(age[i]);
        }
    }
}
