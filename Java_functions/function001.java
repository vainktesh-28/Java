package Java_functions;
import java.util.*;

public class function001 {
    public static void main(String[] args) {
       int cal = twosum();
       System.out.println(cal);
    }

    static int twosum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        return sum;
    }
}
