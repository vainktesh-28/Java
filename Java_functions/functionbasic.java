package Java_functions;

import java.util.Scanner;

public class functionbasic {

    public static void PrintMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String name = sc.next();
        PrintMyName(name);
    }
}
