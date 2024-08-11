package Java_arrays;

import java.util.Scanner;

public class arrays04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str[] = new String[5];

        //input loop//

        for(int i = 0; i<str.length; i++){
            str[i] = sc.next();
        }

        //output loop//

        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }




    }
}
