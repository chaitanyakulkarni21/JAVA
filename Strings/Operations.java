
import java.util.Scanner;

class Operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String st = sc.nextLine();

        System.out.println("You Entered the following string: " + st);

        System.out.println("String in Upper Case : " + st.toUpperCase());
        System.out.println("String in Lower Case: " + st.toLowerCase());
        System.out.println("Length of the string: " + st.length());
    }
}
