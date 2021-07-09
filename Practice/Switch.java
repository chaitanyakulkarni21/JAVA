// Input two numbers and peform the arithmetic operations using switch 

import java.util.Scanner;

class Switch{
  public static void main(String[] args){
    int n1,n2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    System.out.println("Which operation you want to perform ? Enter code between 1 to 4 : ");
    int code = sc.nextInt();

    switch(code){
      case 1: 
        System.out.println(n1 + "+" + n2 + "=" + n1+n2);
        break;
      
      case 2: 
        System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
        break;
      
      case 3:
        System.out.println(n1 + "*" + n2 + "=" + n1*n2);
        break;

      case 4: 
        System.out.println(n1 + "/" + n2 + "=" + n1/n2);
        break;
      
      default:
        System.out.println("Invalid code");
    }
  }
}