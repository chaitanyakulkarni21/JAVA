class Arrays{
  public static void main(String[] args){
    String[] cars = {"Volvo","BMW","Mazda","Ferrari"};
    for(int i=0 ; i < cars.length; i++){
      System.out.println(cars[i]);
    }

    int[] numArray = {1,2,3,3,4,5};
    for(int i=0; i < numArray.length; i++){
      System.out.println(numArray[i]);
    }

    System.out.println("2D Arrays: \n");
    int[][] arr2d ={{1,2,3,4}, {5,6,7,8}};
    for(int i = 0; i < arr2d.length; i++){
      for(int j = 0; j<arr2d[i].length;j++){
        System.out.println(arr2d[i][j]);
      }
    } 
  }
}