//Printing a 2d array entered by the user 

import java.util.Scanner;

class ArrayUserInput2d{
  public static void main(String[] args){
    int row,col;
    int [][] arr = new int[3][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row-size of 2d array: ");
    row = sc.nextInt();
    System.out.println("Enter the col-size of 2d array: ");
    col = sc.nextInt();

    System.out.println("Enter the 2d array: ");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("Entered array is : ");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println(" ");
    }
  }
}