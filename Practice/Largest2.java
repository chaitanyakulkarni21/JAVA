// Largest of three numbers using if else and logical operators

import java.util.Scanner;

class Largest2{
  public static void main(String[] args){
    int n1,n2,n3,L;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    n3 = sc.nextInt();

    if(n1>n2 && n1>n3){
      L = n1;
    } else if(n2>n1 && n2>n3){
      L = n2;
    } else{
      L = n3;
    }
    System.out.println("Largest number is " + L);
  }
}