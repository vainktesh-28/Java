package Java_arrays;

import java.util.Scanner;

public class questionarrays02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question number 2

        float [] num = new float [9];

        //Input for numbers

        System.out.println("Enter your 9 numbers");
        for(int i =0; i<num.length; i++){
            num[i] = sc.nextFloat();
        }

        //Sum of numbers

        float sum = 0;
        for(int i =0; i<num.length; i++){
            sum = sum+num[i];
        }
        System.out.println(sum);


    }
}
