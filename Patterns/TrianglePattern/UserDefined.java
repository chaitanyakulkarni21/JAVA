import java.util.Scanner;

// Print the left alligned triangle of user defined stars

class UserDefined {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
    System.out.print("Enter size: ");
    size = sc.nextInt();

    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
