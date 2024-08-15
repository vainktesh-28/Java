package Java_arrays;

import java.util.Scanner;

public class arrays05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[4];
        
        //Taking input using a loop

        System.out.println("Enter the marks");

        for(int i =0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        
        
        //Printing using loop
        System.out.println("Printing using loop");
        for(int i =0; i<=marks.length; i++){
            System.out.println(marks[i]);
        }

        //Printing in a reverse order
        System.out.println("Printing in a reverse order");
        for(int i =marks.length - 1; i>0; i--){
           System.out.println(marks[i]);
        }

        //Printing using for each loop
        System.out.println("Printing using for each loop");

        for(int element:marks){
            System.out.println(element);
        }


        }
    }

