import java.util.Scanner;

class PositiveOrNegative {

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    if (n > 0) {
      System.out.println(n + " is positive");
    } else if (n < 0) {
      System.out.println(n + " is negative");
    } else {
      System.out.println(n + " is zero");
    }
  }
}
