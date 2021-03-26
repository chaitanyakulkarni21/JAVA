import java.util.Scanner;

public class ArrayUserInput{
  public static void main(String[] args){
    int n;
    int[] array = new int[10];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    n = sc.nextInt();
    System.out.println("Enter the array of size " + n + " : ");
    for(int i=0;i<n;i++){
      array[i] = sc.nextInt();
    }

    System.out.println("Your entered array is : ");
    for(int i=0;i<n;i++){
      System.out.print(array[i] + " ");
    }
    System.out.println("\n");
  }
}