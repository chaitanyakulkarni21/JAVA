class Main{
  int a,b;
  static int sum(int x, int y){
    return x + y;
  }
  public static void main(String[] args){
    int s;
    Main obj = new Main();
    obj.a = 40;
    obj.b = 34;
    s = sum(obj.a, obj.b);
    System.out.println("Sum of the values of the two objects = " + s);
  }
}