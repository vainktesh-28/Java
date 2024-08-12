package Java_functions;

public class functionparameter {
    public static void main(String[] args) {
        int cal = Sum(10, 200);
        System.out.println(cal);
    }

    static int Sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
