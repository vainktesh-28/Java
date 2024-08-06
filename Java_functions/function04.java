package Java_functions;

import java.util.Scanner;

public class function04 {

    public static int Factorial(int n){

        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return factorial;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial= Factorial(n);

    }
}
