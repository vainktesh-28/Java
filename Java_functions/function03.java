package Java_functions;

import java.util.Scanner;

public class function03 {

    public static int CalculateDivide(int a, int b){

        int div = a/b;
        return div;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int div = CalculateDivide(a, b);

        System.out.println(div);

    }
}
