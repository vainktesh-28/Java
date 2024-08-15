package Java_arrays;

public class arrays09 {
    public static void main(String[] args) {
        float[] numbers = {33.3f , 88.6f , 90.8f , 45.7f , 85.7f};

       float sum = 0;

       for(int i=0; i<numbers.length; i++){
        sum = sum+numbers[i];
       }
       System.out.println(sum);
    }
}
