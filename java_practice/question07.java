package java_practice;

import java.util.Scanner;

public class question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Calculating BMI
        //weight = (Kg)
        //height = (m)

        double weight = sc.nextInt();
        double height = sc.nextInt();

        double BMI = weight/(height*height);


    }
}
