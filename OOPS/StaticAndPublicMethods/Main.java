public class Main{
  // Static Method : Static method can be called without creating an object 
  static void myStaticMethod(){
    System.out.println("This is my Static Method...");
  }

  //Public Method : Public method is called by creating an object.
    static void myPublicMethod(){
    System.out.println("This is my Public Method...");
  }

  public static void main(String[] args){
    myStaticMethod(); // Called without creating an object 
    myPublicMethod();
    //Main publicObj = new Main();
    //publicObj.myPublicMethod();
  }
}