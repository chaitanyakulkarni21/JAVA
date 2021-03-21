class Typecasting{
  public static void main(String[] args){
    int myInt = 49;
    double myDouble = myInt; // Automatic typecasting...

    int newInt = (int)myDouble;

    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(newInt); // Manual casting...
  }
}