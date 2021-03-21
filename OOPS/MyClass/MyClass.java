class MyClass{
  int x = 60;
  public static void main(String[] args){
    MyClass myobj1 = new MyClass(); // New obj created...
    MyClass myobj2 = new MyClass();
    MyClass myobj3 = new MyClass();
    MyClass myobj4 = new MyClass();
    myobj1.x = 50;
    myobj2.x = 40;
    myobj3.x = 23;
    myobj4.x = 540;
    System.out.println(myobj1.x);
    System.out.println(myobj2.x);
    System.out.println(myobj3.x);
    System.out.println(myobj4.x);
  }
}