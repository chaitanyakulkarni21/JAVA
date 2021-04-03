// Input three numbers and find the largest using nested if else

import java.util.Scanner;

class Largest{
  public static void main(String[] args){
    int n1,n2,n3,L;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    n3 = sc.nextInt();

    if(n1>n2){
      if(n1>n3){
        L = n1;
      } else {
        L = n3;
      }
    } else {
      if(n2>n3){
        L = n2;
      } else{
        L = n3;        
      }
    }
    System.out.println("Largest number is : " + L);        
  }
}