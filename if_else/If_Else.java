class If_Else{
  public static void main(String[] args){
    int x = 6;
    int y = 5;
    if(x > y){
      System.out.println(x + " is greater");
    } else{
      System.out.println(y + " is greater");
    }
    int time = 22;
    if (time < 10){
      System.out.println("\nGood Morning!!!");
    } else if (time < 20){
      System.out.println("\nGood Day!!!");
    } else{
      System.out.println("\nGood Evening!!!");
    }
    System.out.println("\nUsing Ternary Operators: ");
    String result = (time < 18) ? "Good Day" : "Good Evening";
    System.out.println(result);
  }
}