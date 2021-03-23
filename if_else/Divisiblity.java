// To check whether the entered number is divisible by 5 

import java.util.Scanner;

public class Divisiblity{
  int n;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Divisiblity div = new Divisiblity();
    System.out.println("Enter a number: ");
    div.n = sc.nextInt();
    if (div.n % 5 ==0){
      System.out.println(div.n + " is divisible by 5");
    } else{
      System.out.println(div.n + " is not divisible by 5");
    }
  }
}