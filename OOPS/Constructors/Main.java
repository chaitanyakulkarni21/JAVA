class Main{
  int x;
  public Main(){
    x = 5;  //This is a constructor that initializes variable x to 5
  }

  public static void main(String[] args){
    Main obj = new Main(); // Creating an object. This will call the constructor Main() and initialize x = 5
    System.out.println("Value of x is : "+ obj.x);
  }
}