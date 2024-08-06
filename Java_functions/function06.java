package Java_functions;

import java.util.Scanner;

public class function06 {

    public static int Average(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = Average(a, b, c);
        System.out.println(avg);


    }
}
