//Addition of 2 arrays entered by the user

import java.util.Scanner;

public class ArrayAddition {

  public static void main(String[] args) {
    int n1, n2;
    int[] arr1 = new int[20];
    int[] arr2 = new int[20];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array 1: ");
    n1 = sc.nextInt();
    System.out.println("Enter array 1: ");

    for (int i = 0; i < n1; i++) {
      arr1[i] = sc.nextInt();
    }
    System.out.println("Enter the size of array 2: ");
    n2 = sc.nextInt();
    System.out.println("Enter array 2: ");
    for (int i = 0; i < n2; i++) {
      arr2[i] = sc.nextInt();
    }

    System.out.println("You entered the following arrays: ");
    System.out.println("Array 1: ");
    for (int i = 0; i < n1; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println("\n");

    System.out.println("Array 2: ");
    for (int i = 0; i < n2; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println("\n");

    int n3;
    int[] arr3 = new int[20];
    System.out.println("Enter size of arrays 3: ");
    n3 = sc.nextInt();
    for (int i = 0; i < n3; i++) {
      arr3[i] = arr1[i] + arr2[i];
    }
    System.out.println("Addition of the two arrays is : ");
    for (int i = 0; i < n3; i++) {
      System.out.print(arr3[i] + " ");
    }
  }
}
