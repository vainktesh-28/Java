package Java_arrays;

import java.util.Scanner;

public class questionarrays01 {
    public static void main(String[] args) {
        
        //Question number 1
        Scanner sc = new Scanner(System.in);

        int [] numbers = new int[5];

        System.out.println("Enter 5 numbers");
        for(int i =0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();

        }

        int sum =0;

        for(int i =0; i<numbers.length; i++){
            sum = sum+numbers[i];
        }
        System.out.println( "The sum of numbers is " + sum);


    }
}
