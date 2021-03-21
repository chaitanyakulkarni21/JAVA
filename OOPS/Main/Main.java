class Main{
  int x = 5;
  int y;
  final int z = 30;
  public static void main(String[] args){
    Main myobj1 = new Main();
    System.out.println(myobj1.x);
    myobj1.x = 50;
    System.out.println(myobj1.x);
    myobj1.y = 20;
    System.out.println(myobj1.y);
   // myobj1.z = 33; Generates an error: Cannot assign a value to a final variable.
    System.out.println(myobj1.z);

    Main myobj2 = new Main();
    myobj2.x = 23;
    System.out.println("Value of x for object 1: " + myobj1.x);
    System.out.println("Value of x for object 2: " + myobj2.x);
  }
}
