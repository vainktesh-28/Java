package Java_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class questionarrays04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[5];

        System.out.println("Enter the Names");
        for(int i=0; i<name.length; i++){
            name[i] = sc.nextLine();
        }

        for(int i =0; i<name.length; i++){
            System.out.println(name[i]);
        }
    }
}
