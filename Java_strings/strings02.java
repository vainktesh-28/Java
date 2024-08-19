package Java_strings;

public class strings02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("vainktesh");

        for(int i=sb.length(); i<0; i--){
            System.out.println(i);
        }
    }
}
