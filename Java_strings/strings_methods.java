package Java_strings;

public class strings_methods {
    public static void main(String[] args) {
        String name = "Vainktesh Singh";

        //Method 1 (converting to lower case)

        String lcase = name.toLowerCase();
        System.out.println(lcase);

        //Method 2 (Convering to Upper case)
        String ucase = name.toUpperCase();
        System.out.println(ucase);

        //Method 3 (Find the number of characters)
        int value = name.length();
        System.out.println(value);

        //Method 4 (Replacing a character )
        String rechar = name.replace('a', 'p');
        System.out.println(rechar);
    }
}
