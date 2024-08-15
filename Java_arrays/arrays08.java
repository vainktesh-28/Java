package Java_arrays;

import java.util.Scanner;

public class arrays08 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter number of rows");
       int rows  = sc.nextInt();
       
       System.out.println("Enter number of columns");
       int cols = sc.nextInt();

       
       int[][] marks = new int[rows][cols];

       //Input loop

       System.out.println("Enter the marks");
       for(int i = 0; i <rows; i++){
        for(int j = 0; j<cols; j++){
            marks[i][j] = sc.nextInt();
        }
       }

       //Output loop

       for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            System.out.print(marks[i][j] );
        }
        System.out.println( " ");
       }
    }
}
