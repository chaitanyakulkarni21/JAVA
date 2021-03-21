class Maths{
  public static void main(String[] args){
    System.out.println("\nMax and Min values: ");
    System.out.println("The max value is " + Math.max(5,10));
    System.out.println("The min value is " + Math.min(5,10));
    System.out.println("\nAbsolute Value: ");
    double x = -45.99;
    System.out.println("The absolute value : " + Math.abs(x));
    System.out.println("\nSquare Root: ");
    int y = 81;
    System.out.println("The square root of " + y + ": " + Math.sqrt(y));
    System.out.println("\nGenerating random number: ");
    System.out.println(Math.random());
    System.out.println("\nTo generate a random number between 0 to 100: ");
    int randomInt = (int)(Math.random() * 101);
    System.out.println("Random number between 0 to 100: " + randomInt);
  }
}