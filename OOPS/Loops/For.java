//Print the sum of n natural numbers

import java.util.Scanner;

public class For{
  int n;
  int s = 0;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    For sum = new For();
    System.out.println("Enter the nth term of the series : ");
    sum.n = sc.nextInt();
    for(int i = 0; i<=sum.n; i++){
      sum.s = sum.s+i;
    }
    System.out.println("Sum of " + sum.n + " natural numbers : " + sum.s);
  }
}