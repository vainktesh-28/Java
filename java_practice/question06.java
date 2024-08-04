package java_practice;

import java.util.Scanner;

public class question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Triangle validity question
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c) {
            System.out.println("This is a triangle");
        } else {
            System.out.println("Not a triangle");
        }
    }
}
