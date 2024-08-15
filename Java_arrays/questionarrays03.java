package Java_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class questionarrays03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] flats = new int[5];

        System.out.println("Enter the numbers");

        for(int i =0; i<flats.length; i++){
            flats[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(flats));


        //Linear search

        int x = sc.nextInt();

        for(int i=0; i<flats.length; i++){
            if (flats[i] == x) {
                System.out.println(i);
                
            }
        }

    }
}
