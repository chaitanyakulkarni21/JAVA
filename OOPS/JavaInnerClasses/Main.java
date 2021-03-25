class OuterClass{
  int x = 5;
  class InnerClass{
    int y = 8;
  }
}

class Main{
  public static void main(String[] args){
    OuterClass outerObj = new OuterClass(); // object of outer class is created...
    OuterClass.InnerClass innerObj = outerObj.new InnerClass(); // Object of inner class is created..
    // To create an object of inner class, first object of outer class needs to be created 

    System.out.println("Value of x in Outer Class: " + outerObj.x);
    System.out.println("Value of y in Inner Class: " + innerObj.y);
  }
}