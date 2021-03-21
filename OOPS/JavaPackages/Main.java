import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    String name;
    System.out.println("Enter your name: ");
    name = myObj.nextLine();
    System.out.println("My name is : " + name);
  }
}