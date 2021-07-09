//Printing 2-D array
public class Array2d {

  public static void main(String[] args) {
    int[][] my2dArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    for (int i = 0; i < my2dArray.length; i++) {
      for (int j = 0; j < my2dArray[i].length; j++) {
        System.out.print(my2dArray[i][j] + " ");
      }
      System.out.print("\n");
    }
  }
}
