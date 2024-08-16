package Java_arrays;

import java.util.Scanner;

import Java_functions.marks;

public class question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter element of matrix");

        for(int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.print(matrix[rows][cols]);

           
            System.out.println("Enter the rows of second matrix");
            int row2 = sc.nextInt();

            System.out.println("Enter the column of second matrix");
            int col2 = sc.nextInt();

            int [][] matrix2 = new int[row2][col2];

            System.out.println("Enter the element of second matrix");

            for(int k = 0; k<row2; k++){
                for(int p =0; p<col2; p++){
                    matrix2[k][p] = sc.nextInt();
                }System.out.println(matrix2[row2][col2]);
            }

        }


    }
}
