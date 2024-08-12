package Java_functions;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int max_marks = 500;

        int Total_marks = sub1+sub2+sub3+sub4+sub5;

        int percentage = Total_marks/max_marks*100;
        System.out.println(percentage);
    }
}
