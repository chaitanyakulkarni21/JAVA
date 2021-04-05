// Input three numbers and find the largest using if else and logical operators

import java.util.Scanner;

class Largest1{
  
  public static void main(String[] args){
    int n1,n2,n3,L;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Three numbers: ");
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    n3 = sc.nextInt();
    L = n1>n2 ? (n1>n3 ? n1:n3) : (n2>n3 ? n2 : n3);
    System.out.println("Largest number is " + L);
  }
}