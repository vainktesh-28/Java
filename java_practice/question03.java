package java_practice;

import java.util.Scanner;

public class question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year%4==0) {
            System.out.println("Leap year");
        }else{
            System.out.println("Non leap year");
        }
    }
}
