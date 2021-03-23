//Print the sum of n natural numbers using constructors

import java.util.Scanner;

public class SumofNaturalNos{
  int n;
  int s = 0;

  public SumofNaturalNos(int sum){
    s = sum; // Sum initialized to 0
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    SumofNaturalNos natnos = new SumofNaturalNos(0);
    System.out.println("Enter the nth term of the series : ");
    natnos.n = sc.nextInt();
    for(int i = 0; i<=natnos.n; i++){
      natnos.s = natnos.s+i;
    }
    System.out.println("Sum of " + natnos.n + " natural numbers : " + natnos.s);
  }
}