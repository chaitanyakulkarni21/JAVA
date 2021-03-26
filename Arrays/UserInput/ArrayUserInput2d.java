import java.util.Scanner;

class ArrayUserInput2d{
  public static void main(String[] args){
    int row,col;
    int [][] arr = new int[5][5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of 2d array: ");
    n = sc.nextInt();
    for(int i=0;i<row.length;i++){
      for(int j=0;j<row[i].length;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("Entered array is : ");
    for(int i=0;i<row.length;i++){
      for(int j=0;j<row[i].length;j++){
        System.out.print(arr[i][j]);
      }
      System.out.println("\n");
    }
  }
}