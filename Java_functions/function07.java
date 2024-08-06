package Java_functions;

import java.util.Scanner;

public class function07 {

    public static void getGreater(int a, int b){

        if (a>b) {
           System.out.println("A is greater"); 
        }else{
            System.out.println("B is greater");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(getGreater(a,b));
    
    }
}
