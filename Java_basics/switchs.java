import java.beans.DefaultPersistenceDelegate;
import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("you are an adult");
                break;

            case 23:
                System.out.println("You will join job");
                break;

            case 60:
                System.out.println("You will retire");

                break;

            default :
            System.out.println("Enjoy your life");    
        }
    }

}
