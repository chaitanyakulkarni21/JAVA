import java.util.Scanner;

class ArrayMultiplication{
  public static void main(String[] args){
    int [] arr1 = new int[20];
    int [] arr2 = new int[20];

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array 1: ");
    int n1 = sc.nextInt();

    System.out.println("Enter Array 1: ");
    for(int i=0;i<n1;i++){
      arr1[i] = sc.nextInt();
    }

    System.out.println("Enter the size of array 2: ");
    int n2 = sc.nextInt();

    System.out.println("Enter Array 2: ");
    for(int i=0;i<n2;i++){
      arr2[i] = sc.nextInt();
    }

    System.out.println("Array1: ");
    for(int i=0;i<n1;i++){
      System.out.print(arr1[i] + " ");
    }
    System.out.println(" ");
    System.out.println("Array2: ");
    for(int i=0;i<n2;i++){
      System.out.print(arr2[i] + " ");
    }
    System.out.println(" ");
    int n3;
    int [] arr3 = new int[20];

    System.out.println("Enter the size of array 3: ");
    n3 = sc.nextInt();

    System.out.println("Array Multiplication: ");
    for(int i=0;i<n3;i++){
      arr3[i] = arr1[i] * arr2[i];
    }
    System.out.println("Resulting Array : ");

    for(int i=0;i<n3;i++){
      System.out.print(arr3[i] + " ");
    }
  }
}