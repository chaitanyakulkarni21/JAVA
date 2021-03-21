import java.util.Scanner;

class Marks{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  int m1,m2,m3,m4,m5;
  String name;
  System.out.println("Enter name of Student: ");
  name = sc.nextLine();
  System.out.println("Enter marks in 5 subjects : ");
  m1 = sc.nextInt();
  m2 = sc.nextInt();
  m3 = sc.nextInt();
  m4 = sc.nextInt();
  m5 = sc.nextInt();

  float avg = (m1 + m2 + m3 + m4 + m5) / 5;

  System.out.println("\nStudent Result: ");
  System.out.println("Student Name : "+ name);
  System.out.println("Marks in Subject 1: " + m1);
  System.out.println("Marks in Subject 2: " + m2);
  System.out.println("Marks in Subject 3: " + m3);
  System.out.println("Marks in Subject 4: " + m4);
  System.out.println("Marks in Subject 5: " + m5);
  System.out.println("Average: " + avg);
  }
}