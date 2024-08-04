package java_practice;

import java.util.Scanner;

public class question08 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        if (a>b) {
            System.out.println("A is bigger");
        }else{
            System.out.println("B is bigger");
        }
    }
}
