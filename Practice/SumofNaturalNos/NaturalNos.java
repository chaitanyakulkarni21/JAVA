import java.util.Scanner;

class NaturalNos {

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter last digit of the natural number series : ");
    n = sc.nextInt();
    int s = 0;
    for (int i = 0; i <= n; i++) {
      s = s + i;
    }
    System.out.println("Sum of first " + n + " Natural numbers : " + s);
  }
}
