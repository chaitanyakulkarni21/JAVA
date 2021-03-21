abstract class Main{
  public String fname = "John";
  public int age = 24;
  public abstract void study();
}
//Subclass: Inherited from Main class 
class Student extends Main{
  public int graduationYear = 2016;
  public void study(){
    // This is the body of the abstract method from Main class
    System.out.println("Studying too long...");
  }
}