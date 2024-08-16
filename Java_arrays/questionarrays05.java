package Java_arrays;

import java.util.Scanner;

public class questionarrays05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] number = new int[3];

        for(int i =0; i<number.length; i++){
            number[i] = sc.nextInt();   
        }

        //Finding the number x

        int x = sc.nextInt();

        for(int i =0; i<number.length; i++){
            if (number[i] == x) {
                System.out.println("Number found at " + i);  
            }
        }

    }
}
