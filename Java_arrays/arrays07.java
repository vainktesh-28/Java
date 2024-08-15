package Java_arrays;
import java.util.Scanner;
public class arrays07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int cols =sc.nextInt();

        int[][] number = new int[rows][cols];

        //input loop

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                number[i][j] = sc.nextInt();
            }
        }

        //Finding a number x

        int x = sc.nextInt();

        //Loop for finding number x

        for(int i = 0; i<rows; i++){
            for(int j =0; j<cols; j++){
                if (number[i][j] == x) {
                    System.out.println("X found at (" + i + " " + j +")");
                    
                }
            }
        }


       
        


    }
}
