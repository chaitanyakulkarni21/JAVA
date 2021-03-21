class ArithmeticOperations{
  int a,b;
  static int sum(int x, int y){
    return x + y;
  }
  static int difference(int x, int y){
    return x - y;
  }
  static int product(int x, int y){
    return x * y;
  }
  static int remainder(int x, int y){
    return x / y;
  }
  static int quotient(int x, int y){
    return x % y;
  }
  public static void main(String[] args){
    int s, d, p, r, q;
    Main obj = new Main();
    obj.a = 40;
    obj.b = 34;
    s = sum(obj.a, obj.b);
    d = difference(obj.a, obj.b);
    p = product(obj.a, obj.b);
    r = remainder(obj.a, obj.b);
    q = quotient(obj.a , obj.b);
    
    System.out.println("\nSum of the values of the two objects = " + s);
    System.out.println("Difference of the values of the two objects = " + d);
    System.out.println("Product of the values of the two objects = " + p);
    System.out.println("Remainder of the values of the two objects = " + r);
    System.out.println("Quotient of the values of the two objects = " + q);
  }
}