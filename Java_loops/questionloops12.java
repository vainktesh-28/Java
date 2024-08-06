package Java_loops;

import java.util.Scanner;

public class questionloops12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int factor = 1; 
        for(int i =n; i>=1; i--){

            factor = factor*i;
        }System.out.println(factor);
    }
}
