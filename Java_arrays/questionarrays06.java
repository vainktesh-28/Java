package Java_arrays;

import java.util.Scanner;

public class questionarrays06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i =0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i =0; i<marks.length; i++){
            sum = sum+marks[i];
        }
        System.out.println(sum);

        int average = sum/marks.length;
        System.out.println(average);
    }
}
